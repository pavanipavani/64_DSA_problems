class main {
	public static void main(String[] args){
	int[] arr = {1,2,3,4,5,6};
	int sum = 0;
	int i = 0;
	System.out.println(Adding(arr,sum,i));
		
	}
	public static int Adding(int[] arr,int sum,int i){
		if(i == arr.length){
		  return sum;
		}
		
		  sum = sum + arr[i];
		  return Adding(arr,sum,++i);
		
	}
}
