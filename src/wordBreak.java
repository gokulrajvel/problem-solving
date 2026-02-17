import java.util.*;
public class wordBreak {
    public boolean wordBreaks(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<=i;j++){
                if(dp[j]&&wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    // System.out.print(s.substring(j,i));
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String str="leetcode";
        List<String> wordDict=new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        wordBreak wordBreak=new wordBreak();
        System.out.println(wordBreak.wordBreaks(str,wordDict));
    }
}
