package com.shaz;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class first extends Activity{
	EditText textOut;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		textOut = (EditText)findViewById(R.id.ipadd);
		Button ip = (Button) findViewById(R.id.ipad);
		ip.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			
			String c = textOut.getText().toString();
			Bean beana = new Bean();
			beana.setValue(c);
		startActivity(new Intent("com.shaz.hello1"));
		}
		});
		    Button vc = (Button) findViewById(R.id.vc);
		    vc.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
			startActivity(new Intent("com.shaz.commands"));
		}
		});
		}

}
