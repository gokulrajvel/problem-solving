public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len = Math.max(v1.length, v2.length);
        for (int i = 0; i < len; i++) {
            int val1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int val2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (val1 > val2)
                return 1;
            if (val1 < val2)
                return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        CompareVersionNumbers obj=new CompareVersionNumbers();
        System.out.println(obj.compareVersion("1.1.1.1", "1.1.1.1"));
    }
}



// int start1 = 0, start2 = 0;
// int len1 = version1.length(), len2 = version2.length();
// while (start1 < len1 || start2 < len2) {
//     int value1 = 0;
//     while (start1 < len1 && version1.charAt(start1) != '.') {
//         value1 =value1 * 10 + (version1.charAt(start1) - '0');
//         start1++;
//     }
//     int  value2 = 0;
//     while (start2 < len2 && version2.charAt(start2) != '.') {
//         value2 =value2 * 10 + (version2.charAt(start2) - '0');
//         start2++;
//     }
//     if (value1 < value2)
//         return -1;
//     if (value1 > value2)
//         return 1;
//     start1++;
//     start2++;
// }