class Main {
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        int factroial = 1;
        System.out.println(factroial(num,i,factroial));
        
    }
    public static int factroial(int num ,int i,int factroial)
    {
        if(i==num+1)
        {
            return factroial;
        }
        factroial = factroial*i;
        return factroial(num,++i,factroial);
    }
    
}
            
