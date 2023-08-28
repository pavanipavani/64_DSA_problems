class HelloWorld {
    public static void main(String[] args) {
        int num = 12314211;
        int digit = 3;
        int i = 0;
        int occur = 0;
        System.out.println(occurance(num,digit,i,occur));
        
    }
    public static int occurance(int num,int digit,int i,int occur)
    {
        if(i == num)
        {
            return occur;
        }
        int rem = num % 10;
        num = num/10;
        if(rem == digit)
        {
            occur++;
        }
        return occurance(num,digit,i,occur);
    }
}
