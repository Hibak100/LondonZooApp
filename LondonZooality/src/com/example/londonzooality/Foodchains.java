package com.example.londonzooality;

import android.app.Activity;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Foodchains extends Activity{
Button A1,A2,A3, A1_1,A2_1,A3_1, A1_2,A2_2,A3_2,  A1_3,A2_3,A3_3;
Boolean clicked;
int buttonCount;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.food_chains);
	        Button submit=(Button) findViewById(R.id.Submit);
	        A1= (Button) findViewById(R.id.A1);
	    	A2=(Button) findViewById(R.id.A2);
	    	A3=(Button) findViewById(R.id.A3);
	    	A1_1= (Button) findViewById(R.id.Answ1_1);
	    	A2_1=(Button) findViewById(R.id.Answ2_1);
	    	A3_1=(Button) findViewById(R.id.Answ3_1);
	    	A1_2= (Button) findViewById(R.id.Answ1_2);
	    	A2_2=(Button) findViewById(R.id.Answ2_2);
	    	A3_2=(Button) findViewById(R.id.Answ3_2);
	    	A1_3= (Button) findViewById(R.id.Answ1_3);
	    	A2_3=(Button) findViewById(R.id.Answ2_3);
	    	A3_3=(Button) findViewById(R.id.Answ3_3);
	    	
	    	A1.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A1.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A2.setEnabled(false);
	           		A3.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	    	A2.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A2.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A1.setEnabled(false);
	           		A3.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	    	A3.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A3.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A1.setEnabled(false);
	           		A2.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	 /////////////////-----------------------------------------------------------------------------\\\\\\\\\\\\\\\\\
	    	A1_1.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A1_1.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A2_1.setEnabled(false);
	           		A3_1.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	    	A2_1.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A2_1.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A1_1.setEnabled(false);
	           		A3_1.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	    	A3_1.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A3_1.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A1_1.setEnabled(false);
	           		A2_1.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	  /////////////////-----------------------------------------------------------------------------\\\\\\\\\\\\\\\\\
	      	A1_2.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A1_2.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A2_2.setEnabled(false);
	           		A3_2.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	    	A2_2.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A2_2.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A1_2.setEnabled(false);
	           		A3_2.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	    	A3_2.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A3_2.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A1_2.setEnabled(false);
	           		A2_2.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	  /////////////////-----------------------------------------------------------------------------\\\\\\\\\\\\\\\\\
	      	A1_3.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A1_3.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A2_3.setEnabled(false);
	           		A3_3.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	    	A2_3.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A2_3.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A1_3.setEnabled(false);
	           		A3_3.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
	    	A3_3.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		A3_3.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
	           		A1_3.setEnabled(false);
	           		A2_3.setEnabled(false);
	           		buttonCount++;
	           	}
	    	});
/////////////////-----------------------------------------------------------------------------\\\\\\\\\\\\\\\\\  	
	    	submit.setOnClickListener(new View.OnClickListener(){
	           	public void onClick(View view) {
	           		checkButtonCount();
	           	}
	    	});	
	 }
	 
	 public void checkButtonCount()
	 {
		 if(buttonCount==4)
		 {
			 checkResults();
		 }
		 else
		 {
			 Toast.makeText(getBaseContext(),"quiz isn't finished!", Toast.LENGTH_SHORT).show();
		 }
	 }
	 
	 public void checkResults()
	 {
		 //if all the correct buttons are clicked
		if(A3.isEnabled()==true && A3_1.isEnabled()==true 
				&& A3_2.isEnabled()==true && A1_3.isEnabled()==true)
		{
			 Toast.makeText(getBaseContext(),"4 out of 4", Toast.LENGTH_SHORT).show(); 
		}
		//if 3 correct buttons are clicked
		else if(A3.isEnabled()==true && A3_1.isEnabled()==true &&A3_2.isEnabled()==true)
		{
			Toast.makeText(getBaseContext(),"3 out of 4", Toast.LENGTH_SHORT).show(); 
		}
		else if(A3_1.isEnabled()==true && A3_2.isEnabled()==true &&A1_3.isEnabled()==true)
		{
			Toast.makeText(getBaseContext(),"3 out of 4", Toast.LENGTH_SHORT).show(); 
		}
		else if(A3.isEnabled()==true && A3_2.isEnabled()==true &&A1_3.isEnabled()==true)
		{
			Toast.makeText(getBaseContext(),"3 out of 4", Toast.LENGTH_SHORT).show(); 
		}
		else if(A3.isEnabled()==true && A3_1.isEnabled()==true &&A1_3.isEnabled()==true)
		{
			Toast.makeText(getBaseContext(),"3 out of 4", Toast.LENGTH_SHORT).show(); 
		}
		//if two correct buttons are clicked
		else if((A3.isEnabled()==true && A3_1.isEnabled()==true)|| 
				(A3_2.isEnabled()==true && A1_3.isEnabled()==true))
		{
			Toast.makeText(getBaseContext(),"2 out of 4", Toast.LENGTH_SHORT).show(); 
		}
		else if((A3.isEnabled()==true && A3_2.isEnabled()==true)|| 
				(A3_1.isEnabled()==true && A1_3.isEnabled()==true))
		{
			Toast.makeText(getBaseContext(),"2 out of 4", Toast.LENGTH_SHORT).show(); 
		}
		else if((A3.isEnabled()==true && A1_3.isEnabled()==true)|| 
				(A3_2.isEnabled()==true && A3_1.isEnabled()==true))
		{
			Toast.makeText(getBaseContext(),"2 out of 4", Toast.LENGTH_SHORT).show(); 
		}
		//if one correct button is clicked
		else if(A3.isEnabled()==true || A3_1.isEnabled()==true|| 
						A3_2.isEnabled()==true || A1_3.isEnabled()==true)
		{
			Toast.makeText(getBaseContext(),"1 out of 4", Toast.LENGTH_SHORT).show(); 
		}
		//if no correct button is clicked
		else if(A3.isEnabled()==false && A3_1.isEnabled()==false 
				&& A3_2.isEnabled()==false && A1_3.isEnabled()==false)
		{
			Toast.makeText(getBaseContext(),"0 out of 4", Toast.LENGTH_SHORT).show(); 
		}
	 }

	 
}
