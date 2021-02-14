package com.sun.library.pojo;

import java.io.Serializable;

public class Admin implements Serializable {
    private int adminId;//管理员账号
    private String password;//管理员密码

    public Admin() {
    }

    public Admin(int adminId, String password) {
        this.adminId = adminId;
        this.password = password;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "管理员账号=" + adminId +
                ", 管理员密码='" + password + '\'' +
                '}';
    }
}
