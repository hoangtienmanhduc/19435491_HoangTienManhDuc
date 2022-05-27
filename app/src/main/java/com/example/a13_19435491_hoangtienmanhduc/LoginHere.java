package com.example.a13_19435491_hoangtienmanhduc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginHere extends AppCompatActivity {

    EditText edtEmail;
    EditText edtPassword;
    Button btnLogin;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_here);

        edtEmail = findViewById(R.id.edt_LoginEmail);
        edtPassword = findViewById(R.id.edt_LoginPassword);
        btnLogin = findViewById(R.id.btn_Login);

        firebaseAuth =  FirebaseAuth.getInstance();
        btnLogin.setOnClickListener(view->{
            login();
        });
    }

    private void login() {
        String email = edtEmail.getText().toString();
        String password = edtPassword.getText().toString();
        if(TextUtils.isEmpty(email)){
            edtEmail.setError("Email cannot be emty");
            edtEmail.requestFocus();
        }
        else if(TextUtils.isEmpty(password)){
            edtPassword.setError("Password cannot be emty");
            edtPassword.requestFocus();
        }
        else{
            firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(LoginHere.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginHere.this,MainActivity.class));
                    }
                    else {
                        Toast.makeText(LoginHere.this, "Đăng nhập lỗi" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}