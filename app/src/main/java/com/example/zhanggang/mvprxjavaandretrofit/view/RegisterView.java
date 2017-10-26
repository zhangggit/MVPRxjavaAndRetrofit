package com.example.zhanggang.mvprxjavaandretrofit.view;

import com.example.zhanggang.mvprxjavaandretrofit.model.bean.Data;

/**
 * Created by zhanggang on 2017/10/9.
 */

public interface RegisterView extends IView {
    void successed(Data data);
    void failed(Throwable throwable);
}
