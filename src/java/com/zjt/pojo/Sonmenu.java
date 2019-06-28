package com.zjt.pojo;

public class Sonmenu {
    private Integer id;

    private String text;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Sonmenu{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", pid=" + pid +
                '}';
    }
}