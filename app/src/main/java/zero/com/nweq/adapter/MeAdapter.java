package zero.com.nweq.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import zero.com.nweq.R;
import zero.com.nweq.beans.MeItem;

/**
 * Created by luowei on 15/5/13.
 */
public class MeAdapter extends ArrayAdapter<MeItem> {
    private int resId;

    public MeAdapter(Context context, int resource, List<MeItem> objects) {
        super(context, resource, objects);
        resId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MeItem meItem = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resId, null);

        TextView text = (TextView) view.findViewById(R.id.me_list_view_item_text);

        text.setText(meItem.getText());

        return view;
    }
}
