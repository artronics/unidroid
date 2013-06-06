package com.artronics.unidroid;

import android.os.Bundle;
import android.widget.ImageView;

public class MapActivity extends BaseActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_map);
	    // TODO Auto-generated method stub
	    
	    
	    ImageView image = (ImageView) findViewById(R.id.imageView1);
	    image.setImageResource(R.drawable.library);
	
	
	}

}
