package com.corejava.com.corejava.aarna;

public class Employee {
    public Employee(String fname, String loginid, String lname, String empid, String depid) {
        this.fname = fname;
        this.loginid = loginid;
        this.lname = lname;
        this.empid = empid;
        this.departmentid = depid;
    }

    private String fname;
    private String loginid;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }



    private String lname;
    private String empid;

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    private String departmentid;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private String location;

}
