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
public class keysend extends Activity 
{
public String shivam;
public String c;

Bean shaz = new Bean();
String bansal1=shaz.getValue();
EditText textOut;

	



@Override
 public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.bansal);
textOut = (EditText)findViewById(R.id.key);

Button buttonSend = (Button)findViewById(R.id.vc);
buttonSend.setOnClickListener(buttonSendOnClickListener);
}
 Button.OnClickListener buttonSendOnClickListener
 = new Button.OnClickListener(){
@Override
public void onClick(View arg0) {
	c = textOut.getText().toString();
Toast.makeText(getApplicationContext(),c, Toast.LENGTH_SHORT).show();
Socket socket = null;
 DataOutputStream dataOutputStream = null;
 DataInputStream dataInputStream = null;
 try {
	 c = textOut.getText().toString();
  socket = new Socket(bansal1, 8888);
  dataOutputStream = new DataOutputStream(socket.getOutputStream());
  dataInputStream = new DataInputStream(socket.getInputStream());
  dataOutputStream.writeUTF(c);
  
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
      e.printStackTrace();
   }
  }
  startActivity(new Intent("com.shaz.hello"));
   } 

}
};


}


