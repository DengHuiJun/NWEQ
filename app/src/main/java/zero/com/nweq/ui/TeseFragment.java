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
        item1.setImgId(R.drawable.tese1);
        item1.setImgName("暖冬小屋");

        TeseItem item2 = new TeseItem();
        item2.setImgId(R.drawable.tese2);
        item2.setImgName("小平原屋");

        TeseItem item3 = new TeseItem();
        item3.setImgId(R.drawable.tese3);
        item3.setImgName("农家小宅");

        TeseItem item4 = new TeseItem();
        item4.setImgId(R.drawable.tese4);
        item4.setImgName("夜晚栖息");
        TeseItem item5 = new TeseItem();
        item5.setImgId(R.drawable.tese5);
        item5.setImgName("金色年华");

        TeseItem item6 = new TeseItem();
        item6.setImgId(R.drawable.tese6);
        item6.setImgName("悠然湖畔");

        TeseItem item7 = new TeseItem();
        item7.setImgId(R.drawable.tese7);
        item7.setImgName("平川广阔");

        TeseItem item8 = new TeseItem();
        item8.setImgId(R.drawable.tese8);
        item8.setImgName("甜蜜度假");

        for(int i =0 ;i<4;i++) {
            list.add(item1);
            list.add(item2);
            list.add(item3);
            list.add(item4);
            list.add(item5);
            list.add(item6);
            list.add(item7);
            list.add(item8);
        }

    }


}
