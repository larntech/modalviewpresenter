package com.larntech;

import android.text.TextUtils;

/**
 * Created by Richard Kamere on 10/17/2018.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void doLogin(String email, String password) {

        if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
            view.validateLogin();
        }
        else{
            if(email.equals("larntech@gmail.com") && password.equals("qwerty")){
                view.loginSuccess();
            }
            else{
                view.loginError();
            }
        }

    }
}
