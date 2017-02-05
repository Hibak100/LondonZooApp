package com.example.londonzooality;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;


public class CaptureImage extends Activity {
	 static int TAKE_PICTURE = 1;
	@Override
 protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
       	  // create intent with ACTION_IMAGE_CAPTURE action 
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            // start camera activity
            startActivityForResult(intent, TAKE_PICTURE);
           
    }
}
