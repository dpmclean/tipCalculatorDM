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

	private void driveTipDisplay() {
		//try {
		textInBill = (EditText) findViewById(R.id.etBillEntry);
		//}
		//catch( IllegalStateException ) {
		//	tvResult.setText( "That bill subtotal just dudnt look right");
		//}
		String strBill = textInBill.getText().toString();
		billSubTot = Double.parseDouble(strBill);
		 // avoid output looking like crap ... or not money anyhow; always have .XX
		DecimalFormat df = new DecimalFormat("#####.00");
		tvResult.setText( "Tip is:   $" + df.format( billSubTot * percent ) );
		//tvResult.setText( "$" + Double.toString( billSubTot * percent ) ); // truncates 0 digits		
	}

	// begin different button onClick targets
	public void driveTipTen(View v) {
		percent = .1;
		driveTipDisplay();
	}
	public void driveTipFifteen(View v) {
		percent = .15;
		driveTipDisplay();
	}
	public void driveTipTwenty(View v) {
		percent = .2;
		driveTipDisplay();
	}
}
