package mvp_demo.dagger.module;

import dagger.Module;
import dagger.Provides;
import mvp_demo.logic.Contract;

/**
 * Created by Administrator on 2018/5/29.
 */

@Module
public class MvpViewModule {

    private Contract.MvpView view;

    public MvpViewModule(Contract.MvpView view) {
        this.view = view;
    }

    @Provides
    public Contract.MvpView provideView(){
        return view;
    }
}
