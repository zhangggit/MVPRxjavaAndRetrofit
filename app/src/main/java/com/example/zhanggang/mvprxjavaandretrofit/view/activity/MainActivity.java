package com.example.zhanggang.mvprxjavaandretrofit.view.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zhanggang.mvprxjavaandretrofit.R;
import com.example.zhanggang.mvprxjavaandretrofit.model.bean.Data;
import com.example.zhanggang.mvprxjavaandretrofit.presenter.RegisterPresenter;
import com.example.zhanggang.mvprxjavaandretrofit.view.RegisterView;

public class MainActivity extends AppCompatActivity implements RegisterView {

    private static final String TAG = "TAG";
    private TextView textView;
    private RegisterPresenter registerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textview);

        registerPresenter = new RegisterPresenter(this);

    }
    public void onClick(View view) {
        registerPresenter.register();
    }

    @Override
    public void successed(Data data) {
        Toast.makeText(this, ""+data.results.get(0).title, Toast.LENGTH_SHORT).show();
        textView.setText(data.results.get(0).title);
    }

    @Override
    public void failed(Throwable throwable) {
        Log.e(TAG, "failed: "+throwable );
        Toast.makeText(this, "失败了！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context content() {
        return this;
    }


}
