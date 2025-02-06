class Money{
    int rupee;
    int paise;

    Money(int rupee,int paise){
        this.rupee=rupee;
        this.paise=paise;
        correct();
    }
    public void correct(){
        if(paise>=100){
            rupee+=paise/100;
            paise=paise%100;
        }
    }
    public Money sum(Money m1,Money m2){
        return new Money(m1.rupee + m2.rupee , m1.paise+m2.paise );
    }
    public static Money sub(Money m1,Money m2){
        int totalPaiseM1=m1.rupee*100 + m1.paise;
        int totalPaiseM2=m2.rupee*100 + m2.paise;
        int diff=Math.abs(totalPaiseM1-totalPaiseM2);
        return new Money(diff/100,diff%100);

    }
    public void display(){
        System.out.println(rupee+ "rupee" + paise + "paise");
    }
}

    public class rupee{
        public static void main(String []ar){
            if(ar.length<4){
                System.out.print("enter 4 numbers");
                return;
            }
            int r1=Integer.parseInt(ar[0]);
            int p1=Integer.parseInt(ar[1]);
            int r2=Integer.parseInt(ar[2]);
            int p2=Integer.parseInt(ar[3]);

            Money m1=new Money(r1,p1);
            Money m2=new Money(r2,p2);

            Money sum=m1.sum(m1,m2);
            System.out.print("The Sum is \t:");
            sum.display();

            Money diff=Money.sub(m1,m2);
            System.out.print("The difference is \t:");
            diff.display();

        }
    }

