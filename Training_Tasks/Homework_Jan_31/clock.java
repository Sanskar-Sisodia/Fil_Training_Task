class timing {
    int hr, min, sec;
    timing(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        correct();
    }
    public void correct() {
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min = min % 60;
        }
    }
    public static timing add(timing t1, timing t2) {
        return new timing(t1.hr + t2.hr, t1.min + t2.min, t1.sec + t2.sec);
    }

    public static timing sub(timing t1, timing t2) {
        int totalSeconds1 = t1.hr * 3600 + t1.min * 60 + t1.sec;
        int totalSeconds2 = t2.hr * 3600 + t2.min * 60 + t2.sec;
        int diffSeconds = Math.abs(totalSeconds1 - totalSeconds2);
        return new timing(diffSeconds / 3600, (diffSeconds % 3600) / 60, diffSeconds % 60);
    }

    void display() {
        System.out.println(hr + " hours " + min + " minutes " + sec + " seconds");
    }
}

public class csa {
    public static void main(String[] args) {
        if (args.length < 6) {
            System.out.println("Use 6 numbers (hours1 minutes1 seconds1 hours2 minutes2 seconds2)");
            return;
        }

        int hr1 = Integer.parseInt(args[0]);
        int min1 = Integer.parseInt(args[1]);
        int sec1 = Integer.parseInt(args[2]);
        int hr2 = Integer.parseInt(args[3]);
        int min2 = Integer.parseInt(args[4]);
        int sec2 = Integer.parseInt(args[5]);

        timing t1 = new timing(hr1, min1, sec1);
        timing t2 = new timing(hr2, min2, sec2);

        timing sum = timing.add(t1, t2);
        System.out.println("Total timing after addition:");
        sum.display();

        timing diff = timing.sub(t1, t2);
        System.out.println("Total timing after difference:");
        diff.display();
    }
}
