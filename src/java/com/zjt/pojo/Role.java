package com.zjt.pojo;

public class Role {
    private Integer roleid;

    private Integer mid;

    private String rname;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleid=" + roleid +
                ", mid=" + mid +
                ", rname='" + rname + '\'' +
                '}';
    }
}
