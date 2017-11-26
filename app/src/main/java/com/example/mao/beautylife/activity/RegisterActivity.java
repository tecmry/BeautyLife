package com.example.mao.beautylife.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVUser;
import com.avos.avoscloud.RequestMobileCodeCallback;
import com.example.mao.beautylife.R;
import com.example.mao.beautylife.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        binding.activityRegisterBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.activity_register_btn:
                String userName = binding.activityRegisterEditName.getText().toString();
                String pass = binding.activityRegisterEditPass.getText().toString();
                String confirm = binding.activityLoginEditConfirm.getText().toString();
                String email = binding.activityRegisterEditEmail.getText().toString();
                if (userName.equals("") || pass.equals("") || confirm.equals("") || email.equals(""))
                    Toast.makeText(this, "请填写完整用户信息", Toast.LENGTH_SHORT).show();
                else if (!pass.equals(confirm))
                    Toast.makeText(this, "两次输入密码不相同", Toast.LENGTH_SHORT).show();
                else {

                }
        }
    }
}
