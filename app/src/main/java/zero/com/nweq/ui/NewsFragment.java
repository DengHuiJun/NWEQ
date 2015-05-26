package zero.com.nweq.ui;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.twotoasters.jazzylistview.JazzyListView;
import com.twotoasters.jazzylistview.effects.SlideInEffect;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;
import zero.com.nweq.R;
import zero.com.nweq.adapter.NewsAdapter;
import zero.com.nweq.beans.News;

/**
 * Created by luowei on 15/4/23.
 */
public class NewsFragment extends Fragment{

    private JazzyListView listView;


    private List<News> dataList;

    private NewsAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        initData();
        adapter = new NewsAdapter(dataList,getActivity());

        listView = (JazzyListView) getActivity().findViewById(R.id.news_list_view);

        listView.setTransitionEffect(new SlideInEffect());

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(),NewsActivity.class);
                i.putExtra("code",position);
                startActivity(i);
            }
        });
    }

    private void initData() {
        dataList = new ArrayList<>();
        News n1 = new News();
        n1.setNewsTitle("福建：农屋前后种竹柳 生态致富两不误");
        n1.setImgId(R.drawable.tese5);
        n1.setNewsSource("中国园林网");
        n1.setNewsTime("2014-5-23 11:57:58");

        News n2= new News();
        n2.setNewsTitle("广西崇左：生态乡村的建设之路");
        n2.setImgId(R.drawable.tese3);
        n2.setNewsSource("国际在线");
        n2.setNewsTime("2015-05-25 13:44:18");

        News n3 = new News();
        n3.setNewsTitle("黄土高原\"玫瑰塬\" 甘肃庆阳推绿色生态致富");
        n3.setImgId(R.drawable.tese2);
        n3.setNewsSource("中国新闻网");
        n3.setNewsTime("2015-05-25 13:39:40");

        News n4 = new News();
        n4.setNewsTitle("新农村建设的郏县实践");
        n4.setImgId(R.drawable.tese4);
        n4.setNewsSource("学习时报");
        n4.setNewsTime("2015-05-25 11:03:09");

        News n5 = new News();
        n5.setNewsTitle("瑞昌市武蛟乡扎实推进新农村建设");
        n5.setImgId(R.drawable.tese6);
        n5.setNewsSource("中国江西网");
        n5.setNewsTime("2015-05-23 09:34:14");


        dataList.add(n1);
        dataList.add(n2);
        dataList.add(n3);
        dataList.add(n4);
        dataList.add(n5);
    }
}
