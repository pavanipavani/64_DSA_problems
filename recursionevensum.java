class HelloWorld {
    public static void main(String[] args) {
      int[] arr={2};
      int sum=0;
      int i=0;
      System.out.println(evensum(arr,sum,i));
    }
    public static int evensum(int[] arr,int sum,int i)
    {
        if(i==arr.length)
        {
            return sum;
        }
        if(arr[i]%2==0)
        {
            sum+=arr[i];
        }
        return evensum(arr,sum,++i);
    }
}
