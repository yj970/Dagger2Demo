package easy_demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import easy_demo.DaggerMainFragmentComponent;
import easy_demo.R;
import com.example.httpmodule.ReClient;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/5/29.
 */

public class MainFragment extends Fragment{

    @Inject
    ReClient reClient;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, null, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        DaggerMainFragmentComponent.builder().mainActivityComponent(((MainActivity)getActivity()).getMainActivityComponent()).build().inject(this);
        reClient.post();
    }
}
