import java.awt.Desktop;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class RunnableClass implements Runnable{

public String s2,s1="default";
public int flag=0;
public int port;
public static String strings1;

public void sendst(String c){
this.strings1=c
}

public void run(){
	DataInputStream dataInputStream=null;
	ServerSocket listener=null;
	try{
		port=8888;
		listener=new ServerSocket(port);
	}
	catch(IOException e)
	{
	e.printStackTrace();
	}
	try
	{
	while(true)
		{
		Socket socket=listener.accept();
		try
		{
		if(flag==0)
		{
			dataInputStream=new DataInputStream(socket.getInputStream());
			s1=dataInputStream.readUTF();
			s2=this.strings1;
			if(s1.equalsIgnoreCase(s2))
			{
			JFrame fk=new JFrame();
			JPanel pk=new JPanel();
			JLabel lk=new JLabel();
			lk.setText("Server is connected to :"+socket.getInetAddress());
			pk.add(lk);
			fk.add(pk);
			flag=1;
			dataInputStream.close();
			socket.close();
			listener.close();
			run();
			break;
			}
			else
			{
			String s99="You have entered wrong Authentication Key\n Press enter to continue";
			JOptionPane.showMessageDialog(null,s99);
			flag=0;
			dataInputStream.close();
			socket.close();
			listener.close();
			run();
			break;
			}
			}
			else if(flag==1){
			dataInputStream=new DataInputStream(socket.getInputStream());
			s1=dataInputStream.readUTF();
			
			String s4="vid";
			String s5="notepad";
			String s6="lib";
			String s7="calculator";
			String s8="browser";
			String s9="cmd";
			
			//change the following String values to the name of the .mp3 files located in your music folder
			String s10="party rock anthem";
			String s11="fade to black";
			String s12="in the end";
			String s13="higher by creed";
			String s14="higher";
			String s15="bullets from the shield";
			String s16="catalyst";
			String s17="crawl";
			String s18="rain in the deep";
			String s19="papercut";
			String s20="letters from the sky";
			String s21="metallica";
			String s22="bad day";
			String s23="Good feeling";
			String s24="awesome dj";
			String s25="limitless";
			String s26="wild ones";
			String s27="world";
			String s28="linkin park";
			
			//comment any of the following String which you do not want to use
			String s29="wordpad";
			String s32="setvol";
			String s34="paint";
			String s35="sntool";
			String s36="record";
			String s37="sticky";
			String s46="shutdown";
			String s39="access";
			String s40="outlook";
			String s41="ppt";
			String s42="msword";
			String s43="onenote";
			String s44="excel";
			String s45="picasa";
			
			///change the path locations in the similar manner corresponding to your directories
			//some paths may be default,need not to be changed! 
			if(s1.equalsIgnoreCase(s20)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe \"E:\\video\\letters from the sky.flv\"")}
			else if(s1.equalsIgnoreCase(s21)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe \"E:\\video\\metallica.mp4\"")}
			else if(s1.equalsIgnoreCase(s22)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe \"E:\\video\\bad day.flv\"")}
			else if(s1.equalsIgnoreCase(s23)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe \"E:\\video\\Good feeling.flv\"")}
			else if(s1.equalsIgnoreCase(s24)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe \"E:\\video\\awesome dj.flv\"")}
			else if(s1.equalsIgnoreCase(s25)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe \"E:\\video\\limitless.mp4\"")}
			else if(s1.equalsIgnoreCase(s26)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe \"E:\\video\\wild ones.flv\"")}
			else if(s1.equalsIgnoreCase(s27)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe \"E:\\video\\world.flv\"")}
			else if(s1.equalsIgnoreCase(s28)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe \"E:\\video\\linkin park.mp4\"")}
			else if(s1.equalsIgnoreCase(s10)){Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"E:\\music\\session.mp3\"")}
			else if(s1.equalsIgnoreCase(s11)){Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"E:\\music\\black.mp3\"")}
			else if(s1.equalsIgnoreCase(s12)){Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"E:\\music\\number.mp3\"")}
			else if(s1.equalsIgnoreCase(s13)){Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"E:\\music\\fall.mp3\"")}
			else if(s1.equalsIgnoreCase(s14)){Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"E:\\music\\higher.mp3\"")}
			else if(s1.equalsIgnoreCase(s15)){Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"E:\\music\\bullet.mp3\"")}
			else if(s1.equalsIgnoreCase(s16)){Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"E:\\music\\catalyst.mp3\"")}
			else if(s1.equalsIgnoreCase(s17)){Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"E:\\music\\crawl.mp3\"")}
			else if(s1.equalsIgnoreCase(s18)){Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"E:\\music\\rain.mp3\"")}
			else if(s1.equalsIgnoreCase(s19)){Runtime.getRuntime().exec("C:\\Program Files\\Windows Media Player\\wmplayer.exe \"E:\\music\\papercut.mp3\"")}
			else if(s1.equalsIgnoreCase(s4)){Runtime.getRuntime().exec("explorer.exe E:\\video")}
			else if(s1.equalsIgnoreCase(s6)){Runtime.getRuntime().exec("explorer.exe E:\\music")}
			else if(s1.equalsIgnoreCase(s5)){Runtime.getRuntime().exec("Notepad")}
			else if(s1.equalsIgnoreCase(s8)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe")}
			else if(s1.equalsIgnoreCase(s7)){Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe ")}
			else if(s1.equalsIgnoreCase(s29)){Runtime.getRuntime().exec("C:\\Windows\\System32\\write.exe ")}
			else if(s1.equalsIgnoreCase(s32)){Runtime.getRuntime().exec("C:\\Windows\\System32\\SndVol.exe ")}
			else if(s1.equalsIgnoreCase(s34)){Runtime.getRuntime().exec("C:\\Windows\\System32\\mspaint.exe ")}
			else if(s1.equalsIgnoreCase(s35)){Runtime.getRuntime().exec("E:\\fun\\SnippingTool.exe ")}
			else if(s1.equalsIgnoreCase(s36)){Runtime.getRuntime().exec("E:\\fun\\SoundRecorder.exe ")}
			else if(s1.equalsIgnoreCase(s37)){Runtime.getRuntime().exec("E:\\fun\\StikyNot.exe ")}
			else if(s1.equalsIgnoreCase(s43)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\ONENOTE.exe ")}
			else if(s1.equalsIgnoreCase(s42)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\WINWORD.exe ")}
			else if(s1.equalsIgnoreCase(s41)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\POWERPNT.exe ")}
			else if(s1.equalsIgnoreCase(s40)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\OUTLOOK.exe ")}
			else if(s1.equalsIgnoreCase(s39)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\MSACCESS.exe ")}
			else if(s1.equalsIgnoreCase(s46)){Runtime.getRuntime().exec("shutdown -s")}
			else if(s1.equalsIgnoreCase(s45)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Picasa3\\Picasa3.exe ")}
			else if(s1.equalsIgnoreCase(s44)){Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft Office\\Office12\\EXCEL.exe ")}
			else if(s1.equalsIgnoreCase(s9)){
			File file=new File("C:\\Windows\\System32\\cmd.exe");
			Desktop desktop=null;
			if(Desktop.isDesktopSupported()){
			desktop=Desktop.getDesktop()
			}
			try{
			desktop.open(file)
			}
			catch(IOException e){}
			}
			else{
			new Fun().start(s1)}
			}
			}
			catch(IOException e){
			e.printStackTrace()
			}
			finally{
			socket.close()
			}
			}
			}
			catch(IOException e){
			e.printStackTrace()
			}
			finally{
			try{
			listener.close();
			System.out.print(s1)
			}
			catch(IOException e){
			e.printStackTrace()
			}
		}
	}
}
