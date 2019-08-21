package com.xjt.model;

public class Student {
    private int sno;
    private String sname;
    private String psw;
    public Student(){

    }
    public Student(int sno,String sname,String psw){
        this.sno=sno;
        this.sname=sname;
        this.psw=psw;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}
