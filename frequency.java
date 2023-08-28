class main
{
    public static void main(String[] args)
    {
        int[] arr={2,3,1,2,1,4};
        int[] result = new int[100];
        for(int i=0;i<arr.length;i++)
        {
            result[arr[i]]+=1;
        }
        for(int j=0;j<result.length;j++)
        {
            if(result[j] > 0)
            {
                System.out.println(" "+j+" : "+result[j]);
            }
        }
    }
}


