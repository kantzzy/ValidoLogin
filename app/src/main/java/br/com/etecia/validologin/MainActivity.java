package br.com.etecia.validologin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtUser, txtPassword;
    Button btnEntrar, btnSair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = (EditText)findViewById(R.id.txtUser);
        txtPassword = (EditText)findViewById(R.id.txtPassword);

        btnEntrar = (Button)findViewById(R.id.btnEntrar);
        btnSair = (Button)findViewById(R.id.btnSair);
    }
}
