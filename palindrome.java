/*class main {
	public static void main(String[] args){
        String str = "amma";
        String a= "";
        for(int i=str.length()-1;i>=0;i--)
        {
            a+=str.charAt(i);
        }
      // System.out.println(a);
        if(a.equals(str))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
	}
}*/
class main
{
    public static void main(String[] args){
        String str="amm";
        int start = 0;
        int end = str.length()-1;
        String result = "";
        while(start < end)
        {
            if(str.charAt(start) == str.charAt(end))
            {
                result ="palindrome";
            }else
            {
                result="not palindrome";
            }
            start++;
            end--;
        }
       System.out.println(result);
  
    }

}
