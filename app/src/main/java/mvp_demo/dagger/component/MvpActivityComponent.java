package mvp_demo.dagger.component;

import dagger.Component;
import mvp_demo.dagger.module.HttpClientModule;
import mvp_demo.dagger.module.MvpViewModule;
import mvp_demo.logic.view.MvpActivity;

/**
 * Created by Administrator on 2018/5/29.
 */

@Component(modules = {HttpClientModule.class, MvpViewModule.class})
public interface MvpActivityComponent {
    void inject(MvpActivity activity);
}
