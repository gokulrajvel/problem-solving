public class reverseVowels {
    public String reverseVowel(String s) {
        int start=0,end=s.length()-1;
        char[] arr=s.toCharArray();
        while(start<end){
            if("aeiouAEIOU".indexOf(arr[start]) != -1&&"aeiouAEIOU".indexOf(arr[end]) != -1){
                char temp=arr[start];
                arr[start++]=arr[end];
                arr[end--]=temp;
            }
            else if("aeiouAEIOU".indexOf(arr[start]) != -1&&"aeiouAEIOU".indexOf(arr[end]) == -1){
                end--;
            }
            else if("aeiouAEIOU".indexOf(arr[start]) == -1&&"aeiouAEIOU".indexOf(arr[end]) != -1){
                start++;
            }
            else{
                start++;
                end--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        reverseVowels obj=new reverseVowels();
        System.out.println(obj.reverseVowel("IceCreAm"));
    }
}
