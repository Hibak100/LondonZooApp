package com.example.londonzooality;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ViewGallery extends ActionBarActivity {

 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.gallery);
  //view pager will allow images to slide 
  //initiates view pager and pager adapter
  ViewPagerAdapter allImages = new ViewPagerAdapter(this, images);
  ViewPager layoutSlide = (ViewPager) findViewById(R.id.viewPage);
  layoutSlide.setAdapter(allImages);
  //currently no images in the viewpager
  layoutSlide.setCurrentItem(0);
  
  //once capture button is clicked, CaptureImage class is called
  Button capture=(Button) findViewById(R.id.Capture);
  capture.setOnClickListener(new View.OnClickListener()
	{
     	public void onClick(View view) 
     	{
     		 startActivity(new Intent(view.getContext(), CaptureImage.class));
        }
	});
 }

 //allImages 
 private int images[] = 
	 { 
		 R.drawable.image1,
		 R.drawable.image2,
		 R.drawable.image3,
         R.drawable.image4,
         R.drawable.image5,
         R.drawable.image6,
         R.drawable.image7,
         R.drawable.image8,
     };

 @Override
 public boolean onCreateOptionsMenu(Menu menu) 
 { 
  MenuInflater inflater = getMenuInflater();
  inflater.inflate(R.menu.main, menu);
  return true;
 }
 
 @Override
 public boolean onOptionsItemSelected(MenuItem item) {
     int id = item.getItemId();
     switch (id) {
     //allow user to return to main menu
         case R.id.action_home:
        	 startActivity(new Intent(this, MainMenu.class));
             return true;
 default:
	 return super.onOptionsItemSelected(item);
     }
 }


 
}