

/*class HelloWorld {
    public static void main(String[] args) {
      String str="pavani";
      int start = 0;
      char[] strArray = str.toCharArray();
       
      System.out.println(strArray);
       
      int end = str.length()-1;
      while(start  < end)
      {
          char temp = strArray[start];
          strArray[start]= strArray[end];
          strArray[end] = temp;
          start++;
          end--;
      }
      System.out.println(strArray);
       
    }
}*/


/*class Helloworld{
    public static void main(String[] args)
    {
        String str = "pavani";
        int i=str.length()-1;
        while(i >=0)
        {
            System.out.print(str.charAt(i));
             i--;
        }
       
    }
}*/

class Helloworld{
    public static void main(String[] args)
    {
        String str = "pavani";
       for(int i=str.length()-1;i>=0;i--)
       {
           
           System.out.print(str.charAt(i));
       }
       
    }
}
