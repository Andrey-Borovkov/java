public class ttt {

    static int[] solve(int a, int b, int c, int d) {
        // int[] arr = new int[b + 1];
        // arr[a] = 1;
        int[] array = new int[b + 1];
        array[a] = 1;
        if (a < b) {
            if ((a + 1) % d == 0) {
                array[a + 1] = array[(a + 1) - c] + array[(a + 1) / d];
            } else {
                array[a + 1] = array[(a + 1) - c];
            }
            System.out.println(array[a]);
            solve(a + 1, b, c, d);
        }
        return array;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 12;
        int c = 2;
        int d = 3;

        int[] so = solve(a, b, c, d);

        for (int i = 0; i < so.length; i++) {
            System.out.printf("%d -> %d\n", i, so[i]);
        }
    }
}