class d2points{
    int x;
    int y;

    d2points(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    static void show(d2points p)
    {
        System.out.println("The x co-ordinte is " + p.x + " and the y co-ordinate is " + p.y);
    }

    static double dist(d2points p1, d2points p2)
    {
        double d;
        int m1=p1.x-p2.x;
        int m2=p1.y-p2.y;
        d = Math.sqrt((double)(m2 * m2) + (double)(m1 * m1));
        return d;
    }

    public static void main(String []ar)
    {
        int x1, y1, x2, y2;
        x1=Integer.parseInt(ar[0]);
        y1=Integer.parseInt(ar[1]);
        x2=Integer.parseInt(ar[2]);
        y2=Integer.parseInt(ar[3]);
        d2points p1= new d2points(x1, y1);
        d2points p2= new d2points(x2, y2);
        double d = d2points.dist(p1, p2);
        System.out.println("The distance between the two points is " + d);
    }
}