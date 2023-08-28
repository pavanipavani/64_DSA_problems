class Main {
    public static void main(String[] args)
    {
       int num = 123;
       int i = 0;
       int sum = 0;
      System.out.println(sumofdigits(num,i,sum));
        
    }
    public static int sumofdigits(int num ,int i,int sum)
    {
       if(i == num)
       {
           return sum;
       }
        int rem = num % 10;
        sum+=rem;
         num = num / 10;
         return sumofdigits(num ,i,sum);
    }
    
}
            
