package com.spr3;

public class Branch {
    int bid;
    String bname;

    public Branch() {
        bid = 0;
        bname = "";
    }

    public Branch(int bid, String bname) {
        this.bid = bid;
        this.bname = bname;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Branch [bid=" + bid + ", bname=" + bname + "]";
    }
}
