package com.it.caishuzidemo1;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	int rand;
	public void start(View view) {
		EditText numb1ET = (EditText) findViewById(R.id.num1_et);
		EditText numb2ET = (EditText) findViewById(R.id.num2_et);
		int numb1 = Integer.parseInt(numb1ET.getText().toString());
		int numb2 = Integer.parseInt(numb2ET.getText().toString());
		if(numb1 > numb2){
			Toast.makeText(this, "第一个数值必须大于第二个", 1).show();
		}
		else{
			rand = new Random().nextInt(numb2-numb1)+numb1;
			System.out.println(rand);
		}
	}
	public void submit(View view) {
		EditText resET = (EditText) findViewById(R.id.res_et);
		int res = Integer.parseInt(resET.getText().toString());
		if(res == rand){
			Toast.makeText(this, "恭喜你猜对了", 1).show();
		}
		else if(res > rand){
			Toast.makeText(this, "猜大了", 1).show();
		}
		else{
			Toast.makeText(this, "猜小了", 1).show();
		}
	}

}
