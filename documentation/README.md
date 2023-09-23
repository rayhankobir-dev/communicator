![](documentation/Aspose.Words.0fc37968-a019-4bac-b106-05821f43c87b.001.png)

Green University of Bangladesh

Department of Computer Science & Engineering Faculty of Sciences & Engineering

Semester: (Fall, Year: 2022), B.Sc. in CSE (Day)

Project Report

Course Title: Computer Networking Lab

Course Code: CSE 312 Section: DB

Project Name: Group Chatting Android

Application(Communicator).

Student Details

| Name         | ID           |
| ------------ | ------------ |
| Rayhan Kobir | \*\*\*\*\*\* |
|              |              |

Submission Date: January 07, 2023 Course Teacher’s Name: Rusmita Halim Chaity

[For Teacher’s use only: Don’t write anything in this box.]

Lab Report Status![](documentation/Aspose.Words.0fc37968-a019-4bac-b106-05821f43c87b.002.png)

Marks: ............... Signature: .................... Comments: .................... Date: .............................

Contents

[1 Introduction](#_page2_x63.64_y63.16) 3

1. [Aim of the project ](#_page2_x63.64_y178.23). . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 3
1. [Objective ](#_page2_x63.64_y438.30). . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 3

[2 Methodology](#_page2_x63.64_y618.46) 3

1. [Socket & ServerSocket ](#_page4_x63.64_y63.16). . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 5
1. [BufferReader & BufferWriter .](#_page4_x63.64_y231.90) . . . . . . . . . . . . . . . . . . . . . . . . . . 5

[3 Analysis Design and Development](#_page4_x63.64_y532.77) 5

1. [Requirement Gathering Technique . ](#_page4_x63.64_y569.87). . . . . . . . . . . . . . . . . . . . . . . 5
1. [Data Flow Diagram .](#_page6_x63.64_y63.16) . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 7
1. [Class Diagram ](#_page7_x63.64_y63.16). . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 8

[4 Implementation Of the Project](#_page7_x63.64_y473.37) 8

1. [User Interface ](#_page7_x63.64_y510.47). . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 8
1. [Onboard Screen ](#_page7_x63.64_y595.17). . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 8
1. [Login Signup Screen ](#_page8_x63.64_y513.10). . . . . . . . . . . . . . . . . . . . . . . . . . . 9
1. [Dashboard Screen .](#_page8_x63.64_y607.29) . . . . . . . . . . . . . . . . . . . . . . . . . . . . 9
1. [Chat Screen ](#_page9_x63.64_y495.70). . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 10
1. [User Authentication Functionality .](#_page10_x63.64_y377.24) . . . . . . . . . . . . . . . . . . . . . . 11 [5 Results & Analysis](#_page12_x63.64_y505.22) 13
1. [Results ](#_page12_x63.64_y589.08). . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 13
1. [Analysis ](#_page13_x63.64_y536.76). . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . 14

[6 Performance](#_page13_x63.64_y677.90) 14 [7 Limitation](#_page14_x63.64_y675.34) 15 [8 Future Scope](#_page15_x63.64_y314.63) 16 [9 Complex Engineering Problems that occurred ](#_page15_x63.64_y481.97)16

1 Introduction

<a name="_page2_x63.64_y63.16"></a>Group chatting application Communicator is an android application. That will help to communicate with many of people by using this android application. This application provide user friendly interface where user interaction will be smooth. If the user send their message it will be broadcast to every user and every user can read this message. Also they can direct message to others users..

1. Aim<a name="_page2_x63.64_y178.23"></a> of the project

Nowadays, everyone wants connect together and make communication with each other’s. At this time, if we are talking about the social media application we will found lots of social media application, where people spent lots of time to watch ads and we sometimes hear about information leak. At this point of view many company force/discouraged their employee to use external messaging application instead they encourage to use their own messaging application to make prevent their data/information leak. Considering all these things we are building this application to keep in touch with our friends. In this time maximum people are using android phone that reason we decided to make as android application. Our application shall provide the following features:

1. Prevent data/information leak.
1. Establish a communication between many of peoples.
1. User make group and when anyone send message in the group every group members will received the message..
1. Objective

<a name="_page2_x63.64_y438.30"></a>The main objectives of this project are:

1. User can send message directly to the others user.
1. No ads on the application..
1. User friendly user interface..
1. Data safety and provide security.
1. Easy to navigate.
   2 Methodology

<a name="_page2_x63.64_y618.46"></a>In this application we are used Agile Model to build our application. Our application is user based multiple users are connected with our application. So we have to changed our requirements frequently that’s why this agile model is good fit for our application. Another reason to chose agile that is agile is good for mobile application it’s provide us to build ideal application by using iterative and incremental process.

![]documentation/Aspose.Words.0fc37968-a019-4bac-b106-05821f43c87b.003.png)

Figure 1: Agile Model

1. Socket<a name="_page4_x63.64_y63.16"></a> & ServerSocket

This class implements server sockets. A server socket waits for requests to come in over the network. It performs some operation based on that request, and then possibly returns a result to the requester.

Creates a server socket, bound to the specified port. A port number of 0 means that the port number is automatically allocated, typically from an ephemeral port range. This port number can then be retrieved by calling getLocalPort. The maximum queue length for incoming connection indications (a request to connect) is set to 50. If a connection indication arrives when the queue is full, the connection is refused. Socket are the pre-build class which provided by Java

2. BufferReader<a name="_page4_x63.64_y231.90"></a> & BufferWriter

Java BufferedWriter class is used to provide buffering for Writer instances. It makes the performance fast. It inherits Writer class. The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.

BufferReder reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines. The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.

1. BufferWriter allows us to send the data one user to another.
1. BufferReader allows us to get data from client as well as server.
1. Encrypt data for further security. For more security, encryption and decryption ser- vices are offered. Message expansion and compression are simplified to guarantee that communications pass efficiently from one user to another.
1. Socket and BufferReader used TCP connection to make communicate with each other here TCP control the flow of the data and stream will allow to get data from the stream.
   3 Analysis<a name="_page4_x63.64_y532.77"></a> Design and Development
1. Requirement<a name="_page4_x63.64_y569.87"></a> Gathering Technique Functional Requirements

In nowadays we are used so many social media application and it’s hard to take over the market. To get huge portion of the market we have need good requirements and execution

Analysis of the Requirement

The specifications for the system are the descriptions of the activities and constraints, and the process of discovering, evaluating, documenting, and testing these products and constraints is known as requirements engineering. Both software and hardware requirements for our project are listed below.

1. Hardware Requirements: To host the server of the communicator, It’s required at-least 2 GB RAM, enough hard-drive space and internet connection.
1. Software Requirements:

This following software we have used to implement our project-

1. Windows 8 or
1. Windows 10 platform.
1. Android OS.
1. Minimum API level 29
1. Minimum 2 GB RAM
1. Server.
1. Android OS

3) Android (OS):

To run our client users need the Android OS

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

![](documentation/Words.0fc37968-a019-4bac-b106-05821f43c87b.009.png)

Figure 7: Chat Screen

here we use Google Authentication for the login and sign up both after the login the application will navigate to dashboard page of the communicator.

![](documentation/Words.0fc37968-a019-4bac-b106-05821f43c87b.010.png)

Figure 8: Chatting features of communicator

![ref1]

Figure 9: Message sending features

5 Results<a name="_page12_x63.64_y505.22"></a> & Analysis

Communicator have server side and client side. Users are interact with the client side which is Android Application.

1. Results

<a name="_page12_x63.64_y589.08"></a>If we run the server side it able to take request from the client and when client run the application then they connected with the server and they can communicate with each others. If we run the our android application user will landed to the onboard screen of the application Figure 3 and after login application will turn over the dashboard screen and after clicking the new group button application will navigate to the chat screen where user can see all of the messages and they can send the message by filling the message field and clicking the send button then the message will be send to others users.

![ref1]

Figure 10: Login system of Communicator

![](documentation/Words.0fc37968-a019-4bac-b106-05821f43c87b.012.png)

Figure 11: Server side of the Communicator

2. Analysis

<a name="_page13_x63.64_y536.76"></a>When the application is run by the user, then the application will provide our application UI and they can able to interact with the UI and they have to login to make communication with other group members. If any user send the message in the group then application will broadcast to others users and application shows the messages on users chat screen they able to see it and they will send a message also. If any user come to the group server will notify that new users in the chat as well as when user leaves from the group everyone notified that user has leave from the group.

6 Performance

<a name="_page13_x63.64_y677.90"></a>Communicator is a mobile application and performance is the most important part of the application. We have to consider memory, network, cpu and others things. In this below

![](documentation/Words.0fc37968-a019-4bac-b106-05821f43c87b.013.png)

Figure 12: Client Chat Screen

figure we provided here the application consume the 124 MB which is quite good for us and users.

![](documentation/Words.0fc37968-a019-4bac-b106-05821f43c87b.014.png)

When the application is run by the user then the application consume high energy at this above performance evaluation when main activity comes to run application consume high energy the it’s release the energy if the any activity runs on the screen then it’s consume less energy.

If we .

7 Limitation

- <a name="_page14_x63.64_y675.34"></a>We are added most of the features which we needed also we faced some limitations:

* We can’t delete the message if we sent once.
* Any updates to the functionality of the Application Software
* Older versions do not work with current features.

- If so many users attempt so connect it’s possible to crash our server.
- If user exit from the chat room they will lose their older message.
- Not able to prevent hacking or spamming.
- This application is OS depended.
- Performance can be optimized.
- All hardware device updates, equipment re-deployments, and policy modifications must be done with the customer’s mutual permission, depending on the impact on the overall security environment and network performance.
- Security can be handled more effectively.
  8 Future<a name="_page15_x63.64_y314.63"></a> Scope

There is a vast future scope of this Network. This Design can be improved and add more features e.g: user can direct message to anyone, user can able to share file and images, video call through WebRTC then it can be used as social media or internal company communication medium. If the limitations present in this Design are removed then, this this application will become very reliable and provide 100 percent up time.

If we added our application to the google play store then, Everyone can easily find and download our application and they can use it. In future if we added the ads revenue model in our application it we can make money from it.

9 Complex<a name="_page15_x63.64_y481.97"></a> Engineering Problems that occurred

| Complex Engineering Problems |                             |                                                                                 |
| ---------------------------- | :-------------------------- | :------------------------------------------------------------------------------ |
| No                           | Name of the WP Attribute    | Explain how you addressed this attribute                                        |
| WP1                          | Depth of Knowledge Required | Knowledge is required to UI de- sign of the system                              |
| WP2                          | Depth of analysis required  | Analysis of the data is required to get a reliable output                       |
| WP3                          | Familiarity of issues       | There have many of social media application this is the limitations our project |

16

[ref1]: Aspose.Words.0fc37968-a019-4bac-b106-05821f43c87b.011.png
