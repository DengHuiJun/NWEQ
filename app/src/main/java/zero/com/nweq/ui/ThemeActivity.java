package zero.com.nweq.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import zero.com.nweq.R;
import zero.com.nweq.adapter.ThemeAdapter;
import zero.com.nweq.beans.House;

/**
 * Created by luowei on 15/4/21.
 */
public class ThemeActivity extends Activity {
    private List<House> houseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ui_theme);


        initHouse();

        ThemeAdapter adapter = new ThemeAdapter(ThemeActivity.this, R.layout.theme_list_view_item,houseList);

        ListView listView = (ListView) findViewById(R.id.theme_lv);

        listView.setAdapter(adapter);

    }

    private void initHouse() {

        houseList = new ArrayList<>();

        House house1 = new House();
        house1.setHouseName("静静农屋");
        house1.setHousePlace("哈尔滨牡丹江附近");
        house1.setTheme("避暑");
        house1.setTime("农屋闲置");
        house1.setImageId(R.drawable.view_one);
        houseList.add(house1);


        House house2 = new House();
        house2.setHouseName("绿地农屋");
        house2.setHousePlace("哈尔滨周边");
        house2.setTheme("避暑");
        house2.setTime("农屋闲置");
        house2.setImageId(R.drawable.bs1);
        houseList.add(house2);

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

        House house5 = new House();
        house5.setHouseName("幽静农屋");
        house5.setHousePlace("哈尔滨太阳岛地区");
        house5.setTheme("避暑");
        house5.setTime("农屋闲置");
        house5.setImageId(R.drawable.bs4);
        houseList.add(house5);

    }
}
