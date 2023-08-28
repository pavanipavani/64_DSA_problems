class HelloWorld {
    public static void main(String[] args) {
        String str="amma";
        int start = 0;
        int end=str.length()-1;
       boolean ispalindrome = palindrome(str,start,end);
       if(ispalindrome)
       {
           System.out.println("palindrome");
       }else
       {
           System.out.println("Not palindrome");
       }
    }
    public static boolean palindrome(String str,int start,int end)
    {
        if(start >= end)
        {
            return false;
        }
        if(str.charAt(start) == str.charAt(end))
        {
            return true;
        }
        return palindrome(str,start+1,end-1);
    }
}
