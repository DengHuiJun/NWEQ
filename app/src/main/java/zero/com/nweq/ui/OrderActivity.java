package zero.com.nweq.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import zero.com.nweq.R;
import zero.com.nweq.beans.House;

/**
 * Created by luowei on 15/5/13.
 */
public class OrderActivity extends Activity {
    @InjectView(R.id.order_content)
    TextView content;

    @InjectView(R.id.order_price)
    TextView price;

    @InjectView(R.id.order_img)
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_order);
        ButterKnife.inject(this);

        House house = (House) getIntent().getBundleExtra("data").getSerializable("house");

        img.setImageResource(house.getImageId());
        String temp = house.getHouseName()+" "+house.getHousePlace()+" "+house.getTheme()+" ";

        content.setText(temp);

        price.setText("租赁费："+house.getPrice()+"/天");


    }

    @OnClick(R.id.order_cancel_btn)
    public void clickCancel(){
        finish();
    }

    @OnClick(R.id.order_ok_btn)
    public void clickOk(){
        Toast.makeText(this,"预定成功！请去支付！",Toast.LENGTH_SHORT).show();
        finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.reset(this);
    }
}
