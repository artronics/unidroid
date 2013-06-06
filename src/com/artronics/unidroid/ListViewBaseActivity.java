package com.artronics.unidroid;

import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class ListViewBaseActivity extends ListActivity{
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.mnuSetting:
	        	Intent intent1=new Intent(this,SettingActivity.class);
	    		startActivity(intent1);
	            return true;
	        case R.id.mnuHelp:
	        	Intent intent2=new Intent(this,HelpActivity.class);
	    		startActivity(intent2);
	            return true;
	        case R.id.mnuAbout:
	        	Intent intent3=new Intent(this,AboutActivity.class);
	    		startActivity(intent3);
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	      
	    }
	}

}
