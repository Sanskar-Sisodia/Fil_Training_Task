package com.spr2;

public class CourseBranch {
    int cid;
    String cname;
    int duration;
    int bid;
    String bname;

    public CourseBranch() {
        cid = 0;
        cname = "";
        duration = 0;
        bid = 0;
        bname = "";
    }

    public CourseBranch(int cid, String cname, int duration, int bid, String bname) {
        this.cid = cid;
        this.cname = cname;
        this.duration = duration;
        this.bid = bid;
        this.bname = bname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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
        return "CourseBranch [cid=" + cid + ", cname=" + cname + ", duration=" + duration +
               ", bid=" + bid + ", bname=" + bname + "]";
    }
}
