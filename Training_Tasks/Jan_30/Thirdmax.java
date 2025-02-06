
import java.util.Arrays;
class Third
{
    public static void main(String []ar)
    {
        int n=ar.length;
        int []a=new int[n];
        int i,sm,max,pos;
        for(i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(ar[i]);
        }
       /* sm=0;
        max=a[0];
        pos=0;
        for(i=0;i<n;i++)
        {
            sm=sm+a[i];
            if(a[i]>max)
            {
                max=a[i];
                pos=i;
            }
        }
        System.out.println("Sum="+sm);
        System.out.println("Maximum="+max);
        System.out.println("Index="+pos);

    }*/

Arrays.sort(a);
System.out.println(a[n-3]);
    }
}