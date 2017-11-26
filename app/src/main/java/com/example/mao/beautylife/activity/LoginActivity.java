package com.example.mao.beautylife.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.avos.avoscloud.AVUser;
import com.example.mao.beautylife.R;
import com.example.mao.beautylife.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        binding.activityLoginRegister.setOnClickListener(this);
        binding.activityLoginEditTextForget.setOnClickListener(this);
        binding.activityLoginLoginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.activity_login_register:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.activity_login_login_btn:
                String account = binding.activityLoginEditAccount.getText().toString();
                String password = binding.activityLoginEditPass.getText().toString();
                if (account.equals("") || password.equals("")){
                    Toast.makeText(this, "请输入账号与密码", Toast.LENGTH_SHORT).show();
                }else {

                }
            default:
                break;
        }
    }
}
