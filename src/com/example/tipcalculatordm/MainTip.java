package com.example.tipcalculatordm;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainTip extends Activity {
	public EditText textInBill;
	double percent = .01;       // nominal start value to let run and give prospective debug clue
	double billSubTot = 11.00;  // nominal start value to let run and give prospective debug clue
	public TextView tvResult;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_tip);
		tvResult = (TextView) findViewById(R.id.txtOut);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_tip, menu);
		return true;
	}

	public void driveTipTen(View v) {
		textInBill = (EditText) findViewById(R.id.etBillEntry);
		percent = .1;
		String strBill = textInBill.getText().toString();
		billSubTot = Double.parseDouble(strBill);
		DecimalFormat df = new DecimalFormat("#####.00");
		tvResult.setText( "Tip is:   $" + df.format( billSubTot * percent ) );
		//tvResult.setText( "$" + Double.toString( billSubTot * percent ) ); // truncates 0 digits
	}

	public void driveTipFifteen(View v) {
		textInBill = (EditText) findViewById(R.id.etBillEntry);
		percent = .15;
		String strBill = textInBill.getText().toString();
		billSubTot = Double.parseDouble(strBill);
		DecimalFormat df = new DecimalFormat("#####.00");
		tvResult.setText( "Tip is:   $" + df.format( billSubTot * percent ) );
		//tvResult.setText( "$" + Double.toString( billSubTot * percent ) ); // truncates 0 digits
	}

	public void driveTipTwenty(View v) {
		textInBill = (EditText) findViewById(R.id.etBillEntry);
		percent = .2;
		String strBill = textInBill.getText().toString();
		billSubTot = Double.parseDouble(strBill);
		DecimalFormat df = new DecimalFormat("#####.00");
		tvResult.setText( "Tip is:   $" + df.format( billSubTot * percent ) );
		//tvResult.setText( "$" + Double.toString( billSubTot * percent ) ); // truncates 0 digits
	}

}
