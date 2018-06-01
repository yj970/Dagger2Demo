package easy_demo;

import com.example.httpmodule.ReClient;

/**
 * Created by Administrator on 2018/5/29.
 */

@dagger.Component(modules = HttpModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

    ReClient provideReClient();

    BFragmentComponent bFragmentComponent();
}
