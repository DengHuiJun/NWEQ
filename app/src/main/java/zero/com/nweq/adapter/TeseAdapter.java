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
import zero.com.nweq.beans.TeseItem;

/**
 * Created by luowei on 15/4/25.
 */
public class TeseAdapter extends ArrayAdapter<TeseItem> {

    private int resourceId;

    public TeseAdapter(Context context, int resource, List<TeseItem> objs) {
        super(context, resource, objs);

        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TeseItem item = getItem(position);


        View v = LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView img = (ImageView) v.findViewById(R.id.tese_item_img);
        TextView tv = (TextView) v.findViewById(R.id.tese_item_text);

        img.setImageResource(item.getImgId());
        tv.setText(item.getImgName());
        return v;
    }
}
