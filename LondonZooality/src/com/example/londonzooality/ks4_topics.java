package com.example.londonzooality;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ks4_topics extends ActionBarActivity{
	
@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.ks4topics);
Button quiz= (Button) findViewById(R.id.topic2);
quiz.setOnClickListener(new View.OnClickListener(){
       	public void onClick(View view) {
               //create a new intent that will launch the quiz    
               startActivity(new Intent(view.getContext(), InvestigatingEcosystems.class));
       	}
       });
}

@Override
public boolean onCreateOptionsMenu(Menu menu) 
{ 
 MenuInflater inflater = getMenuInflater();
 inflater.inflate(R.menu.main, menu);
 return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) 
{
    int id = item.getItemId();
    switch (id) {
    //allows user to return to main menu
        case R.id.action_home:
       	 startActivity(new Intent(this, MainMenu.class));
            return true;
default:
	 return super.onOptionsItemSelected(item);
    }
}
}

