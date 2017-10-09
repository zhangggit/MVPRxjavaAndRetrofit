package com.example.zhanggang.mvprxjavaandretrofit.presenter;

import android.animation.AnimatorListenerAdapter;

import com.example.zhanggang.mvprxjavaandretrofit.model.RegisterModel;
import com.example.zhanggang.mvprxjavaandretrofit.model.bean.Data;
import com.example.zhanggang.mvprxjavaandretrofit.view.RegisterView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by zhanggang on 2017/10/9.
 */

public class RegisterPresenter extends IPresenter<RegisterView> {

    private RegisterModel registerModel;

    public RegisterPresenter(RegisterView view) {
        super(view);
    }

    @Override
    public void init() {
        super.init();
        registerModel = new RegisterModel();
    }

    public void register() {
        Observable<Data> dataObservable = registerModel.register();
        dataObservable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Data>() {
                    @Override
                    public void accept(@NonNull Data data) throws Exception {
                        if (view != null) {
                            view.successed(data);
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        if (view != null) {
                            view.failed(throwable);
                        }
                    }
                });

    }

}
