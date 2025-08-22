package lang.immutable.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");  //x001
        String str2 = new String("hello");  //x002
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        // new String()으로 생성한 값이 들어올 지, 리터럴로 대입한 값이 들어올 지 모르기에 문자열 비교는 equals를 사용.
         return x == y;
//        return x.equals(y);
    }
}
