package com.rothy.attenoio.context;

import android.app.Application;

import com.rothy.attenoio.bean.AttendanceBean;
import com.rothy.attenoio.bean.AttendanceSessionBean;
import com.rothy.attenoio.bean.FacultyBean;
import com.rothy.attenoio.bean.StudentBean;

import java.util.ArrayList;

public class ApplicationContext extends Application {
    private FacultyBean facultyBean;
    private AttendanceSessionBean attendanceSessionBean;
    private ArrayList<StudentBean> studentBeanList;
    private ArrayList<AttendanceBean> attendanceBeanList;

    public FacultyBean getFacultyBean() {
        return facultyBean;
    }
    public void setFacultyBean(FacultyBean facultyBean) {
        this.facultyBean = facultyBean;
    }
    public AttendanceSessionBean getAttendanceSessionBean() {
        return attendanceSessionBean;
    }
    public void setAttendanceSessionBean(AttendanceSessionBean attendanceSessionBean) {
        this.attendanceSessionBean = attendanceSessionBean;
    }
    public ArrayList<StudentBean> getStudentBeanList() {
        return studentBeanList;
    }
    public void setStudentBeanList(ArrayList<StudentBean> studentBeanList) {
        this.studentBeanList = studentBeanList;
    }
    public ArrayList<AttendanceBean> getAttendanceBeanList() {
        return attendanceBeanList;
    }
    public void setAttendanceBeanList(ArrayList<AttendanceBean> attendanceBeanList) {
        this.attendanceBeanList = attendanceBeanList;
    }
}
