package com.example.londonzooality;

import android.app.Activity;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class ViewPagerAdapter extends PagerAdapter {

 Activity activity;
 int images[];

 public ViewPagerAdapter(Activity act, int[] imageArray) {
  images = imageArray;
  activity = act;
 }

 public int getCount() {
	 //counts the number of images available
  return images.length;
 }

 
public Object instantiateItem(View collection, int position) {
//sets activity as image view
  ImageView view = new ImageView(activity);
  //sets the layout to wrap content (big enough to surround its content)
  view.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
    LayoutParams.WRAP_CONTENT));
  //image is scaled in the center
  view.setScaleType(ScaleType.CENTER_INSIDE);
  //sets the whatever current image in the array
  view.setBackgroundResource(images[position]);
  //adds the image to the view and displays it
  ((ViewPager) collection).addView(view, 0);
  return view;
 }

//the following methods destroy the items once they're displayed
//for full memory precautions 
 @Override
 public void destroyItem(View arg0, int arg1, Object arg2) {
  ((ViewPager) arg0).removeView((View) arg2);
 }

 @Override
 public boolean isViewFromObject(View arg0, Object arg1) {
  return arg0 == ((View) arg1);
 }

 @Override
 public Parcelable saveState() {
  return null;
 }
}