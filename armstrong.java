//Write a program to check whether a given number is an Armstrong number or not.

class HelloWorld {
    public static void main(String[] args) {
        int num = 153;
        String str = ""+num;
        int num1 = num;
        int sum = 0;
        while(num > 0)
        {
            int rem = num %10;
            sum+=Math.pow(rem,str.length());
            num = num /10;
        }
        if(sum == num1)
        {
            System.out.println("Armstrong number");
        }else
        {
            System.out.println("Not Armstrong number");
        }
    }
}
