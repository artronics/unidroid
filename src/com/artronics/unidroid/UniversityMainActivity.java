package com.artronics.unidroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class UniversityMainActivity extends BaseActivity {
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_universitymain);
		
		Button btnlocation = (Button) findViewById(R.id.btnLocations);
		Button btnprofessor = (Button) findViewById(R.id.btnProfessors);
		
	
		btnlocation.setOnClickListener(new OnClickListener()
	    {
	      public void onClick(View v)
	      {
	         Intent intent = new Intent (getApplicationContext(), LocationsActivity.class);
	         startActivity(intent);
;	      }
	    });
	
		
		btnprofessor.setOnClickListener(new OnClickListener()
	    {
	      public void onClick(View v)
	      {
	    	  Intent intent = new Intent (getApplicationContext(), ProfessorsActivity.class);
		         startActivity(intent);
	      }
	    });
	
	}
}
