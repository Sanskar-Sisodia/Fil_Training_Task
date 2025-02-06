class selection{
    public static void main(String []ar){
        int len=ar.length;
        int []arr=new int[len];

        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(ar[i]);
        }

        for(int i=0;i<len-1;i++){
            int currMinIndex=i;
            for(int j=i+1;j<len;j++){
                if(arr[currMinIndex]>arr[j]){
                    currMinIndex=j;
                }
            }
            if(currMinIndex!=i){
                int temp=arr[i];
                arr[i]=arr[currMinIndex];
                arr[currMinIndex]=temp;
            }
        }
        for(int i=0;i<len;i++){
            System.out.print("\t"+arr[i]);
            
        }
    }
}