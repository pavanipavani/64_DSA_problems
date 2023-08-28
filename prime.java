//one number
/*class HelloWorld {
      public static void main(String[] args) {
          
          int num = 10;
          int count = 0;
          for(int i = 1;i<=num;i++)
          {
              if(num%i==0)
              {
                  count++;
              }
          }
          if(count == 2)
          {
              System.out.println("Prime");
          }else
          {
              System.out.println("Not prime");
          }
      }
}*/


//given limit
class HelloWorld {
    public static void main(String[] args) {
       int num = 10;
      
       for(int i = 1;i<= num ;i++)
       {
            int count = 0;
            for(int j = 1;j<=i;j++)
            {
                if(i % j== 0)
                {
                     count++;
                }
            }
           if(count == 2)
           {
               System.out.println(i+" ");
           }
       }
       
    }
}
