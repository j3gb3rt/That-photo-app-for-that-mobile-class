package edu.gatech.cs4261.wheresdabeef;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Jonathan on 10/10/13.
 */
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private int[] dog;
    public ImageAdapter(Context c) {
        mContext = c;
        int rand = (int) (30 * Math.random());
        dog = new int[rand];
        for(int i = 0; i < rand; i++)
        {
            dog[i] = mThumbIds[(int) (8 * Math.random())];
        }
    }

    public int getCount() {
        return dog.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(4, 4, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(dog[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7
    };
}
