// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
       int num = 4;
       for(int i=1;i<=num;i++)
       {
            String a="";
           for(int j=1;j<=num;j++)
           {
               if(i==1 || i==4)
               {
                 a+="*"+" ";
               }else
               {
                   if(j==1||j==2)
                   {
                       a+="*"+" ";
                   }
        
               }
           }
           System.out.println(a);
           
       }
    }
}
