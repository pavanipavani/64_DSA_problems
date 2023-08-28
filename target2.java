/*class HelloWorld {
    public static void main(String[] args) {
       int[] arr ={1,3,5,6,7,4};
       int target = 10;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]+arr[j]==target){
                System.out.println(i+" "+j);
               }
           }
       }
       
    }
}*/

class HelloWorld {
    public static void main(String[] args) {
       int[] arr ={1,3,5,6,7,4};
       int target = 10;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               for(int k=j+1;k<arr.length;k++)
               {
                   if(arr[i]+arr[j]+arr[k]==target){
                     System.out.println(i+" "+j+" "+k);
                   }
               }
           }
       }
       
    }
}
