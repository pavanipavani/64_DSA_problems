class HelloWorld {
    public static void main(String[] args) {
       int num = 4;
     
      for(int i=1;i<=num;i++)
      {
           String a="";
          for(int j=i;j<=num;j++)
          {
              a+="*"+" ";
          }
           System.out.println(a);
      }
     
    }
}
