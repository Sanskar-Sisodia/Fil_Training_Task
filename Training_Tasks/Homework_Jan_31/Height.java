//Distance
//ft and In

class Dist{
    int ft,in;
    Dist(int ft,int in){
        this.ft=ft;
        this.in=in;
        correct();
    }
    public void correct(){
        if(in>=12){
            ft+=in/12;
            in=in%12;
        }
    }
    public static Dist add(Dist d1,Dist d2){
       return new Dist(d1.ft + d2.ft , d1.in + d2.in);
        
    }
    public static Dist sub(Dist d1, Dist d2) {
        int totalInches1 = d1.ft*12+d1.in;
        int totalInches2 = d2.ft*12+d2.in;
        int diffInches = Math.abs(totalInches1 - totalInches2);
        return new Dist(diffInches / 12, diffInches % 12);
    }
    void display(){
        System.out.println(ft + "feet" + "inch" + in);
    }
}
public class Height{
        public static void main(String[]args){
            if(args.length <4){
                System.out.println("use 4 numbers");
                return;
            }
            int ft1 = Integer.parseInt(args[0]);
            int in1 = Integer.parseInt(args[1]);
            int ft2 = Integer.parseInt(args[2]);
            int in2 = Integer.parseInt(args[3]);
            
            Dist d1 = new Dist(ft1,in1);
            Dist d2 = new Dist(ft2,in2);

            Dist sum=Dist.add(d1,d2);
            System.out.println("total height after sum :");
            sum.display();

            Dist sub=Dist.sub(d1,d2);
            System.out.println("total height after difference");
            sub.display();
        }
    }  
