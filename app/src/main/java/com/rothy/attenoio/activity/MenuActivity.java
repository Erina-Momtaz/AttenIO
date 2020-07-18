package com.rothy.attenoio.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.rothy.attenoio.R;
import com.rothy.attenoio.bean.AttendanceBean;
import com.rothy.attenoio.context.ApplicationContext;
import com.rothy.attenoio.db.DBAdapter;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

     LinearLayout addStudent, addFaculty, viewStudent, viewFaculty, logout, attendancePerStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        addStudent =(LinearLayout) findViewById(R.id.buttonaddstudent);
        addFaculty =(LinearLayout) findViewById(R.id.buttonaddfaculty);
        viewStudent =(LinearLayout) findViewById(R.id.buttonViewstudent);
        viewFaculty =(LinearLayout) findViewById(R.id.buttonviewfaculty);
        logout =(LinearLayout) findViewById(R.id.buttonlogout);

        addStudent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent =new Intent(MenuActivity.this,AddStudentActivity.class);
                startActivity(intent);
            }
        });

        addFaculty.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent =new Intent(MenuActivity.this,AddFacultyActivity.class);
                startActivity(intent);
            }
        });

        viewFaculty.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent =new Intent(MenuActivity.this,ViewFacultyActivity.class);
                startActivity(intent);
            }
        });


        viewStudent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent =new Intent(MenuActivity.this,ViewStudentActivity.class);
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Intent intent =new Intent(MenuActivity.this,LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        attendancePerStudent=(LinearLayout) findViewById(R.id.attendancePerStudentButton);
        attendancePerStudent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

//                DBAdapter dbAdapter = new DBAdapter(MenuActivity.this);
//                ArrayList<AttendanceBean> attendanceBeanList=dbAdapter.getAllAttendanceByStudent();
//                ((ApplicationContext)MenuActivity.this.getApplicationContext()).setAttendanceBeanList(attendanceBeanList);


            }
        });

    }
}