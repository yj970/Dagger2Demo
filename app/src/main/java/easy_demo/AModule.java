package easy_demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/5/29.
 */

@Module
public class AModule {

    private int n;

    public AModule(int n) {
        this.n = n;
    }

    @Provides
    A provideA() {
        return new A();
    }
}
