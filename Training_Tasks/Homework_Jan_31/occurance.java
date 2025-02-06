class occurance{
    public static void main(String[]ar){
        char c='s';
        int count=0;
        String input=ar[0];
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==c){
                count++;
            }
        }
        System.out.println("occurance of " + c + "= "+count);
    }
}