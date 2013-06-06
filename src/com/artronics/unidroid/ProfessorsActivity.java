package com.artronics.unidroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ProfessorsActivity extends ListViewBaseActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// TODO Auto-generated method stub

		String[] jprofessorlist = getResources()
				.getStringArray(R.array.professor);
		this.setListAdapter(new ArrayAdapter<String>(this,
				R.layout.activity_professors, R.id.professorlist, jprofessorlist));
		ListView lv = getListView();
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				// selected item
				String professor = ((TextView) view).getText().toString();
				if (professor.equals("Testiano Testi")) {
					//String profname = ((TextView) view).getText().toString();
					Intent b = new Intent(getApplicationContext(),
							AndroidXMLParsingActivity.class);
					// sending data to new activity
					// i.putExtra("parameter", location);
					b.putExtra("parameter", "Testiano Testi");
					startActivity(b);
				}
				// Launching new Activity on selecting single List Item
				/*Intent i = new Intent(getApplicationContext(),
						PresentationActivity.class);
				// sending data to new activity
				i.putExtra("parameter", professor);
				startActivity(i);

				// startActivity(i);*/

			}
		});

		// setContentView(R.layout.activity_locations);
		// TODO Auto-generated method stub
	}

}
