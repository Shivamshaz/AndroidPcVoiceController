package com.shaz;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class writing extends Activity 
{
	public String shivam;
	Bean shaz = new Bean();
	String bansal=shaz.getValue();
	EditText textOut;
	TextView textIn;
@Override
 public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     setContentView(R.layout.writing);
     Button buttonSend = (Button)findViewById(R.id.send);
     textIn = (TextView)findViewById(R.id.textin);
     buttonSend.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View arg0) {
		Toast.makeText(getApplicationContext(),bansal, Toast.LENGTH_SHORT).show();
			Socket socket = null;
			 DataOutputStream dataOutputStream = null;
			 DataInputStream dataInputStream = null;
			 try {
				 Bundle extras = getIntent().getExtras();
					if (extras != null) 
					{
					String hello = extras.getString("id");
				    shivam = hello; 
					}
			  socket = new Socket(bansal, 8888);
			  dataOutputStream = new DataOutputStream(socket.getOutputStream());
			  dataInputStream = new DataInputStream(socket.getInputStream());
			  dataOutputStream.writeUTF(shivam);
			  textIn.setText(dataInputStream.readUTF());
			 } catch (UnknownHostException e) {
			   e.printStackTrace();
			 } catch (IOException e) {
			   e.printStackTrace();
			 }
			 finally{
			  if (socket != null){
			   try {
			    socket.close();
			   } catch (IOException e) {
			    e.printStackTrace();
			   }
			  }

			  if (dataOutputStream != null){
			   try {
			    dataOutputStream.close();
			   } catch (IOException e) {
			       e.printStackTrace();
			   }
			  }
			  if (dataInputStream != null){
			   try {
			    dataInputStream.close();
			   } catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			   }
			  }

			 } 
			}
			});
 Button back = (Button)this.findViewById(R.id.back);
     back.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
       finish() ;
    }
     });
     
     
     Button vc = (Button) findViewById(R.id.commands);
	    vc.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
		startActivity(new Intent("com.shaz.commands"));
	}
	});
	    
	    Button vcom = (Button) findViewById(R.id.com);
	    vcom.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
		startActivity(new Intent("com.shaz.hello"));
	}
	});
	    
     
     
    
 }
}


