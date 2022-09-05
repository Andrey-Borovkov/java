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
  
    public static void main(String[] args) {
      int a = 2;
      int b = 12;
      int c = 2;
      int d = 3;
      var so = solve(a, b, c, d);
  
      for (int i = 0; i < so.length; i++) {
        System.out.printf("%d -> %d\n", i, so[i]);
      }
    }
  }