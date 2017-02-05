package com.example.londonzooality;




import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Maps extends ActionBarActivity{
	GoogleMap googleMap;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.map);
	  try {
          // Loading map
          initilizeMap();

      } catch (Exception e) {
          e.printStackTrace();
      }
  }
	
	 private void initilizeMap() {
	     //if the map is empty
	        if (googleMap == null) {
	    //creates a map
	          googleMap = ((MapFragment) getFragmentManager().findFragmentById(
	                  R.id.mapview)).getMap();
	    //sets the map type
	          googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL); 
	     //calls location method
	          Location();
	          }
	      }
  
 private void Location()
 {
	 //allows current location to be found
	 googleMap.setMyLocationEnabled(true); 
     //Setting boundaries
	 LatLng LondonZoo = new LatLng(51.535471, -0.153419);
     CameraUpdate location = CameraUpdateFactory.newLatLngZoom(LondonZoo, 20);
     googleMap.moveCamera(location);
	 // creates marker
	 MarkerOptions marker = new MarkerOptions().position(LondonZoo).title("London Zoo ");
	 // adds marker
	 googleMap.addMarker(marker);

 }
 
  @Override
  protected void onResume() {
      super.onResume();
      initilizeMap();
  }
  
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
          case R.id.action_home:
         	 startActivity(new Intent(this, MainMenu.class));//goes to main menu after item selected
              return true;
  default:
 	 return super.onOptionsItemSelected(item);
      }
  }

}	

