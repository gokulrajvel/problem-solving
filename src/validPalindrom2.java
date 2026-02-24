public class validPalindrom2 {
    public boolean validPalindrome(String s) {
        int start=0,end=s.length()-1;
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
        validPalindrom2 obj = new validPalindrom2();
        System.out.print(obj.validPalindrome("abca"));
    }
}
