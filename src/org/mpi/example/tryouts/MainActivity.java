package org.mpi.example.tryouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
	
	@Override
	public boolean  onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.action_toast:
			Toast.makeText(getApplicationContext(), R.string.toast_text, Toast.LENGTH_SHORT).show();
		    break;

		case R.id.action_settings:
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
	        startActivity(intent);
		    break;
		    
		default:
			System.out.println("Master ItemId: " + item.getItemId());
		
			break;
		}
		
	
		return false;
	}
	
	
	
		  }


