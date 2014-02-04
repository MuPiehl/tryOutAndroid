package org.mpi.example.tryouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends MainActivity {
	
	 @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.second_activity);
	  }
	 
	 public void onClickBackButton(View view){
		 System.out.println("Bin in onClickBackButton");
		 
		 this.finish();
		 }
		

			
}
