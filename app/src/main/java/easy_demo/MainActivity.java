package easy_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import easy_demo.R;
import com.example.httpmodule.HttpClient;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    HttpClient httpClient;

    MainActivityComponent mainActivityComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivityComponent = DaggerMainActivityComponent.builder().httpModule(new HttpModule(10)).build();
        mainActivityComponent.inject(this);
        httpClient.post();

        // fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_content, new BFragment()).commitAllowingStateLoss();
    }

    public MainActivityComponent getMainActivityComponent() {
        return mainActivityComponent;
    }
}
