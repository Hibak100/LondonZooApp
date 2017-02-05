package com.example.londonzooality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends Activity {
	   @Override
	    protected void onCreate(Bundle savedInstanceState) 
	   {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.login_page);
	        final Button login=(Button)findViewById(R.id.login);
	        final EditText one= (EditText) findViewById(R.id.user);
	        final EditText pass= (EditText) findViewById(R.id.pass);
	        	  login.setOnClickListener(new View.OnClickListener(){
	  	        	public void onClick(View view) {
	  	        		if(one.getText().toString().equals("user") && 
	  	        				pass.getText().toString().equals("pass"))
	  	        		{
	  	        		  //launches next page if login details are correct      
		  	                startActivity(new Intent(view.getContext(), MainMenu.class));
	  	        			}
	  	        		    else
	  	        		    {
	  	        			    Toast.makeText(getBaseContext(),"Enter login details!", 
	  	        			    		Toast.LENGTH_SHORT).show(); 	
	  	        			}
	  	        	     }
	  	        });
	   }
}
