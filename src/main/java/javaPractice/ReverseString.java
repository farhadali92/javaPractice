package javaPractice;

public class ReverseString {

    public static void main(String[] args) {
        String s = "muineleS";
        int length = s.length();
        String rev = "";

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

    String s1 = "rebmucuc";

    StringBuffer stringBuffer = new StringBuffer(s1);
        System.out.println(stringBuffer.reverse());
}

}