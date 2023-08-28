class HelloWorld {
    public static void main(String[] args) {
       int num = 5;
     
     for(int i=1;i<=num-2;i++)
     {
         String a="";
         for(int j=1;j<=num;j++)
         {
            if(i==1 )
            {
                a+="*"+" ";
            }else if(j==1)
            {
                a+="*"+" ";
            }
         }
         System.out.println(a);
     }
     
    }
}
