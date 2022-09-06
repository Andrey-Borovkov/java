public class task2 {
    static double FuncOfTriangularNumber(int n) {
        
        double result = 0.5*n*(n+1);
        return result;
    }
    
    
    
    public static void main(String[] args) {
        int n = 6;
        System.out.println(FuncOfTriangularNumber(n));
    }
}
