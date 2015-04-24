package zero.com.nweq.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import zero.com.nweq.R;
import zero.com.nweq.beans.House;

/**
 * Created by luowei on 15/4/21.
 */
public class ThemeAdapter extends ArrayAdapter<House> {

    private int resourceId;

    public ThemeAdapter(Context context, int resource, List<House> list) {
        super(context, resource, list);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        House house = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);

        ImageView house_img = (ImageView) view.findViewById(R.id.theme_house_img);

        TextView house_name = (TextView) view.findViewById(R.id.theme_house_name);

        TextView house_place = (TextView) view.findViewById(R.id.theme_house_place);

        TextView house_theme = (TextView) view.findViewById(R.id.theme_house_theme);

        TextView house_time = (TextView) view.findViewById(R.id.theme_house_time);


        house_img.setImageResource(house.getImageId());
        house_name.setText(house.getHouseName());
        house_place.setText(house.getHousePlace());
        house_theme.setText(house.getTheme());
        house_time.setText(house.getTime());

        return  view;
    }
}
