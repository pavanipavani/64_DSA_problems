//Write a program to swap two numbers using extra memory and without extra memory.
//without extra memory
/*class HelloWorld {
    public static void main(String[] args) {
       int a = 1;
       int b = 2;
        System.out.println(a+" "+b);
       
       int temp ;
       temp = a;
       a = b;
       b = temp;
       System.out.println(a+" "+b);
    }
}*/


//extra memory
class helloworld {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        System.out.println(str1+" "+str2);
       
        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.print(str1+" "+str2);
       
    }
}

