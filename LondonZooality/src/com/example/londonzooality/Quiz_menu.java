package com.example.londonzooality;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Quiz_menu extends ActionBarActivity
{
	
@Override
public void onCreate(Bundle savedInstanceState)
{
super.onCreate(savedInstanceState);
setContentView(R.layout.quiz_menu);
Button ks3= (Button) findViewById(R.id.ks3);
Button ks4= (Button) findViewById(R.id.ks4);

ks3.setOnClickListener(new View.OnClickListener(){
	public void onClick(View view) {
        //create a new intent that will launch ks3 page      
        startActivity(new Intent(view.getContext(), ks3_topics.class));
	}
});
ks4.setOnClickListener(new View.OnClickListener(){
	public void onClick(View view) {
        //create a new intent that will launch the ks4 page       
        startActivity(new Intent(view.getContext(), ks4_topics.class));
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

