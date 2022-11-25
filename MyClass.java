import java.util.Arrays;
/*

        author: Mark Jason T. Galang

*?/

public class MyClass {
    public static void main(String args[]) {
        double[][] mat = new double[][] {
            {1.000, 0.956, 0.621},
            {1.000, -0.272, -0.647},
            {1.000, -1.106, 1.703}
        };
        
        double[] arr = new double[] {1, 0.3, 0.3}; // change this
        System.out.println("Given: " + Arrays.toString(arr) + "\n");
        
        double[] ans = new double[3];
        for (int i = 0; i < 3; i++) {
            double res = 0;
            
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " * " + arr[j]);
                if (j < 2) {
                    System.out.print(" + ");
                }
                
                res += mat[i][j] * arr[j];
            }
            
            System.out.printf(" = %.4f\n", res);
            ans[i] = res;
        }
        
        System.out.println("\nFinal Answer:");
        char[] letters = new char[] {'R', 'G', 'B'};
        for (int i = 0; i < 3; i++) {
            System.out.printf("%c = %.4f\n", letters[i], ans[i]);
        }
    }
}
