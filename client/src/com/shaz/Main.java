/* Client Main File
*  Copyright 2013 Shivam Bansal (www.shivambansal.com)
*  Version 0.1
*/

package com.shaz;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.speech.RecognizerIntent;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
public class Main extends Activity{
	private static final int REQUEST_CODE=1234;
	private ListView wordsList;
	@Override 
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.voice_recog);
		Button speakButton=(Button)findViewById(R.id.speakButton);
		wordsList=(ListView)findViewById(R.id.list);
		PackageManager pm=getPackageManager();
		List<ResolveInfo>activities=pm.queryIntentActivities(new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH),0);
		if(activities.size()==0){
			speakButton.setEnabled(false);
			speakButton.setText("Recognizer not present")
			}
		}
	public void speakButtonClicked(View v){
		startVoiceRecognitionActivity()
		}
	private void startVoiceRecognitionActivity(){
		Intent intent=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
		intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
		intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Android Pc Voice Controller");
		startActivityForResult(intent,REQUEST_CODE)
		}
	@Override 
	protected void onActivityResult(int requestCode,int resultCode,Intent data){
		if(requestCode==REQUEST_CODE&&resultCode==RESULT_OK){
			ArrayList<String>matches=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
			wordsList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,matches));
			String m=matches.get(0);
			if(m.toUpperCase().equals("OPEN NOTEPAD")){
				Intent i=new Intent("com.shaz.notepad");
				i.putExtra("id","notepad");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN CALCULATOR"))
			{
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","calculator");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN COMMAND PROMPT"))
			{
				Intent i=new Intent("com.shaz.notepad");
				i.putExtra("id","cmd");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN BROWSER")){
				Intent i=new Intent("com.shaz.notepad");
				i.putExtra("id","browser");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN MUSIC FOLDER")){
				Intent i=new Intent("com.shaz.notepad");
				i.putExtra("id","lib");startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN VIDEO FOLDER")){
				Intent i=new Intent("com.shaz.notepad");
				i.putExtra("id","vid");startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN WORD PAD")){
				Intent i=new Intent("com.shaz.notepad");
				i.putExtra("id","wordpad");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("SET VOLUME")){
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","setvol");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN PAINT"))
				{
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","paint");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("SNIPING TOOL")){
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","sntool");startActivity(i)
				}
			else if(m.toUpperCase().equals("SOUND RECORDER"))
				{
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","record");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("STICKY NOTES"))
				{
				Intent i=new Intent("com.shaz.notepad");
				i.putExtra("id","sticky");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN MICROSOFT ACCESS")){
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","access");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN MICROSOFT OUTLOOK")){
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","outlook");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN MICROSOFT POWER POINT")){
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","ppt");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN MICROSOFT WORD")){
				Intent i=new Intent("com.shaz.notepad");
				i.putExtra("id","msword");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("SHUT DOWN")){
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","shutdown");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN NOTE")){
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","onenote");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN EXCEL")){
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","excel");
				startActivity(i)
				}
			else if(m.toUpperCase().equals("OPEN PICASA")){
				Intent i=new Intent("com.shaz.audio1");
				i.putExtra("id","picasa");
				startActivity(i)
				}
			else {
				startActivity(new Intent("com.shaz.error1"))
			     }
				}
				super.onActivityResult(requestCode,resultCode,data)
				}
				}
