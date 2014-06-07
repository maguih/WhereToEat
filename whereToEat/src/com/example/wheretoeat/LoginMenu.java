package com.example.wheretoeat;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.*;
import android.content.Intent;

public class LoginMenu extends ActionBarActivity {
	private Button LoginButton;
	private EditText nameText;
	private EditText pwText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		LoginButton = (Button) findViewById(R.id.button0);
		nameText = (EditText) findViewById(R.id.editText1);
		pwText = (EditText) findViewById(R.id.editText2);
		LoginButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name = nameText.getText().toString();
				String pw = pwText.getText().toString();
				if (name.equals("")) {
					DisplayToast("帐号不能为空");
					return;
				}
				if (pw.equals("")) {
					DisplayToast("密码不能为空");
					return;
				}
					
				Intent intent = new Intent();
				intent.setClass(LoginMenu.this, MainMenu.class);
				startActivity(intent);
				LoginMenu.this.finish();
			}
		});
	}
	
	public void DisplayToast(String str) {
		Toast toast = Toast.makeText(this, str, Toast.LENGTH_LONG);
		toast.setGravity(Gravity.TOP, 0, 220);
		toast.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
