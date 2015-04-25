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
        n1.setBody("<p><a href='http://www.yuanlin.com' target='_blank' class='ak'>中国园林网</a>5月23日消息：红砖、赤瓦、绿竹……昨日，记者来到茂霞村时，刚好下着细雨，远远望去，古厝群、竹林笼罩在薄雾中，别有一番情趣。站在一座百年古厝前，前面便是一大片速生竹柳<a href='http://www.yuanlin.com/' target='_blank' class='ak'>苗木</a>基地，笔直的树干，远看是一片“竹子”，近看则是一株株指头粗的“柳树”。</p><p>“这是速生竹柳。”茂霞村村委会主任陈建华说，该树种是柳树新品种，其形态、侧枝、密植性跟竹子相似，遂取名为竹柳。</p><p>“我们村‘半村绿树半村楼’，开门见绿，出门踏绿。”陈建华说，村里致力打造“美丽乡村”，全村拥有百年以上的古厝70多座，屋前屋后种上荔枝树和速生竹柳，古厝与绿树相衬。由于生态好、村落保护好，去年底，茂霞村入选首批“中国传统村落”。该荣誉具有十足的含金量，由国家住房城乡建设部等四部委主办评选。</p><p>海外游子美国引种</p><p>岵山镇的茂霞村、岭头村、和林村等村庄种植速生竹柳300多亩，约900万株，其中茂霞村居多。美国的新种类什么会跑到岵山镇来呢？陈建华介绍，这是福建省祥业农业科技有限公司董事长陈丽春引进的。</p><p>陈丽春是岵山镇茂霞村人，早年旅居香港。有一次回乡，她看到茂霞村生态保护得很好，但是一些土地没有得到有效利用，不少劳动力闲置。她经过多次考察和论证，从美国引进了速生竹柳，经过专家的试种和改良产生新的速生竹柳品种，2012年在岵山镇茂霞村种植成功，现在已是成片的苗木基地。</p><p>“竹柳是绿色品种，没有污染，引进竹柳可生态造林，又造福村民。”陈丽春说，在保留原美国竹柳各种优良特性的基础上，成功繁育出的新一代速生竹柳品种在长势、抗逆性、速生性、适应性等方面，更优于原母本，其抗旱、抗湿、抗碱等方面的能力也大大加强。在乡里种植，既美化环境，又让农民增收。</p><p>“一年能增加收入1万多元。”茂霞村60多岁的陈阿姨说，她平时在家做点农活，农闲时没有事做，自从速生竹柳苗木基地建成后，她又找到了一份工作。</p><p>“竹柳不仅美化环境，而且生长速度快，经济价值可观。”陈建华说，陈丽春从老乡手里承包下农田，再雇村民耕种。种植、锄草、施肥、剪苗木……既解决了农村空闲劳动力的就业问题，又增加了农民收入。</p><p><span style=\"color:#0000ff\">推荐阅读：</span></p><p><a title=\"浙江：天台生态致富 实现“美丽经济”转变\" href=\"http://news.yuanlin.com/detail/2014326/177849.htm\" target=\"_blank\"><span style=\"color:#0000ff\">浙江：天台生态致富&nbsp;实现“美丽经济”转变</span></a></p><p><a title=\"广西：生态致富 钟山万亩花卉助农增收\" href=\"http://news.yuanlin.com/detail/2014325/177676.htm\" target=\"_blank\"><span style=\"color:#0000ff\">广西：生态致富&nbsp;钟山万亩花卉助农增收</span></a></p><p><a title=\"福建：平和“林下经济”金线莲种值促农走上生态致富路\" href=\"http://news.yuanlin.com/detail/2013129/167789.htm\" target=\"_blank\"><span style=\"color:#0000ff\">福建：平和“林下经济”金线莲种值促农走上生态致富路</span></a></p>");

        dataList.add(n1);
    }
}
