class day2
{
    public static void main(String [] ar)
    {
        int n=ar.length;
        int []a=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(ar[i]);
        }
        for(i=0;i<n;i++)
        {
           System.out.print(a[i]+" ");
        }
    }
}