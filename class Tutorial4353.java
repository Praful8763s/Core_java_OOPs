class Tutorial4353 
{
    public static void main(String [] args)
    {
        int a[][]= {{1,1},{2,2}};
        int b[][]={{3,3},{4,4}};
        int c[][];
        
        for(int i=1; i<=2; i++)
        {
            for(int j=1; j<=2; j++)
            {
              for(int k=1; k<=2; k++)
              {
                 int c[i][j] = a[i][k]  * b[j][k];

              }
              extracted(c, i, j);   
            }
            System.out.println();
        }
    
    }

    private static void extracted(int[][] c, int i, int j) {
        System.out.println(c[i][j]);
    }
}