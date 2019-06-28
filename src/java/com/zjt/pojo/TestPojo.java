package com.zjt.pojo;

import java.util.List;

public class TestPojo {
    private Integer id;

    private String text;

    private Integer sid;

    List<Sonmenu> children;

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

    public List<Sonmenu> getChildren() {
        return children;
    }

    public void setChildren(List<Sonmenu> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "TestPojo{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", sid=" + sid +
                ", children=" + children +
                '}';
    }
}
