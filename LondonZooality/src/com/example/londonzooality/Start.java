package com.example.londonzooality;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start extends Activity 
{
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        final MediaPlayer bClick = MediaPlayer.create(this, R.raw.click);
	        final MediaPlayer bgm= MediaPlayer.create(this, R.raw.rainforest);
	        setContentView(R.layout.start_view);
	        Button start=(Button)findViewById(R.id.start);
	        bgm.start();
	        start.setOnClickListener(new View.OnClickListener(){
	        	public void onClick(View view) {
	        		 bClick.start();
	                //create a new intent that will launch the new 'page'       
	                startActivity(new Intent(view.getContext(), login.class));
	                bgm.pause();
	        	}
	        });
	        
	    }    
}

