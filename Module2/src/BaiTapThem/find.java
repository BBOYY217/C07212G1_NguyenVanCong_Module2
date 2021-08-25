package BaiTapThem;

public class find {
    public static void main(String[] args) {
        String str = "abcbdcef";
        int[] counter = new int[256];
        int n = str.length();
        for (int i = 0; i < n; i++) {
            counter[str.charAt(i)]++;
        }
        char[] array = new char[str.length()];
        for (int i = 0; i < n; i++) {
            array[i] = str.charAt(i);
            int flag= 0 ;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
        }
    }
}