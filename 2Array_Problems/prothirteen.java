class prothirteen
{
    public static void main(String[] args)
    {
        int[][] a = {
            {7, 2, 9},
            {4, 1, 6}
        };

        int min = a[0][0];

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                if(a[i][j] < min)
                {
                    min = a[i][j];
                }
            }
        }

        System.out.println(min);
    }
}
