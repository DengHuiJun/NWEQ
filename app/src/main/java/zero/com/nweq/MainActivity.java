package zero.com.nweq;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import zero.com.nweq.common.UIHelper;
import zero.com.nweq.ui.HomeFragment;
import zero.com.nweq.ui.MeFragment;
import zero.com.nweq.ui.NewsFragment;
import zero.com.nweq.ui.TeseFragment;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    private HomeFragment homeFragment;

    private MeFragment meFragment;

    private NewsFragment newsFragment;

    private TeseFragment teseFragment;

    private View homeLayout;

    private View meLayout;

    private View teseLayout;

    private View newsLayout;

    //定位点击
    private View postion;

    private View search;



    private FragmentManager fragmentManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        getSupportActionBar().hide();




        initView();
        fragmentManager  = getFragmentManager();

        selectFragment();
        
        setBottomSelection(0);
    }

    private void setBottomSelection(int index) {

        clearSelection();

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideAllFragment(transaction);

        switch (index){
            case 0:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.custom_theme_dark));
                if(homeFragment == null){
                    homeFragment = new HomeFragment();
                    transaction.add(R.id.main_fragment,homeFragment);
                }else{
                    transaction.show(homeFragment);
                }
                break;
            case 1:
                newsLayout.setBackgroundColor(getResources().getColor(R.color.custom_theme_dark));

                if(newsFragment == null){
                    newsFragment = new NewsFragment();
                    transaction.add(R.id.main_fragment,newsFragment);
                }else{
                    transaction.show(newsFragment);
                }
                break;
            case 2:
                teseLayout.setBackgroundColor(getResources().getColor(R.color.custom_theme_dark));
                if(teseFragment ==null ){
                    teseFragment = new TeseFragment();
                    transaction.add(R.id.main_fragment,teseFragment);

                }else{
                    transaction.show(teseFragment);
                }
                break;


            case 3:
            default:
                meLayout.setBackgroundColor(getResources().getColor(R.color.custom_theme_dark));
                if(meFragment == null){
                    meFragment = new MeFragment();
                    transaction.add(R.id.main_fragment,meFragment);
                }else{
                    transaction.show(meFragment);
                }
                break;
        }
        transaction.commit();

    }

    /**
     * 清除当前选中状态，将颜色设置为浅色
     */
    private void clearSelection(){
        homeLayout.setBackgroundColor(getResources().getColor(R.color.custom_theme_darker));
        newsLayout.setBackgroundColor(getResources().getColor(R.color.custom_theme_darker));
        meLayout.setBackgroundColor(getResources().getColor(R.color.custom_theme_darker));
        teseLayout.setBackgroundColor(getResources().getColor(R.color.custom_theme_darker));

    }

    /**
     * 隐藏所有的Fragment
     */
    private void hideAllFragment(FragmentTransaction transaction){
        if(homeFragment != null){
            transaction.hide(homeFragment);
        }
        if(meFragment != null){
            transaction.hide(meFragment);
        }
        if(newsFragment != null){
            transaction.hide(newsFragment);
        }
        if(teseFragment != null){
            transaction.hide(teseFragment);
        }
    }



    private void selectFragment() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        if(homeFragment == null){
            homeFragment = new HomeFragment();
            transaction.add(R.id.main_fragment,homeFragment);
        }

        transaction.commit();
    }

    private void initView() {
        homeLayout = findViewById(R.id.bottom_home);
        newsLayout = findViewById(R.id.bottom_news);
        teseLayout = findViewById(R.id.bottom_tese);
        meLayout = findViewById(R.id.bottom_me);
        postion = findViewById(R.id.ll_main_postion);
        search = findViewById(R.id.ll_main_search);

        search.setOnClickListener(this);
        postion.setOnClickListener(this);
        homeLayout.setOnClickListener(this);
        newsLayout.setOnClickListener(this);
        teseLayout.setOnClickListener(this);
        meLayout.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bottom_home:
                setBottomSelection(0);
                break;
            case R.id.bottom_news:
                setBottomSelection(1);
                break;
            case R.id.bottom_tese:
                setBottomSelection(2);
                break;
            case R.id.bottom_me:
                setBottomSelection(3);
                break;

            case R.id.ll_main_postion:
                UIHelper.showPositionActivity(this);
                break;
            case R.id.ll_main_search:
                UIHelper.showSearchActivity(this);
                break;
            default:
                break;
        }


    }
}
