package com.huatec.hiot_cloud.test_mvptest;

import android.widget.TextView;

import com.huatec.hiot_cloud.test_mvptest.model.User;

public class TestPresenter {
    private TestView view;

    public TestPresenter(TestView view){
        this.view = view;
    }
    public void login(User user){
        if ("huangjinfeng".equals(user.getUserName()) && "615".equals(user.getPassword())){
            view.showMessage("登陆成功");
        }else {
            view.showMessage("登陆失败");
        }
    }
}
