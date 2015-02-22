package org.studentrnd.clear.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import org.studentrnd.clear.R;
import org.studentrnd.clear.api.Event;
import org.studentrnd.clear.api.Region;
import org.studentrnd.clear.app.AppController;

import java.util.List;

/**
 * Created by tj on 2/22/15.
 */
public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Region> eventItem;
    // ImageLoader imageLoader = AppController.getInstance().getImageLoader();

    public CustomListAdapter(Activity activity, List<Region> eventItem) {
        this.activity = activity;
        this.eventItem = eventItem;
    }

    @Override
    public int getCount() {
        return eventItem.size();
    }

    @Override
    public Object getItem(int location) {
        return eventItem.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_row, null);

        //if (imageLoader == null)
            //imageLoader = AppController.getInstance().getImageLoader();

        NetworkImageView thumbNail = (NetworkImageView) convertView.findViewById(R.id.thumbnail);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView rating = (TextView) convertView.findViewById(R.id.rating);
        TextView genre = (TextView) convertView.findViewById(R.id.genre);
        TextView year = (TextView) convertView.findViewById(R.id.releaseYear);

        // getting movie data for the row
        Region region = eventItem.get(position);

        // thumbnail image
        // thumbNail.setImageUrl(region.getThumbnailUrl(), imageLoader);

        // title
        title.setText(region.name);

        // rating
        rating.setText("Rating: " + String.valueOf("So dank 10/10"));

        // genre
        String genreStr = "Dank";
        // for (String str : region.getGenre()) {
        //   genreStr += str + ", ";
        // }
        genreStr = genreStr.length() > 0 ? genreStr.substring(0,
                genreStr.length() - 2) : genreStr;
        genre.setText(genreStr);

        // release year
        year.setText(String.valueOf(region.name));

        return convertView;
    }
}
