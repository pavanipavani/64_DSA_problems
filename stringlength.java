class Main {
    public static void main(String[] args) {
        String str = "stringLength";
        System.out.println(lengthOfString(str, 0));
        }
        public static int lengthOfString(String str, int index) {
            if (index == str.length()) {
                return 0;
                
            }
            return 1+ lengthOfString(str, index+1 );
        }
    
}
