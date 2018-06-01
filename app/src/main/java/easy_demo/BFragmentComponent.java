package easy_demo;

import dagger.Subcomponent;

/**
 * Created by Administrator on 2018/5/29.
 */

@Subcomponent
public interface BFragmentComponent {

    void inject(BFragment fragment);
}
