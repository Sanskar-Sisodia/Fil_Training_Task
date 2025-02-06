public class selectionsort {

    static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex=i;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }

    public static void main(String []ar)
    {
        int a[]= new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=Integer.parseInt(ar[i]);
        }

        /**
         * @author Paritosh
         * here we bring the min element to the front.
         **/

        selectionSort(a);
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
