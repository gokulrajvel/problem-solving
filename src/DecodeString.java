public class DecodeString {
        public static void main(String[] args) {
            System.out.print(decodeString("3[a]2[bc]"));
        }
        static int i=0;
        public static String decodeString(String s) {
            String str=decode(s);
            return str;
        }
        static String decode(String str){
            StringBuilder st=new StringBuilder();
            int num=0;
            while(i<str.length()){
                char c=str.charAt(i);
                if(Character.isDigit(c)){
                    num=num*10+(c-'0');
                    i++;
                }
                else if(c=='['){
                    i++;
                    String innerStr=decode(str);
                    for(int j=0;j<num;j++)
                        st.append(innerStr);
                    num=0;
                }
                else if(c==']'){
                    i++;
                    return st.toString();
                }
                else{
                    st.append(c);
                    i++;
                }
            }
            return st.toString();
        }
}
