package com.example.wheretoeat;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.*;

public class RecommendMenu extends ActionBarActivity {
	private ImageView imageView;
	private Button confirmButton;
	private Button returnButton;
	private Button changeButton;
	private TextView placeText;
	private TextView foodText;
	private Food[] foods;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recommend);
		
		imageView = (ImageView) findViewById(R.id.imageView1);
		returnButton = (Button) findViewById(R.id.button11);
		confirmButton = (Button) findViewById(R.id.button12);
		changeButton = (Button) findViewById(R.id.button13);
		placeText = (TextView) findViewById(R.id.textView2);
		foodText = (TextView) findViewById(R.id.textView3);
		
		foods = new Food[10];
		foods[0] = new Food("0", "二饭", "自选");
		foods[1] = new Food("1", "二饭", "烧味");
		foods[2] = new Food("2", "三饭", "自选");
		foods[3] = new Food("3", "三饭", "炒河粉");
		foods[4] = new Food("4", "一饭", "自选");
		foods[5] = new Food("5", "一饭", "麻辣烫");
		foods[6] = new Food("6", "四饭", "自选");
		foods[7] = new Food("7", "四饭", "小炒");
		foods[8] = new Food("8", "君城", "西餐");
		foods[9] = new Food("9", "君城", "套餐");
		
		changeFood();
		
		
		returnButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(RecommendMenu.this, MainMenu.class);
				startActivity(intent);
				RecommendMenu.this.finish();
			}
		});
		
		confirmButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(RecommendMenu.this, CommentMenu.class);
				startActivity(intent);
				RecommendMenu.this.finish();
			}
		});
		
		changeButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				changeFood();
			}
		});
	}
	public void changeFood() {
		int i = new Random().nextInt(10);
		String place = "饭堂： " + foods[i].getPlace();
		String food = "菜名： " + foods[i].getName();
		placeText.setText(place);
		foodText.setText(food);
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
