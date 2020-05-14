package com.corejava.com.corejava.aarna;

public class Department {
    private String departmentname;

    public Department(String departmentname, String depid, String departmentlocation) {
        this.departmentname = departmentname;
        this.depid = depid;
        this.departmentlocation = departmentlocation;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid;
    }

    public String getDepartmentlocation() {
        return departmentlocation;
    }

    public void setDepartmentlocation(String departmentlocation) {
        this.departmentlocation = departmentlocation;
    }

    private String depid;
    private String departmentlocation;

}
