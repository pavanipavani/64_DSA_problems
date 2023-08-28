
/*class HelloWorld {
    public static void main(String[] args) {
      int[] arr = {2,4,1,3,7,9,8,5};
      for(int i = 0;i<arr.length;i++)
      {
          for(int j = 1;j<arr.length;j++)
          {
              if(arr[j] < arr[j-1])
              {
                  int temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
              }
          }
      }
      for(int i = 1;i<arr.length;i++)
      {
          System.out.println(arr[arr.length-3]);
          System.out.println(arr[arr[1]]);
          break;
      }
       
    }
}*/

public class main{
  
    public static void main (String[]args)
      {
    int[] arr ={3,7,2,8,1,9,4};
    
    int min=arr[0];
    
    int second=arr[0];
    
    int third=arr[0];
    
       for(int i=0;i<arr.length;i++)
    
             {
         
            if(arr[i]<min )
         
              {
        
             second=min;
         
             min=arr[i];
         
               }
         
            else if(arr[i]<second)
         
               {
         
                  third=second;
                  
                  second=arr[i];
                  
               }
               
            else if (arr[i]<third)
       
              {
              
                 third=arr[i];
              }
              
        }
         System.out.println(min);
         
         System.out.println(second);
         
         System.out.println(third);
       }
        
        
         
 }


