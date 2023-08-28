class main 
{
    public static void main(String[] args)
    {
        int num = 64;
        for(int i=0;i<=num;i++)
        {
            if(i*i == num)
            {
                System.out.println("perfect number");
                return;
            }
          
        }
         System.out.println("not perfect number");
    }
}
