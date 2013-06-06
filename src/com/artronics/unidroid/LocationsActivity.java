package com.artronics.unidroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class LocationsActivity extends ListViewBaseActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		String[] jlocationlist = getResources()
				.getStringArray(R.array.location);
		this.setListAdapter(new ArrayAdapter<String>(this,
				R.layout.activity_locations, R.id.locationlist, jlocationlist));
		ListView lv = getListView();
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				// selected item
				String location = ((TextView) view).getText().toString();

				// Launching new Activity on selecting single List Item
				Intent i = new Intent(getApplicationContext(),
						PresentationActivity.class);
				// sending data to new activity
				i.putExtra("parameter", location);
				startActivity(i);

				// startActivity(i);

			}
		});

		// setContentView(R.layout.activity_locations);
		// TODO Auto-generated method stub
	}

	/*
	 * private enum ItemsToRetrieve {classs,LAB,office,library,professor};
	 * public void retrieveListOfItems(ItemsToRetrieve items){ String
	 * []strListOfItems= new String[20]; /* Here we should parse the XML data to
	 * retrieve proper data The parser should pass an array of data which should
	 * presented in presentActivity
	 * 
	 * //strListOfItems=parseXML(); //ArrayAdapter adapter = new
	 * ArrayAdapter<String>(this,android.R.layout.activity_list_item,
	 * strListOfItems); Intent intent = new Intent(this,
	 * ListItemsActivity.class); startActivity(intent); }
	 *

	public void retrieveListOfItems(View view) {
		// String []strListOfItems= new String[20];
		/*
		 * Here we should parse the XML data to retrieve proper data The parser
		 * should pass an array of data which should presented in
		 * presentActivity
		 

		// strListOfItems=parseXML();
		// ArrayAdapter adapter = new
		// ArrayAdapter<String>(this,android.R.layout.activity_list_item,
		// strListOfItems);
		Intent intent = new Intent(this, ListItemsActivity.class);
		startActivity(intent);
	}
*/
	/*
	 * public String [] parseXML(ItemsToRetrieve items){ String
	 * []strListOfItems= new String[20]; /* The parser should fill this array
	 * Now we just put some dummy variables to check
	 * 
	 * 
	 * strListOfItems[0]="class 1"; strListOfItems[1]="class 2";
	 * strListOfItems[2]="class 3"; strListOfItems[3]="class 4"; return
	 * strListOfItems;
	 * 
	 * } // Override above method public String [] parseXML(){ String
	 * []strListOfItems= new String[20]; /* The parser should fill this array
	 * Now we just put some dummy variables to check
	 * 
	 * 
	 * strListOfItems[0]="class 1"; strListOfItems[1]="class 2";
	 * strListOfItems[2]="class 3"; strListOfItems[3]="class 4"; return
	 * strListOfItems;
	 * 
	 * }
	 */
}
