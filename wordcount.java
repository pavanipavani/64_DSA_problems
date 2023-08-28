class main 
{
    public static void main(String[] args)
    {
        String str="i am pavani. i am from palamaner";
       System.out.println(wordcount(str));
        System.out.println(sentancecount(str));
    }
    
     public static int wordcount(String str)
    {
        int count = 0;
       // boolean wordcount = false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) ==' ')
            {
                count++;
            }
        }
        return count+1;
    }
   
    public static int  sentancecount(String str)
    {
        int count = 0;
       // boolean wordcount = false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) =='.')
            {
                count++;
            }
        }
        return count+1;
    }
   
}
