package com.example.sendsms;

import android.os.Bundle;
import android.app.Activity;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b=(Button) findViewById(R.id.button1);
		b.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v)
	         {
	             sendSMS("+919663643432", "Hi You got a message!");

	                       /*here i can send message to emulator 5556. In Real device 
	                                                               you can change number  */

	          }
	      });}
	

	private void sendSMS(String phoneNumber, String message)
	   {
	       SmsManager sms = SmsManager.getDefault();
	       sms.sendTextMessage(phoneNumber, null, message, null, null);
	    }

	

}
