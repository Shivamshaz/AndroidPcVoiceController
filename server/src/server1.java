import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.*;
import java.awt.BorderLayout;i
mport java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class server1{
	public static String X;
	Socket socket=null;
	DataInputStream dataInputStream=null;
	DataOutputStream dataOutputStream=null;
	JPanel titlePanel,dPanel,buttonPanel,iPanel,panel1,panel2,panel3,p2,panel4,panel5,panel6;
	JLabel sendLabel,dataLabel,dataLabel1,sendLabel1;
	final JLabel l1=new JLabel("Set Authentication Key");
	JButton serverButton,transferButton,pairButton,logButton;
	public JTextField t1=new JTextField(15);
	String s1;
	final JButton b2=new JButton("OK");
	private JTabbedPane tabbedPane;
	JFrame f2=new JFrame("Authentication Windows");
	public void frame2(){
		tabbedPane.addTab("  Pair Device ",panel2);
		tabbedPane.addTab("  Commands  ",panel5);
		tabbedPane.addTab("  Run Server  ",panel1)
	}
	public void frame3(){
		tabbedPane.addTab("  Message  ",panel3);
		tabbedPane.addTab("  Commands  ",panel5);
		tabbedPane.addTab("  Run Server  ",panel1);
		tabbedPane.addTab("  Pair Device ",panel2)
	}
	class func{
		public void createPage1(){
			panel1=new JPanel();
			panel1.setLayout(null);
			serverButton=new JButton("Run Server");
			serverButton.setLocation(240,300);
			serverButton.setSize(180,40);
			panel1.add(serverButton);
			serverButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					frame2()
				}});
			b2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					s1=t1.getText();
					RunnableClass s=new RunnableClass();
					s.sendst(s1);
					RunnableClass rc=new RunnableClass();
					Thread tr;
					tr=new Thread(rc);
					tr.start();
					String cc=func123();
					createPage3();
					frame3()}})
		}
		String func123(){
			String sk=t1.getText();
			return sk;
		}
		public void createPage2(){
			panel2=new JPanel();
			panel2.setLocation(100,100);
			panel2.setSize(60,40);
			panel2.add(l1);
			panel2.add(t1);
			panel2.add(b2)
		}
		public void createPage3(){
			panel3=new JPanel();
			panel3.setLayout(null);
			panel3.setLocation(100,250);
			panel3.setSize(550,400);
			String ip=null;
			try{
				ip=InetAddress.getLocalHost().getHostAddress()
			}
			catch(UnknownHostException e1){
				e1.printStackTrace()
			}
				JLabel l2=new JLabel();
				l2.setLocation(200,20);
				l2.setSize(550,20);
				l2.setText("Connected to port : 8888 ");
				panel3.add(l2);
				JLabel l3=new JLabel();
				l3.setLocation(200,50);
				l3.setSize(550,20);
				l3.setText("Server's IP address is"+ip);
				panel3.add(l3);String cc=t1.getText();
				JLabel l4=new JLabel();
				l4.setLocation(200,80);
				l4.setSize(550,20);
				String kk=func123();
				l4.setText("Authentication Key is:"+kk);
				panel3.add(l4)
			}
			public void createPage5(){
				panel5=new JPanel();
				panel5.setLayout(null);
				panel5.setLocation(80,50);
				panel5.setSize(500,420);
				JLabel a1=new JLabel();
				a1.setLocation(220,10);
				a1.setSize(500,20);
				a1.setText("Android PC Voice Controller");
				panel5.add(a1);JLabel a2=new JLabel();
				a2.setLocation(100,50);
				a2.setSize(500,10);
				a2.setText("List Of Voice Commands");
				panel5.add(a2);JLabel a3=new JLabel();
				a3.setLocation(100,85);a3.setSize(500,10);
				a3.setText("1. Open Notepad");
				panel5.add(a3);
				JLabel a4=new JLabel();
				a4.setLocation(100,105);
				a4.setSize(500,10);
				a4.setText("2. Open Music Folder");
				panel5.add(a4);
				JLabel a5=new JLabel();
				a5.setLocation(100,125);
				a5.setSize(500,10);
				a5.setText("3. Open Video Folder");
				panel5.add(a5);
				JLabel a6=new JLabel();
				a6.setLocation(100,145);
				a6.setSize(500,10);
				a6.setText("4. Open Calculator");
				panel5.add(a6);
				JLabel a7=new JLabel();
				a7.setLocation(100,165);
				a7.setSize(500,10);
				a7.setText("5. Open Browser");
				panel5.add(a7);
				JLabel a8=new JLabel();
				a8.setLocation(100,185);
				a8.setSize(500,10);
				a8.setText("6. Open Command Prompt");
				panel5.add(a8);
				JLabel a9=new JLabel();
				a9.setLocation(100,205);
				a9.setSize(500,10);
				a9.setText("7. Audio <filename>");
				panel5.add(a9);
				JLabel a10=new JLabel();
				a10.setLocation(100,225);
				a10.setSize(500,10);
				a10.setText("8. Video <filename>");
				panel5.add(a10);
				JLabel a11=new JLabel();
				a11.setLocation(100,245);
				a11.setSize(500,10);
				a11.setText("9. Open Word Pad");
				panel5.add(a11);
				JLabel a12=new JLabel();
				a12.setLocation(100,265);
				a12.setSize(500,10);
				a12.setText("10. Set Volume");
				panel5.add(a12);
				JLabel a13=new JLabel();
				a13.setLocation(300,85);
				a13.setSize(500,10);
				a13.setText("11. Open Paint");
				panel5.add(a13);
				JLabel a16=new JLabel();
				a16.setLocation(300,105);
				a16.setSize(500,10);
				a16.setText("12. Stickey Notes");
				panel5.add(a16);
				JLabel a17=new JLabel();
				a17.setLocation(300,125);
				a17.setSize(500,10);
				a17.setText("13. Open Microsoft Access");
				panel5.add(a17);
				JLabel a18=new JLabel();
				a18.setLocation(300,145);
				a18.setSize(500,10);
				a18.setText("14. Open Microsoft Outlook");
				panel5.add(a18);
				JLabel a19=new JLabel();
				a19.setLocation(300,165);
				a19.setSize(500,10);
				a19.setText("15. Open Microsoft PowerPoint");
				panel5.add(a19);
				JLabel a20=new JLabel();
				a20.setLocation(300,185);
				a20.setSize(500,10);
				a20.setText("16. Open Microsoft Word");
				panel5.add(a20);
				JLabel a21=new JLabel();
				a21.setLocation(300,205);
				a21.setSize(500,10);
				a21.setText("17. Open Note");
				panel5.add(a21);
				JLabel a22=new JLabel();
				a22.setLocation(300,225);
				a22.setSize(500,10);
				a22.setText("18. Open Excel");
				panel5.add(a22);
				JLabel a23=new JLabel();
				a23.setLocation(300,245);
				a23.setSize(500,10);
				a23.setText("19. Open Picasa");
				panel5.add(a23);
				JLabel a24=new JLabel();
				a24.setLocation(300,265);
				a24.setSize(500,10);
				a24.setText("20. Shutdown");
				panel5.add(a24)}
			}
			public JPanel createContentPane(){
				JPanel totalGUI=new JPanel();
				totalGUI.setLayout(null);
				dPanel=new JPanel();
				dPanel.setLayout(new BorderLayout());
				dPanel.setLocation(10,10);
				dPanel.setSize(620,400);
				totalGUI.add(dPanel);
				func a=new func();
				a.createPage1();
				a.createPage2();
				a.createPage3();
				a.createPage5();
				tabbedPane=new JTabbedPane();
				tabbedPane.addTab("  Server ",panel1);
				tabbedPane.addTab("  Pair Device  ",panel2);
				tabbedPane.addTab("  Commands  ",panel5);
				dPanel.add(tabbedPane,BorderLayout.CENTER);
				totalGUI.setOpaque(true);return totalGUI
			}
			private static void createAndShowGUI(){
				JFrame frame=new JFrame("Android PC Voice Controller ");
				server1 demo=new server1();
				frame.setContentPane(demo.createContentPane());
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(660,460);frame.setLocationRelativeTo(null);
				frame.setVisible(true)}
				public static void main(String[]args){
					SwingUtilities.invokeLater(new Runnable(){
						public void run(){
							createAndShowGUI()}})
				}
			}