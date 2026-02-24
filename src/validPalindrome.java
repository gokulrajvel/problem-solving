/*

it is use to find the given string is palindrome.

*/
import java.util.Scanner;

public class validPalindrome {
    public boolean isPalindrome(String str) {
        int start=0,end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        validPalindrome obj = new validPalindrome();
        System.out.println(obj.isPalindrome(str));
    }
}
