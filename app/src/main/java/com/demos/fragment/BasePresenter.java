package com.demos.fragment;


import com.demos.fragment.greendao.DaoSession;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.king.base.util.LogUtils;

import javax.inject.Inject;

/**
 * Created by prashant.patel on 11/24/2017.
 */

public class BasePresenter<V extends BaseView> extends MvpBasePresenter<V> {

    private App app;

    private DaoSession mDaoSession;

    private AppComponent mAppComponent;

    @Inject
    public BasePresenter(App app){
        super();
        this.app = app;
        mDaoSession = app.getDaoSession();
        mAppComponent = app.getAppCommponent();
    }


    public AppComponent getAppComponent(){
        return mAppComponent;
    }

    public DaoSession getDaoSession(){
        return mDaoSession;
    }

    public App getApp(){
        return getApp();
    }

    @Override
    public boolean isViewAttached() {
        LogUtils.d("isViewAttached:" + super.isViewAttached());
        return super.isViewAttached();
    }
}
