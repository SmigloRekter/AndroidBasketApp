package com.gitara.smiglo.basket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.dd.processbutton.iml.ActionProcessButton;
import com.jaeger.library.StatusBarUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editTextPassword)
    EditText editText2;
    @BindView(R.id.editTextLogin)
    EditText editText3;
    @BindView(R.id.btnSignIn)
    ActionProcessButton btnSignIn;

    private static int SPLASH_TIEM=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //StatusBarUtil.setTranslucent(MainActivity.this,120);
      //  StatusBarUtil.setTransparent(MainActivity.this);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.btnSignIn)
    public void onViewClicked() {
        Toast.makeText(this.getBaseContext(),"elo",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, Main2Activity.class);
        String message = "gitara";
        intent.putExtra("cos",message);
        startActivity(intent);
    }
}
