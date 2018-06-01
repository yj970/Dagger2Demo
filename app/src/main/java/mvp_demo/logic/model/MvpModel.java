package mvp_demo.logic.model;

import com.example.httpmodule.HttpClient;

import javax.inject.Inject;

import mvp_demo.logic.listener.MvpListener;

/**
 * Created by Administrator on 2018/5/29.
 */

public class MvpModel {
    private HttpClient httpClient;

    @Inject
    public MvpModel(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    // 具体实现
    public void request(String id, MvpListener listener) {
        httpClient.post();
        ////
        listener.onSuccess();
        // or
        listener.onFailure();
    }
}
