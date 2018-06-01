package mvp_demo.logic.presenter;

import javax.inject.Inject;

import mvp_demo.logic.Contract;
import mvp_demo.logic.listener.MvpListener;
import mvp_demo.logic.model.MvpModel;

/**
 * Created by Administrator on 2018/5/29.
 */

public class MvpPresenterImpl implements Contract.Presenter {
    private Contract.MvpView view;
    private MvpModel mvpModel;

    @Inject
    public MvpPresenterImpl(Contract.MvpView view, MvpModel mvpModel) {
        this.view = view;
        this.mvpModel = mvpModel;
    }

    @Override
    public void request(String id) {
        // 业务逻辑
        mvpModel.request(id, new MvpListener() {
            @Override
            public void onSuccess() {
                view.requestSuccess();
            }

            @Override
            public void onFailure() {
                view.requestFailure();
            }
        });
    }
}
