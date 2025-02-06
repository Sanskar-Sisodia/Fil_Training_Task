public class compnum {
        int i;
        int j;
        
        compnum(int i, int j)
        {
            this.i=i;
            this.j=j;
        }

        void show()
        {
            System.out.println("The number is" + i + " + " + j + "i");
        }

        static compnum compAdd(compnum c1, compnum c2)
        {
            int real=c1.i+c2.i;
            int imag=c1.j+c2.j;
            return new compnum(real, imag);
        }
        static compnum comprod(compnum c1, compnum c2)
        {
            int real= (c1.i*c2.i)-(c2.j*c1.j);
            int imag= (c1.i*c2.j)-(c2.i*c1.j);
            return new compnum(real, imag);
        }

        public static void main(String [] ar)
        {
            int a1, a2, b1, b2;
            a1=Integer.parseInt(ar[0]);
            a2=Integer.parseInt(ar[1]);
            b1=Integer.parseInt(ar[2]);
            b2=Integer.parseInt(ar[3]);
            compnum c1= new compnum(a1, a2);
            compnum c2= new compnum(b1, b2);
            compnum c3;
            c3= comprod(c1, c2);
            c3.show();
        }
}
