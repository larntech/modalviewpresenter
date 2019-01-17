package com.larntech;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{

    @BindView(R.id.email)
    EditText et_email;
    @BindView(R.id.password)
    EditText et_password;
    @BindView(R.id.btn_login)
    Button btnLogin;

    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainActivityPresenter(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {

        String email = et_email.getText().toString();
        String password = et_password.getText().toString();

        presenter.doLogin(email,password);


    }

    @Override
    public void validateLogin() {
        Toast.makeText(getApplicationContext(),"Null input Required",Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(getApplicationContext(),"Login Failure",Toast.LENGTH_LONG).show();

    }
}
