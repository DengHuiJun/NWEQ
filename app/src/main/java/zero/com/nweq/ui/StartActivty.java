package zero.com.nweq.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import zero.com.nweq.R;
import zero.com.nweq.adapter.StartViewPagerAdapter;
import zero.com.nweq.common.UIHelper;

/**
 * Created by luowei on 15/4/21.
 */
public class StartActivty extends Activity {

    private ViewPager viewPager;

    private StartViewPagerAdapter mAdapter;

    private LinearLayout linearLayout;

    private List<View> list;

    private Integer[] img_ids = new Integer[]{R.drawable.guide1,R.drawable.guide2,R.drawable.guide3,R.drawable.guide4};

    private ImageView[] points = new ImageView[img_ids.length];

    private int current = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ui_start);
        list = new ArrayList<>();

        viewPager = (ViewPager) findViewById(R.id.my_view_pager);

        linearLayout = (LinearLayout) findViewById(R.id.start_ll);

        for (int i = 0 ; i<img_ids.length;i++){
            ImageView iv = new ImageView(this);
            iv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,LinearLayout.LayoutParams.FILL_PARENT));
            iv.setImageResource(img_ids[i]);
            list.add(iv);
        }

        mAdapter = new StartViewPagerAdapter(list);
        viewPager.setAdapter(mAdapter);

        viewPager.setOnPageChangeListener(new MyOnPagerChangeListener());

        initPoints();
    }

    private void initPoints() {
        for (int i=0;i<img_ids.length;i++){
            points[i] = (ImageView) linearLayout.getChildAt(i);
            points[i].setImageResource(R.drawable.point_normal);
        }
        current =0 ;
        points[current].setImageResource(R.drawable.point_select);
    }

    class MyOnPagerChangeListener implements ViewPager.OnPageChangeListener{

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            points[position].setImageResource(R.drawable.point_select);
            points[current].setImageResource(R.drawable.point_normal);
            current = position;

            if(position==3){
                UIHelper.showMainActivity(StartActivty.this);
                finish();
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {


        }
    }
}
