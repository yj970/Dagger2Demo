package easy_demo;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/5/28.
 */

public class A {

    private Integer n ;

//    @Inject
//    public A(Integer n) {
//        this.n = n;
//    }

    @Inject
    public A(){};

    public void a(){
        Log.d("MyTAG", n+"................................request dagger2");
    }
}
