package easy_demo;

import com.example.httpmodule.HttpClient;
import com.example.httpmodule.ReClient;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2018/5/29.
 */

@Module
public class HttpModule {

    private int size = 1;

    public HttpModule(int size) {
        this.size = size;
    }

    @Provides
    public HttpClient provideHttpClient(){
        return new HttpClient(size);
    }

    @Provides
    public ReClient provideReClient(HttpClient client){
        return new ReClient(client);
    }
}
