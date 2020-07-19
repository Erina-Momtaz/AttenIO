package com.rothy.attenoio.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.rothy.attenoio.R;
import com.rothy.attenoio.bean.FacultyBean;
import com.rothy.attenoio.context.ApplicationContext;
import com.rothy.attenoio.db.DBAdapter;
import com.tiper.MaterialSpinner;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username,password;
    String userrole;
    CheckBox adminCheckBox;
    //MaterialSpinner spinnerloginas;
    //private String[] userRoleString = new String[] { "admin", "faculty"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login =(Button)findViewById(R.id.buttonlogin);
        username=(EditText)findViewById(R.id.editTextusername);
        password=(EditText)findViewById(R.id.editTextpassword);
        adminCheckBox = (CheckBox) findViewById(R.id.admin_check_box);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                if(adminCheckBox.isChecked())
                {

                    String user_name = username.getText().toString();
                    String pass_word = password.getText().toString();

                    if (TextUtils.isEmpty(user_name))
                    {
                        username.setError("Invalid User Name");
                    }
                    else if(TextUtils.isEmpty(pass_word))
                    {
                        password.setError("enter password");
                    }
                    else
                    {
                        if(user_name.equals("admin") & pass_word.equals("admin123")){
                            Intent intent =new Intent(LoginActivity.this, MenuActivity.class);
                            startActivity(intent);
                            Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                        }else{
                            Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                else
                {
                    String user_name = username.getText().toString();

                    String pass_word = password.getText().toString();

                    if (TextUtils.isEmpty(user_name))
                    {
                        username.setError("Invalid User Name");
                    }
                    else if(TextUtils.isEmpty(pass_word))
                    {
                        password.setError("enter password");
                    }
                    DBAdapter dbAdapter = new DBAdapter(LoginActivity.this);
                    FacultyBean facultyBean = dbAdapter.validateFaculty(user_name, pass_word);

                    if(facultyBean!=null)
                    {
                        Intent intent = new Intent(LoginActivity.this, AddAttandanceSessionActivity.class);
                        startActivity(intent);
                        ((ApplicationContext)LoginActivity.this.getApplicationContext()).setFacultyBean(facultyBean);
                        Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

}