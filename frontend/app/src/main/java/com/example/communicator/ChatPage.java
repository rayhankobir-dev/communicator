package com.example.communicator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class ChatPage extends AppCompatActivity {
    TextView nameText, profileImage, bigProfileImage;
    EditText meesageField;
    Button sendBtn;
    ListView demoListView;
    LinearLayout root;

    Bitmap b;
    ImageView img;

    ArrayList<String> messages = new ArrayList<String>();
    ArrayAdapter<String> adapter;


    private FirebaseAuth auth;
    GoogleSignInOptions googleSignInOptions;
    GoogleSignInClient googleSignInClient;

    String name, email;


    Socket socket;
    BufferedWriter bufferedWriter;
    BufferedReader bufferedReader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_page);

        nameText = (TextView) findViewById(R.id.nameText);
        profileImage = (TextView) findViewById(R.id.profileImage);
        bigProfileImage = (TextView) findViewById(R.id.bigProfileImage);

        sendBtn = (Button) findViewById(R.id.sendBtn);
        meesageField = (EditText) findViewById(R.id.meesageField);
        root = (LinearLayout) findViewById(R.id.root);


        auth = FirebaseAuth.getInstance();
        googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        googleSignInClient = GoogleSignIn.getClient(this, googleSignInOptions);
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        if(account != null) {
            name = account.getDisplayName();
            email = account.getEmail();

            nameText.setText(name);
            profileImage.setText(email);


            demoListView = (ListView) findViewById(R.id.demoListView);

            adapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, messages);
            demoListView.setAdapter(adapter);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        socket = new Socket("192.168.1.105", 5000);
                        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                while (socket.isConnected()) {
                                    try {
                                        String newMsg = bufferedReader.readLine();
                                        if(newMsg != null) {
                                            messages.add(newMsg);
                                            adapter.notifyDataSetChanged();
                                        }
                                    }catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        }).start();


                        sendMessage();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();


            meesageField.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    adapter.notifyDataSetChanged();
                }
            });

            root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    adapter.notifyDataSetChanged();
                }
            });

        }
    }

    public void sendMessage() {
        try {
            bufferedWriter.write(name);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            while (socket.isConnected()) {


                sendBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            new Thread(new Runnable() {
                                @Override
                                public void run() {
                                    try {
                                        bufferedWriter.write(name + ": " + meesageField.getText().toString());
                                        bufferedWriter.newLine();
                                        bufferedWriter.flush();
                                        messages.add(meesageField.getText().toString());
                                        adapter.notifyDataSetChanged();

                                    }catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }).start();

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });

            }
        }catch (IOException e) {
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        try {
            if(bufferedReader != null) {
                bufferedReader.close();
            }

            if(bufferedWriter != null) {
                bufferedWriter.close();
            }

            if(socket != null) {
                socket.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listenFromMessage() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String messageFromGroupChat;

                while (socket.isConnected()) {
                    try {
                        messageFromGroupChat = bufferedReader.readLine();
                        messages.add(messageFromGroupChat);
                        adapter.notifyDataSetChanged();

                    }catch (IOException e) {
                        closeEverything(socket, bufferedReader, bufferedWriter);
                    }
                }
            }
        }).start();
    }





    public static Drawable LoadImageFromWebOperations(String url) {
        try {
            InputStream is = (InputStream) new URL(url).getContent();
            Drawable d = Drawable.createFromStream(is, null);
            return d;
        } catch (Exception e) {
            return null;
        }
    }
}