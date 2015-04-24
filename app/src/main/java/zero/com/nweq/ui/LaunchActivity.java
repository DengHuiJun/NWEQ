package zero.com.nweq.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.Window;


import android.os.Handler;

import zero.com.nweq.R;
import zero.com.nweq.common.UIHelper;

/**
 * Created by luowei on 15/4/22.
 */
public class LaunchActivity extends Activity {

    private Handler handler = new Handler() {
        public void handleMessage(Message msg){
            if(msg.what == 12){
               UIHelper.showMainActivity(LaunchActivity.this);
               finish();
               // UIHelper.showThemeActivity(LaunchActivity.this);
//                Intent i = new Intent(LaunchActivity.this,StartActivty.class);
//                startActivity(i);
//                finish();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.ui_launch);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Message msg = Message.obtain();
                msg.what = 12;
                handler.sendMessage(msg);
            }
        }).start();
    }
}

