package easy_demo;

import dagger.Component;

/**
 * Created by Administrator on 2018/5/29.
 */
@Component
public interface SecondActivityComponent {
    void inject(SecondActivity activity);
}
