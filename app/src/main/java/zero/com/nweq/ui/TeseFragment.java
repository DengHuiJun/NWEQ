package zero.com.nweq.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.twotoasters.jazzylistview.JazzyGridView;
import com.twotoasters.jazzylistview.effects.HelixEffect;

import java.util.ArrayList;
import java.util.List;

import zero.com.nweq.R;
import zero.com.nweq.adapter.TeseAdapter;
import zero.com.nweq.beans.TeseItem;

/**
 * Created by luowei on 15/4/23.
 */
public class TeseFragment extends Fragment {

   private JazzyGridView jazzyGridView;
    private List<TeseItem> list;
    private TeseAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tese,container,false);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();

        jazzyGridView = (JazzyGridView) getActivity().findViewById(R.id.test_grid_view);


        adapter = new TeseAdapter(getActivity(),R.layout.test_item,list);
        jazzyGridView.setAdapter(adapter);
        jazzyGridView.setTransitionEffect(new HelixEffect());



    }

    private void initData() {
        list = new ArrayList<>();
        TeseItem item1 = new TeseItem();
        item1.setImgId(R.drawable.bs1);
        item1.setImgName("湖南科技大学");

        TeseItem item2 = new TeseItem();
        item2.setImgId(R.drawable.bs2);
        item2.setImgName("湖南大学");


        for (int i=0;i<12;i++){
            list.add(item1);
            list.add(item2);
        }
    }


}
