AndroidPcVoiceController
========================

APVC is a client server networking project, The connection is setup between the client in the android application
and server on the PC. After inputting the authentication key set by the the serverver user,on the client app, a list
of menus is opened in both server and client screen. User can select particular command from the menu and execute 
it by giving  the voice inputs on the application. The corresponding functionality is performed on the pc.

INSTALL
=======

Server:
-------
* Import the project named "server" in eclipse (any version) 
* Run the java class "server1.java", Run it as Java Application .
* A JavaFrame will open. Click on "Run Server" button.
* Set thr "Authenticated Key" in the text box.

Client:
-------

* Copy the "voiceold2.apk" from location "Voiceold/bin" and paste it into any folder in memory card of
  your Android Phone.
* Install this application by clicking on "voiceold2.apk" as shown in memory card in phone.
* Run the application named "APVC" displayed in application menu of your Android Phone.
* Enter the IP address shown by the server on PC , in the text box of application.
* Enter the "Authenticated Key" as shown by the server in the textbox of application.
* Click on the Button on top of the screen to input the voice commands.
* Speak any command from the list of commands like "Open Notepad , Open Music Folder etc".
