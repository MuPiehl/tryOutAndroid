package org.mpi.example.tryouts;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	DrawingView dv ;   
	private Paint       mPaint;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    mPaint = new Paint();
	    
	    dv = new DrawingView(this, mPaint);
	    setContentView(dv);
	
	    mPaint.setAntiAlias(true);
	    mPaint.setDither(true);
	    mPaint.setColor(Color.GREEN);
	    mPaint.setStyle(Paint.Style.STROKE);
	    mPaint.setStrokeJoin(Paint.Join.ROUND);
	    mPaint.setStrokeCap(Paint.Cap.ROUND);
	    mPaint.setStrokeWidth(12);  
		
	
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
<<<<<<< HEAD
}
=======
	
	
	
		  }


>>>>>>> master
