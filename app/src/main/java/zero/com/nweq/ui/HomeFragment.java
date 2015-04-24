package zero.com.nweq.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import zero.com.nweq.R;
import zero.com.nweq.adapter.HouseTypeAdapter;
import zero.com.nweq.adapter.ThemeAdapter;
import zero.com.nweq.beans.House;
import zero.com.nweq.beans.HouseType;
import zero.com.nweq.common.UIHelper;
import zero.com.nweq.myview.SlideShowView;

/**
 * Created by luowei on 15/4/20.
 */
public class HomeFragment extends Fragment {

    private GridView gridView;

    private List<HouseType> list;

    private HouseTypeAdapter adapter;

    private List<Integer> imgList;

    private SlideShowView slideShowView;


    private ListView listView;

    private List<House> houseList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View homeLayout = inflater.inflate(R.layout.fragment_home,container,false);

        return homeLayout;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();

        //中间的主题分类
        adapter = new HouseTypeAdapter(getActivity(),R.layout.item_house_type,list);
        gridView = (GridView) getActivity().findViewById(R.id.main_gv);
        gridView.setAdapter(adapter);

        //图片自动轮播
        slideShowView = (SlideShowView) getActivity().findViewById(R.id.slide_view);
        slideShowView.setImageUris(imgList);

        listView = (ListView) getActivity().findViewById(R.id.home_list_view);
        ThemeAdapter adapter = new ThemeAdapter(getActivity(), R.layout.theme_list_view_item,houseList);
        listView.setAdapter(adapter);

        initEvent();

    }

    private void initEvent() {
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:
                       UIHelper.showThemeActivity(getActivity());
                       break;
                   case 1:
                       UIHelper.showThemeActivity(getActivity());
                       break;
                   case 2:
                       UIHelper.showThemeActivity(getActivity());
                       break;
                   case 3:
                       UIHelper.showThemeActivity(getActivity());
                       break;
                   case 4:
                       UIHelper.showThemeActivity(getActivity());
                       break;
                   case 5:
                       UIHelper.showThemeActivity(getActivity());
                   default:
                           break;
               }

            }
        });
    }

    private void initData() {
        list = new ArrayList<>();
        HouseType ht1 = new HouseType(R.drawable.gv_bishu);
        list.add(ht1);

        HouseType ht2 = new HouseType(R.drawable.gv_xiuxian);
        list.add(ht2);

        HouseType ht3 = new HouseType(R.drawable.gv_lvyou);
        list.add(ht3);

        HouseType ht4 = new HouseType(R.drawable.gv_guodong);
        list.add(ht4);

        HouseType ht5 = new HouseType(R.drawable.gv_yanglao);
        list.add(ht5);

        HouseType ht6 = new HouseType(R.drawable.gv_tiyan);
        list.add(ht6);


        imgList = new ArrayList<>();
        imgList.add(R.drawable.bs1);
        imgList.add(R.drawable.bs2);
        imgList.add(R.drawable.bs3);


        houseList = new ArrayList<>();

        House house3 = new House();
        house3.setHouseName("避暑之都");
        house3.setHousePlace("贵阳花溪区");
        house3.setTheme("避暑");
        house3.setTime("农屋闲置");
        house3.setImageId(R.drawable.bs2);
        houseList.add(house3);

        House house4 = new House();
        house4.setHouseName("悠然小屋");
        house4.setHousePlace("黑龙江垦区");
        house4.setTheme("避暑");
        house4.setTime("农屋闲置");
        house4.setImageId(R.drawable.bs3);
        houseList.add(house4);

    }
}
