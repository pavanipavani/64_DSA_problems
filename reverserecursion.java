class HelloWorld {
    public static void main(String[] args) 
    {
        String str = "pavani";
        String a="";
        System.out.println(reverse(str,a,0,str.length()-1));
    }
    public static String reverse(String str,String a ,int start,int end)
    {
        if(start > end)
        {
            return a;
        }
        a+=str.charAt(end);
        return reverse(str,a,start,end-1);
    }
}
