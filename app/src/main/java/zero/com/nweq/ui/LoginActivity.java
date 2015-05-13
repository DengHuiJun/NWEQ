package zero.com.nweq.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import zero.com.nweq.R;
import zero.com.nweq.common.UIHelper;

/**
 * Created by luowei on 15/4/26.
 */
public class LoginActivity extends Activity {

    @InjectView(R.id.login_name_et)
    EditText name;

    @InjectView(R.id.login_pass_et)
    EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_login);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.login_btn_login)
    public void toMainActivity(){
        if(  name.getText().toString().equals("")  || pass.getText().toString().equals("")){
            Toast.makeText(this,"有一项为空！注册失败！",Toast.LENGTH_SHORT).show();

        }else{
            UIHelper.showMainActivity(this);
            Toast.makeText(this,"注册成功！",Toast.LENGTH_SHORT).show();
            finish();

        }


    }

    @OnClick(R.id.login_btn_out)
    public void toRegister(){
        if(  name.getText().toString().equals("")  || pass.getText().toString().equals("")) {
            Toast.makeText(this,"有一项为空！登录失败！",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "登录成功！", Toast.LENGTH_SHORT).show();
            UIHelper.showMainActivity(this);
            finish();
        }
    }



}
