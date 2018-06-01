package mvp_demo.logic.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;


import java.util.ArrayList;
import java.util.List;

import easy_demo.R;

import javax.inject.Inject;

import mvp_demo.dagger.component.DaggerMvpActivityComponent;
import mvp_demo.dagger.module.MvpViewModule;
import mvp_demo.logic.Contract;
import mvp_demo.logic.presenter.MvpPresenterImpl;

/**
 * Created by Administrator on 2018/5/29.
 */

public class MvpActivity extends Activity implements Contract.MvpView {

    @Inject
    public MvpPresenterImpl presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMvpActivityComponent.builder().mvpViewModule(new MvpViewModule(this)).build().inject(this);

        presenter.request("1");
    }


    @Override
    public void requestSuccess() {
        Log.d("MyTAG", "...success");
    }

    @Override
    public void requestFailure() {
        Log.d("MyTAG", "...failure");
    }
}
