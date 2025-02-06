public class Matrix {
    public static void main(String[] args) {
        int a[][]= new int[3][3];
        int r=0, c=0, j=-1;
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                a[r][c]=Integer.parseInt(args[++j]);
            }
        }

        
        /*for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(a[r][c]);
            }
            System.out.print("\n");
        }*/



        /*int scol=0;
        int srow=0;
        int erow=r-1;
        int ecol=c-1;

        while(srow<=erow && scol<=ecol)
        {
            for(int i=scol;i<=ecol;i++)
            {
                System.out.print(a[srow][i]+" ");
            }
            srow++;
            for(int i=srow;i<=erow;i++)
            {
                System.out.print(a[i][ecol]+" ");
            }
            ecol--;
            for(int i=ecol;i>=scol;i--)
            {
                System.out.print(a[erow][i]+" ");
            }
            erow--;
            for(int i=erow;i>=srow;i--)
            {
                System.out.print(a[i][scol]+" ");
            }
            scol++;
        }*/
    }
}
