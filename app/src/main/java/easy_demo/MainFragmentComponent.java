package easy_demo;

import dagger.Component;

/**
 * Created by Administrator on 2018/5/29.
 */

@Component(dependencies = MainActivityComponent.class)
public interface MainFragmentComponent {
    void inject(MainFragment mainFragment);
}
