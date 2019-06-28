package com.zjt.pojo;

import java.util.List;

public class Mainmenu {
    private Integer id;

    private String text;

    private Integer sid;

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

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Mainmenu{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", sid=" + sid +
                '}';
    }
}