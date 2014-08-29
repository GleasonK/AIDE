package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.res.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		EditText totalText = (EditText) findViewById(R.id.mainTotal);
		EditText tipText = (EditText) findViewById(R.id.mainTip);
		
		totalText.setRawInputType(Configuration.KEYBOARD_12KEY);
		tipText.setRawInputType(Configuration.KEYBOARD_12KEY);
    }
	
	public void doCalculate(View view){
		EditText totalText = (EditText) findViewById(R.id.mainTotal);
		EditText tipText = (EditText) findViewById(R.id.mainTip);
		
		TextView totalView = (TextView) findViewById(R.id.mainTotalView);
		TextView tipView = (TextView) findViewById(R.id.mainTipView);
		TextView totalWithTipView = (TextView) findViewById(R.id.mainTotalWithTipView);
		double total, tipPercent;
		try{
		    total = Double.valueOf(totalText.getText().toString());
		    tipPercent = Double.valueOf(tipText.getText().toString());
		} catch(NumberFormatException e) {
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
			
			totalText.setText("");
			tipText.setText("");
			return;
		}
		double tip = total * (tipPercent/100);
		double toPay = total + tip;
		
		totalText.setText("");
		tipText.setText("");
		
		totalView.setText(toDollar(total));
		tipView.setText(toDollar(tip));
		totalWithTipView.setText(toDollar(toPay));
		
		
    }
	
	public String toDollar(double value){
		return String.format("$%.2f",value);
	}
}
