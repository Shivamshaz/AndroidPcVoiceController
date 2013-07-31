AndroidPcVoiceController
========================

APVC is a client server networking project, The connection is setup between the client in the android application
and server on the PC. After inputting the authentication key set by the the serverver user,on the client app, a list
of menus is opened in both server and client screen. User can select particular command from the menu and execute 
it by giving  the voice inputs on the application. The corresponding functionality is performed on the pc.

Usage
=====

This application can be used to:
* Open almost all application on the Laptop or Copmputer with the help of Vocie inputs on the android phone.
* Efficient and fast automatic text typing in the documents by speaking the content on the phone.
* Operating any applciation with the help of phone.
* Browsing the internet, openeing the browser, entering a specific website and surfing further.
* Chatting and log creation in case of multiple clients.

INSTALL AND RUN
===============

Server:
-------
* Import the project named "server" in eclipse. 
* Run the java class "server1.java", Run it as Java Application .
* A JavaFrame will open. Click on "Run Server" button.
* Set the "Authentication Key" in the text box.

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

Requirements
============

Run
---
Wifi Connection, Pc, Android phone.

Code
----
* JDK (1.5 or above).
* Android Phone or SDK version 2.2 or above.
* Eclipe(optional) to run java.

List Of Commands
================

* Open Notepad
* Open Music Folder
* Open Video Folder
* Open Browser
* Open Calculator
* Open Command Prompt
* Play Audio Or Video
* Open Word Pad
* Set Volume
* Open Paint
* Sticky Notes
* Open Microsoft Access
* Open Microsoft Outlook
* Open Microsoft Power Point
* Open Microsoft Word
* Open Note
* Open Excel
* Open Picasa
* Shut Down

Note: Some commands are universal like "open notepad/open microsoft word/open powerpoint/open paint/
shutdown/open command prompt/open outlook/open Excel/open wordpad/open note/open calculator". You do 
need to change the paths in the server file. However for soma commands like "open browser/open music folder/
open video folder/open picasa", you need to update the specific pathsof the corresponding applications in the server 
file (RunnableClass.java).
  for music and audio files, change the names and paths of specific audio or video files in the file. 

