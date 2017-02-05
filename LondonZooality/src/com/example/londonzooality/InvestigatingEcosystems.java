package com.example.londonzooality;


import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import android.app.Activity;
import android.content.Context;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InvestigatingEcosystems extends Activity{
	Button oneA, oneB, oneC, twoA, twoB, twoC;
	String filename= "answer.txt";
	EditText type;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.investigating_ecosystems);
	type= (EditText) findViewById(R.id.editText);
	oneA= (Button) findViewById(R.id.answer1);
	oneB=(Button) findViewById(R.id.answer2);
	oneC=(Button) findViewById(R.id.answer3);
	twoA= (Button) findViewById(R.id.answer1_1);
	twoB=(Button) findViewById(R.id.answer2_1);
	twoC=(Button) findViewById(R.id.answer3_1);
	
	oneA.setOnClickListener(new View.OnClickListener(){
       	public void onClick(View view) {
       		oneA.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
       		oneB.setEnabled(false);
       		oneC.setEnabled(false);
       	}
	});
	
	oneB.setOnClickListener(new View.OnClickListener(){
       	public void onClick(View view) {
       		oneB.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
       		oneA.setEnabled(false);
       		oneC.setEnabled(false);
       	}
	});
	
	oneC.setOnClickListener(new View.OnClickListener(){
       	public void onClick(View view) {
       		oneC.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
       		oneA.setEnabled(false);
       		oneB.setEnabled(false);
       	}
	});
	
	twoA.setOnClickListener(new View.OnClickListener(){
       	public void onClick(View view) {
       		twoA.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
       		twoB.setEnabled(false);
       		twoC.setEnabled(false);
       	}
	});
	
	twoB.setOnClickListener(new View.OnClickListener(){
       	public void onClick(View view) {
       		twoB.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
       		twoA.setEnabled(false);
       		twoC.setEnabled(false);
       	}
	});
	
	twoC.setOnClickListener(new View.OnClickListener(){
       	public void onClick(View view) {
       		twoC.getBackground().setColorFilter(new LightingColorFilter(0xFFFFFFFF, 0xFFAA0000));
       		twoA.setEnabled(false);
       		twoB.setEnabled(false);
       	}
	});
	
	
	
	}
	
	public void SaveAnswer(View view)
	{
  		try {
  			//create the file
  			 FileOutputStream file = getApplicationContext().openFileOutput(filename,Context.MODE_PRIVATE);
  			 OutputStreamWriter Writer=new OutputStreamWriter(file);
  			 //writes whatever is in the edit text "type" into the file
  			 Writer.write(type.getText().toString());
  			 Writer.close();
  			 //once created and closed, a message pops up displaying "saved"
  			 Toast.makeText(getBaseContext(),"Saved", Toast.LENGTH_SHORT).show(); 
  			 } catch (Exception e) {
  			 // TODO Auto-generated catch block
  			 e.printStackTrace();
  			 }
  		
  		
  	}
	}
	

