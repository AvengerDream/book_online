package com.book_online.demo.model;

public class Manager {
    private Integer adminid;

    private String adminname;

    private String adminpwd;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd == null ? null : adminpwd.trim();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "adminid=" + adminid +
                ", adminname='" + adminname + '\'' +
                ", adminpwd='" + adminpwd + '\'' +
                '}';
    }
}