package easy_demo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import easy_demo.DaggerSecondActivityComponent;
import easy_demo.R;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/5/29.
 */

public class SecondActivity extends Activity {

    @Inject
    A a;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerSecondActivityComponent.create().inject(this);
        a.a();

    }
}
