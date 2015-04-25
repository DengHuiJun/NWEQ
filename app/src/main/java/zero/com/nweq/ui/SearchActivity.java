package zero.com.nweq.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import zero.com.nweq.R;

/**
 * Created by luowei on 15/4/23.
 */
public class SearchActivity extends Activity {

    private List<String> list;


    private Spinner spinner;


    private ArrayAdapter<String> arrayAdapter;

    @InjectView(R.id.search_et)
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_search);

        ButterKnife.inject(this);

        spinner = (Spinner) findViewById(R.id.search_spinner);

        list = new ArrayList<>();
        list.add("北京");
        list.add("上海");
        list.add("深圳");
        list.add("福州");
        list.add("厦门");

        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                et.setText(arrayAdapter.getItem(position));
                parent.setVisibility(View.VISIBLE);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @OnClick(R.id.search_cancel)
    public void cancel(){
        finish();
    }
}
