package com.artronics.unidroid;

import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AndroidXMLParsingActivity extends BaseActivity {

	// All static variables

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_professor_details);
		// addition by Me
		// Intent intent = getIntent();
		parseXML();

	}

	//TextView jprofname = (TextView) findViewById(R.id.profname);
	//TextView jprofposition = (TextView) findViewById(R.id.positiontitle);
	//TextView jindustry = (TextView) findViewById(R.id.education);
	//Button jbtnoffice = (Button) findViewById(R.id.btnoffice);

	//

	// ArrayList<HashMap<String, String>> menuItems = new
	// ArrayList<HashMap<String, String>>();

	// jprofname.setText("Professor name:" + KEY_LName);
	// jindustry.setText("Industry:" + KEY_Industry);
	// jprofposition.setText("Position" + KEY_Headline);

	private void parseXML() {
		AssetManager assetManager = getBaseContext().getAssets();
		try {
			InputStream is = assetManager.open("linkedin_example.xml");
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sp = spf.newSAXParser();
			XMLReader xr = sp.getXMLReader();

			OrderXMLHandler myXMLHandler = new OrderXMLHandler();
			xr.setContentHandler(myXMLHandler);
			InputSource inStream = new InputSource(is);
			xr.parse(inStream);

			String headline = myXMLHandler.geta();
			String firstname = myXMLHandler.getb();
			String lastname = myXMLHandler.getc();
			String industry = myXMLHandler.getd();

			Log.v("abcd", headline);
			LinearLayout ll = (LinearLayout) findViewById(R.id.profll);
			TextView tv = new TextView(this);
			
			tv.setText("Profesor First name: " + firstname);
			ll.addView(tv);
			tv = new TextView(this);
			tv.setText("Professor Last name : " + lastname);
			ll.addView(tv);
			tv = new TextView(this);
			tv.setText("headline: " + headline);
			ll.addView(tv);
			tv = new TextView(this);
			tv.setText("industry: " + industry);
			ll.addView(tv);
			tv = new TextView(this);
			//tv.setText("Shopping Cart Info --->");
			//ll.addView(tv);

			ArrayList<ProfessorInfo> cartList = myXMLHandler.getCartList();
			for (ProfessorInfo ProfessorInfo : cartList) {
				tv = new TextView(this);
				tv.setText("Professor Firstname : " + ProfessorInfo.getfirstname());
				ll.addView(tv);
				tv = new TextView(this);
				tv.setText("Professor Lastname : " + ProfessorInfo.getlastname());
				ll.addView(tv);
				tv = new TextView(this);
				tv.setText("Headline : " + ProfessorInfo.getheadline());
				ll.addView(tv);
				tv = new TextView(this);
				tv.setText("Industry : " + ProfessorInfo.getindustry());
				ll.addView(tv);
				tv = new TextView(this);
				tv.setText("---");
				ll.addView(tv);
			}

			is.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * ListView lv = getListView(); // listening to single listitem click
		 * lv.setOnItemClickListener(new OnItemClickListener() {
		 * 
		 * @Override public void onItemClick(AdapterView<?> parent, View view,
		 * int position, long id) { // getting values from selected ListItem
		 * String name = ((TextView)
		 * view.findViewById(R.id.name)).getText().toString(); String cost =
		 * ((TextView) view.findViewById(R.id.cost)).getText().toString();
		 * String description = ((TextView)
		 * view.findViewById(R.id.desciption)).getText().toString();
		 * 
		 * // Starting new intent Intent in = new
		 * Intent(getApplicationContext(), SingleMenuItemActivity.class);
		 * in.putExtra(KEY_NAME, name); in.putExtra(KEY_COST, cost);
		 * in.putExtra(KEY_DESC, description); startActivity(in);
		 * 
		 * } });
		 */
	}
}
