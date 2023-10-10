

#Introduction

<a name="_page2_x63.64_y63.16"></a>Group chatting application Communicator is an android application. That will help to communicate with many of people by using this android application. This application provide user friendly interface where user interaction will be smooth. If the user send their message it will be broadcast to every user and every user can read this message. Also they can direct message to others users.


#Features:

1. User can send message directly to the others user.
1. No ads on the application..
1. User friendly user interface..
1. Data safety and provide security.
1. Easy to navigate.
   
#Socket<a name="_page4_x63.64_y63.16"></a> & ServerSocket

This class implements server sockets. A server socket waits for requests to come in over the network. It performs some operation based on that request, and then possibly returns a result to the requester.

Creates a server socket, bound to the specified port. A port number of 0 means that the port number is automatically allocated, typically from an ephemeral port range. This port number can then be retrieved by calling getLocalPort. The maximum queue length for incoming connection indications (a request to connect) is set to 50. If a connection indication arrives when the queue is full, the connection is refused. Socket are the pre-build class which provided by Java

#BufferReader<a name="_page4_x63.64_y231.90"></a> & BufferWriter

Java BufferedWriter class is used to provide buffering for Writer instances. It makes the performance fast. It inherits Writer class. The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.

BufferReder reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines. The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.

1. BufferWriter allows us to send the data one user to another.
1. BufferReader allows us to get data from client as well as server.
1. Encrypt data for further security. For more security, encryption and decryption ser- vices are offered. Message expansion and compression are simplified to guarantee that communications pass efficiently from one user to another.
1. Socket and BufferReader used TCP connection to make communicate with each other here TCP control the flow of the data and stream will allow to get data from the stream.
   3 Analysis<a name="_page4_x63.64_y532.77"></a> Design and Development
1. Requirement<a name="_page4_x63.64_y569.87"></a> Gathering Technique Functional Requirements

In nowadays we are used so many social media application and it’s hard to take over the market. To get huge portion of the market we have need good requirements and execution


2. Data<a name="_page6_x63.64_y63.16"></a> Flow Diagram

A data flow diagram is a graphical representation of system needs. It specifies the data flow the procedure, and the storage location.

![](documentation/Aspose.Words.0fc37968-a019-4bac-b106-05821f43c87b.004.png)

Figure 2: DFD of Communicator

Data Flow:

1. Server receives request from client with user name and the socket of the client. And it will process the client and broadcast the message to all the users.
1. Client receives the username and socket from android application and client will send to the server.
1. After that the server send the response to the client and client send the broadcast message to the android application.
1. The user receives the message and android activity will show the message on the UI.
1. Class<a name="_page7_x63.64_y63.16"></a> Diagram

In this application we are followed the class diagram where we used client, server and clien- thandler class. Each class have some private and public attributes which will access from one to another class by inherit and by creating instance of the classes.

![](documentation/Aspose.Words.0fc37968-a019-4bac-b106-05821f43c87b.005.png)

Figure 3: Class Diagram

Data Flow:

4 Implementation<a name="_page7_x63.64_y473.37"></a> Of the Project

1. User<a name="_page7_x63.64_y510.47"></a> Interface

To build user interface we are concerned about simple and minimalist and user centered design which will help to the users to use outer application. We are used Linear , Relative and Absolute Layout to make this user interface

1. Onboard<a name="_page7_x63.64_y595.17"></a> Screen

In this screen user’s have two options continue and signup button if they preesed on the continue button application will navigate to login page other hand if they clicked on the signup button then application will turn over to the signup page where user can signup and make communicate with their friends.

![](documentation/Words.0fc37968-a019-4bac-b106-05821f43c87b.006.png)

Figure 4: Onboard Screen

2. Login<a name="_page8_x63.64_y513.10"></a> Signup Screen

In this screen application will provide continue with google if user pressed on this button application will authenticate the users and application navigate to the dashboard screen where user can find some option to make communicate.

3. Dashboard<a name="_page8_x63.64_y607.29"></a> Screen

Dashboard screen have one button over here that is new group if user clicked on it the application will naviagte the user to the chat screen where user can text to others users.

![](documentation/Words.0fc37968-a019-4bac-b106-05821f43c87b.007.png)

Figure 5: Login Signup Screen

4. Chat<a name="_page9_x63.64_y495.70"></a> Screen

This screen will responsible for the user interaction here application will show the chat list where user can find the all messages as well as they can sent a message to the group. This screen provide input field and send button to the user for sending the message.

![](documentation/Words.0fc37968-a019-4bac-b106-05821f43c87b.008.png)

Figure 6: User Dashboard Screen

2. User<a name="_page10_x63.64_y377.24"></a> Authentication Functionality

Our Project is mostly implemented on Java and Android Studio.

here we can see the first floor of our project. it is the management floor of out system. here we can see bufferReader read the newest data from the stream and after that users give message catch the message as string and write to bufferWriter which will send to the server.

![](documentation/Aspose.Words.0fc37968-a019-4bac-b106-05821f43c87b.009.png)

Figure 7: Chat Screen

1. Results

<a name="_page12_x63.64_y589.08"></a>If we run the server side it able to take request from the client and when client run the application then they connected with the server and they can communicate with each others. If we run the our android application user will landed to the onboard screen of the application Figure 3 and after login application will turn over the dashboard screen and after clicking the new group button application will navigate to the chat screen where user can see all of the messages and they can send the message by filling the message field and clicking the send button then the message will be send to others users.

![ref1]

Figure 10: Login system of Communicator

![](documentation/Aspose.Words.0fc37968-a019-4bac-b106-05821f43c87b.012.png)

Figure 11: Server side of the Communicator
