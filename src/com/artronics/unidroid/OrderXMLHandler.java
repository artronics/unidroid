package com.artronics.unidroid;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class OrderXMLHandler extends DefaultHandler {

	boolean currentElement = false;
	String currentValue = "";

	String a;
	String b;
	String c;
	String d;
	ProfessorInfo ProfessorInfo;
	ArrayList<ProfessorInfo> cartList;

	public String geta() {
		return a;
	}

	public String getb() {
		return b;
	}

	public String getc() {
		return c;
	}

	public String getd() {
		return d;
	}

	public ArrayList<ProfessorInfo> getCartList() {
		return cartList;
	}

	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {

		currentElement = true;

		if (qName.equals("person")) {
			cartList = new ArrayList<ProfessorInfo>();
		} else if (qName.equals("person")) {
			ProfessorInfo = new ProfessorInfo();
		}

	}

	public void endElement(String uri, String localName, String qName)
			throws SAXException {

		currentElement = false;

		if (qName.equalsIgnoreCase("headline"))
			a = currentValue.trim();
		else if (qName.equalsIgnoreCase("firstname"))
			b = currentValue.trim();
		else if (qName.equalsIgnoreCase("lastname"))
			c = currentValue.trim();
		else if (qName.equalsIgnoreCase("industry"))
			d = currentValue.trim();
		/*
		 * else if (qName.equalsIgnoreCase("LineNumber"))
		 * ProfessorInfo.setfirstname(currentValue.trim()); else if
		 * (qName.equalsIgnoreCase("ProductSku"))
		 * ProfessorInfo.setlastname(currentValue.trim()); else if
		 * (qName.equalsIgnoreCase("Quantity"))
		 * ProfessorInfo.setheadline(currentValue.trim()); else if
		 * (qName.equalsIgnoreCase("Price"))
		 * ProfessorInfo.setindustry(currentValue.trim());
		 */
		else if (qName.equalsIgnoreCase("person"))
			cartList.add(ProfessorInfo);

		currentValue = "";
	}

	public void characters(char[] ch, int start, int length)
			throws SAXException {

		if (currentElement) {
			currentValue = currentValue + new String(ch, start, length);
		}

	}

}
