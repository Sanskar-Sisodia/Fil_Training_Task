class bubble{
    public static void main(String []ar){
        int len=ar.length;
        int []arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(ar[i]); //CLI to to array
        }
        
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true; //set true to tell swap occured
                }
            }
            if (!flag) break; //means array is sorted
        }
        for(int i=0;i<len;i++){
            System.out.print("\t"+arr[i]);
        }
    }
}