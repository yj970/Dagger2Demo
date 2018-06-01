package mvp_demo.dagger.module;

import com.example.httpmodule.HttpClient;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/5/29.
 */

@Module
public class HttpClientModule {
    private int n = 0;

    public HttpClientModule() {}

    public HttpClientModule(int n) {
        this.n = n;
    }

    @Provides
    public HttpClient provoideHttpClient() {
        return new HttpClient(n);
    }
}
