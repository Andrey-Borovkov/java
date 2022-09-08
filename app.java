public class app {

  static int[] solve(int a, int b, int c, int d) {
    int[] arr = new int[b + 1];
    arr[a] = 1;
    for (int index = a + 1; index <= b; index++) {
      if (index % d == 0) {
        arr[index] = arr[index - c] + arr[index / d];
      } else {
        arr[index] = arr[index - c];
      }
    }
    return arr;
  }

  static void print_solve(int[] arr, int a, int b, int c, int d) {
    String result = new String();
    while (b != a) {
      if (b % d == 0) {
        b = b / d;
        result = "k2 " + result;
      } else {
        b = b - c;
        result = "k1 " + result;
      }
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    int a = 1;
    int b = 7;
    int c = 1;
    int d = 2;
    var so = solve(a, b, c, d);

    for (int i = 0; i < so.length; i++) {
      System.out.printf("%d -> %d\n", i, so[i]);
    }
    print_solve(so, a, b, c, d);
  }
}