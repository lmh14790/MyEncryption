package com.yztc.myencryption;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.rsaEncryption)
    Button rsaEncryption;
    @InjectView(R.id.rsaDecryption)
    Button rsaDecryption;
    @InjectView(R.id.base64Encrytion)
    Button base64Encrytion;
    @InjectView(R.id.base64Decrytion)
    Button base64Decrytion;
    @InjectView(R.id.md5Encrytion)
    Button md5Encrytion;
    @InjectView(R.id.desEncrytion)
    Button desEncrytion;
    @InjectView(R.id.desDecrytion)
    Button desDecrytion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.rsaEncryption, R.id.rsaDecryption, R.id.base64Encrytion, R.id.base64Decrytion, R.id.md5Encrytion, R.id.desEncrytion, R.id.desDecrytion})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rsaEncryption:
                break;
            case R.id.rsaDecryption:
                break;
            case R.id.base64Encrytion:
                break;
            case R.id.base64Decrytion:
                break;
            case R.id.md5Encrytion:
                break;
            case R.id.desEncrytion:
                break;
            case R.id.desDecrytion:
                break;
        }
    }
}
