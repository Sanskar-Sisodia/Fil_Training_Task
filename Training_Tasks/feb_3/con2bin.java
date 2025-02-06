public class con2bin {
    public static void main(String ar[])
    {
        int dec=Integer.parseInt(ar[0]);
        int bin=0;
        int place=1;
        while(dec!=0)
        {
            bin=bin+(dec%2)*place;
            place=place*10;
            dec=dec/2;
        }
        System.out.println(bin);
    }
}
