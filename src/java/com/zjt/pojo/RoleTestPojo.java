package com.zjt.pojo;

import java.util.List;

public class RoleTestPojo {
    private Integer roleid;

    private Integer mid;

    private String rname;

    private List<TestPojo> list;

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

    public List<TestPojo> getList() {
        return list;
    }

    public void setList(List<TestPojo> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "RoleTestPojo{" +
                "roleid=" + roleid +
                ", mid=" + mid +
                ", rname='" + rname + '\'' +
                ", list=" + list +
                '}';
    }
}
