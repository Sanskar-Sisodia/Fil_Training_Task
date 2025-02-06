class matrix
{
    public static void main(String []ar)
    {
        int a[][]=new int[3][3];
        int r,c,j=-1;
        for(r=0;r<3;r++){
            for(c=0;c<3;c++){
                a[r][c]=Integer.parseInt(ar[++j]);
            }
        }
            for(r=0;r<3;r++){
            for(c=0;c<3;c++){
                System.out.print("\t"+a[r][c]);
            }
            System.out.println();
        }
    }
}