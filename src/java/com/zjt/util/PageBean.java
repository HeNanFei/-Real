package com.zjt.util;

import java.util.Date;

public class PageBean {
    private int page;

    private int rows;

    private Date edate;

    private String keyWord;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "page=" + page +
                ", rows=" + rows +
                ", edate=" + edate +
                ", keyWord='" + keyWord + '\'' +
                '}';
    }
}
