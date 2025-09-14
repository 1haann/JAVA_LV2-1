package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = 0;
        while (index >= 0) {
            index = str.indexOf(key, index);
            if (index == -1) {
                break;
            }

            System.out.println("find key :) => index = " + index);
            index++;
            count++;
        }
        System.out.println("count = " + count);
    }
}

