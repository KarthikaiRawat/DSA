public class SumOfUpperAndBoundary {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };
        int upperSum = 0;
        int lowerSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i <= j) {
                    upperSum = upperSum + matrix[i][j];
                }
                if (j <= i) {
                    lowerSum = lowerSum + matrix[i][j];
                }
            }
        }
        System.out.println("Upper Sum " + upperSum + " Lower Sum " + lowerSum);

    }
}