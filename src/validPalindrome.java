public class validPalindrome {
    public boolean validPalindrome(String s) {
        int start=0,end=s.length()-1;
        boolean con=true;
        while(start<end){

            if(s.charAt(start) == s.charAt(end))
            {
                start++;
                end--;
            }
            else
                return palindrome(s,start+1,end)||palindrome(s,start,end-1);
        }
        return true;
    }
    boolean palindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))  return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        validPalindrome p=new validPalindrome();
        System.out.println(p.validPalindrome("abc"));
    }
}
