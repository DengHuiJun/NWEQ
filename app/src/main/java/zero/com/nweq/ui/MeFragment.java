package zero.com.nweq.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import zero.com.nweq.R;
import zero.com.nweq.adapter.MeAdapter;
import zero.com.nweq.beans.MeItem;
import zero.com.nweq.common.UIHelper;

/**
 * Created by luowei on 15/4/23.
 */
public class MeFragment extends Fragment {
   private MeAdapter adapter;
    private ListView listView;
    private List<MeItem> datas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me,container,false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        datas = new ArrayList<>();
        initData();

        listView = (ListView) getActivity().findViewById(R.id.me_list_view);

        adapter = new MeAdapter(getActivity(),R.layout.me_list_view_item,datas);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    UIHelper.showLoginActivity(getActivity());
                }
            }
        });
    }

    private void initData() {
        MeItem item1 = new MeItem("登录／注册");
        MeItem item2 = new MeItem("我的农屋");
        MeItem item3 = new MeItem("我的收藏");
        MeItem item4 = new MeItem("我要上传");
        MeItem item5 = new MeItem("检查更新");
        MeItem item6 = new MeItem("责任声明");
        MeItem item7 = new MeItem("用户反馈");
        MeItem item8 = new MeItem("关于我们");

        datas.add(item1);
        datas.add(item2);
        datas.add(item3);
        datas.add(item4);
        datas.add(item5);
        datas.add(item6);
        datas.add(item7);
        datas.add(item8);

    }


}
