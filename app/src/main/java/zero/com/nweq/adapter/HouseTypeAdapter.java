package zero.com.nweq.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import zero.com.nweq.beans.HouseType;
import zero.com.nweq.R;

/**
 * Created by luowei on 15/4/21.
 */
public class HouseTypeAdapter extends ArrayAdapter<HouseType> {

    private int resourceId;


    public HouseTypeAdapter(Context context, int resource,List<HouseType> objects) {
        super(context, resource,objects);

        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HouseType ht = getItem(position);

        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView houseImg = (ImageView) view.findViewById(R.id.house_type_img);

        houseImg.setImageResource(ht.getImageId());
        return view;
    }
}
