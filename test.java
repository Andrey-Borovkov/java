public class test {
    static int fact(int value) {
        int result = 1;
        if (value == 0 || value == 1)
            return result;
        else {
            result = value * fact(value - 1);
            return result;
        }

    }

    public static void main(String[] args) {
        int a = 6;
        // test(a);

        System.out.println(fact(a));
    }
}