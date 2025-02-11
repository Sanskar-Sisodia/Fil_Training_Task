/**
 * 
 */
package com.spr3;

/**
 * 
 */

    public class Course {
        int cid;
        String cname;
        int duration;

        public Course() {
            cid = 0;
            cname = "";
            duration = 0;
        }

        public Course(int cid, String cname, int duration) {
            this.cid = cid;
            this.cname = cname;
            this.duration = duration;
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

        @Override
        public String toString() {
            return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + "]";
        }
    }



