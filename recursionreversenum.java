/*class HelloWorld {
    public static void main(String[] args) 
    {
      int[] arr={1,2,3,4};
      int start = 0;
      int end = arr.length-1;
      String a="";
      System.out.println(reversenum(arr,start,end,a));
    }
    public static String reversenum(int[] arr,int start,int end,String a)
    {
        if(start > end)
        {
            return a;
        }
        a+=arr[end];
        return reversenum(arr,start,end-1,a);
    }
}*/

class HelloWorld {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr,int start,int end )
    {
        if(start <= end)
        {
          System.out.println(arr[end]);
          reverse(arr,start,end-1);
        }
        
    }
}


