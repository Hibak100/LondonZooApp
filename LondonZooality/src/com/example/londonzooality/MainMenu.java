package com.example.londonzooality;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainMenu extends Activity {
Button b1, b2, b3, b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      b1= (Button) findViewById(R.id.button1);
      b2= (Button) findViewById(R.id.button2); 
      b3 = (Button)findViewById(R.id.button3);
      b4= (Button) findViewById(R.id.button4);
      
      b1.setOnClickListener(new View.OnClickListener(){
         	public void onClick(View view) {
                 //create a new intent that will launch the new gallery    
                 startActivity(new Intent(view.getContext(), servlet.class));
         	}
         });

       b2.setOnClickListener(new View.OnClickListener(){
       	public void onClick(View view) {
               //create a new intent that will launch the new gallery    
               startActivity(new Intent(view.getContext(), ViewGallery.class));
       	}
       });
       
        b3.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view) {
                //create a new intent that will launch the quiz menu      
                startActivity(new Intent(view.getContext(), Quiz_menu.class));
        	}
        });
    
        b4.setOnClickListener(new View.OnClickListener(){
        	public void onClick(View view) {
                //create a new intent that will launch the maps       
                startActivity(new Intent(view.getContext(), Maps.class));
        	}
        });
        
      
    }


    


    
}
