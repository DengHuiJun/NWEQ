package zero.com.nweq.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zero.com.nweq.R;

/**
 * Created by luowei on 15/4/23.
 */
public class TeseFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tese,container,false);
        return view;
    }
}
