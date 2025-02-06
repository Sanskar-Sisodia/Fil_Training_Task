public class dist {

    int ft;
    int in;

    dist(int ft, int in)
    {
        this.ft=ft;
        this.in=in;
    }

    static void show(dist d1)
    {
        System.out.println("The feets are " + d1.ft + " and the inches are " + d1.in);
    }

    static dist sum(dist d1, dist d2) // why make it static??
    {
       int totalIn= d1.in+d2.in;
       int totalFt= d1.ft+d2.ft;
       int finalFt;
       int finalIn;
       if(totalIn>=12)
       {
        finalIn=totalIn%12;
        finalFt=totalFt+1;
       }
       else
       {
        finalIn=totalIn;
        finalFt=totalFt;
       }
       return new dist(finalFt, finalIn);
    }
    
    public static void main(String []ar)
    {
        int f1, i1, f2, i2;
        f1=Integer.parseInt(ar[0]);
        i1=Integer.parseInt(ar[1]);
        f2=Integer.parseInt(ar[2]);
        i2=Integer.parseInt(ar[3]);
        dist d1= new dist(f1, i1);
        dist d2= new dist(f2, i2);
        dist d3;
        d3= sum(d1, d2);
        show(d3);
    }
}
