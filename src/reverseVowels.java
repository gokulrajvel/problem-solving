public class reverseVowels {
    public String reverseVowel(String s) {
        int start=0,end=s.length()-1;
        char[] a=s.toCharArray();
        while(start<end){
            if("aeiouAEIOU".indexOf(a[start]) != -1&&"aeiouAEIOU".indexOf(a[end]) != -1){
                char temp=a[start];
                a[start++]=a[end];
                a[end--]=temp;
            }
            else if("aeiouAEIOU".indexOf(a[start]) != -1&&"aeiouAEIOU".indexOf(a[end]) == -1){
                end--;
            }
            else if("aeiouAEIOU".indexOf(a[start]) == -1&&"aeiouAEIOU".indexOf(a[end]) != -1){
                start++;
            }
            else{
                start++;
                end--;
            }
        }
        return new String(a);
    }
    public static void main(String[] args) {
        reverseVowels obj=new reverseVowels();
        System.out.println(obj.reverseVowel("IceCreAm"));
    }
}
