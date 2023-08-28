class Main {
    public static void main(String[] args) {
        String str = "stringLength";
        int index=0;
        int count = 0;
        System.out.println(lengthOfString(str, index,count));
        }
        public static int lengthOfString(String str, int index,int count) {
            if (index == str.length()) {
                return count;
                
            }
            
            return  lengthOfString(str, ++index,++count);
        }
    
}
