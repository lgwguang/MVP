package android.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jess.arms.base.BaseActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
