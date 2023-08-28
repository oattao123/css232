import java.util.Scanner;

class Clause2part1 {
    static class Clause2_1 {
        public static void main(String[] args) {
            int x = 5;

            System.out.println("x : " + x);

            x++;
            System.out.println("x++ : " + x);

            ++x;
            System.out.println("++x : " + x);

            x--;
            System.out.println("x-- : " + x);

            --x;
            System.out.println("--x : " + x);
        }
    }

    static class Clause2_2 {
        public static void main(String[] args) {
            int x = 5;
            int y = 3;
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            int e = x % y;
            System.out.println("x + y = " + a);
            System.out.println("x - y = " + b);
            System.out.println("x * y = " + c);
            System.out.println("x / y = " + d);
            System.out.println("x % y = " + e);
        }
    }

    static class Clause2_3 {
        public static void main(String[] args) {
            int x = 100;
            int y = 33;
            System.out.println("x < y : " + (x < y));
            System.out.println("x > y : " + (x > y));
            System.out.println("x <= y : " + (x <= y));
            System.out.println("x >= y : " + (x >= y));
            System.out.println("x == y : " + (x == y));
            System.out.println("x != y : " + (x != y));
        }
    }

    static class Clause2_4 {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            boolean condition = true;

            int x = condition ? a : b;

            System.out.println(x);
        }
    }
}

class Clause2part2 {

    static class Clause2_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println(num1 + " is the greater number.");
                System.out.println(num2 + " is the lesser number.");
            } else if (num2 > num1) {
                System.out.println(num2 + " is the greater number.");
                System.out.println(num1 + " is the lesser number.");
            } else {
                System.out.println("Both numbers are equal.");
            }
            scanner.close();
        }
    }

    static class Clause2_2 {
        public static void main(String[] args) {
            char grade = 'A';
            switch (grade) {
                case 'A':
                    System.out.println("Excellent!");
                    break;
                case 'B':
                case 'C':
                    System.out.println("Well done");
                    break;
                case 'D':
                    System.out.println("You passed");
                    break;
                case 'F':
                    System.out.println("Better try again");
                    break;
                default:
                    System.out.println("Invalid grade");
            }
            System.out.println("Your grade is " + grade);
        }
    }

    static class Clause2_3 {
        public static void main(String[] args) {
            int r = 0;

            for (int i = 1; i <= 10; i++) {
                r += i;
            }

            System.out.println("Total sum of r is: " + r);
        }
    }

    static class Clause2_4 {
        public static void main(String[] args) {
            int i = 0;
            while (i <= 5) {
                System.out.println(i + 1);
                i++;
            }
        }
    }

    static class Clause2_5 {
      public static void main(String[] args) {
        int i = 0;

        do {
            System.out.println("Executing loop iteration: " + (i + 1));
            i++;

            if (i > 5) {
                break; // Break the loop if i > 5
            }
        } while (true);
    }
    }
}

class Clause2part3 {
    static class Clause2_1 {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = {3, 5, 7, 1, 8, 99, 44, -10};
        int[] a3 = {4, 3, 2, 1};

        int lengthA1 = a1.length;
        int lengthA2 = a2.length;
        int lengthA3 = a3.length;

        System.out.println("Length of a1: " + lengthA1);
        System.out.println("Length of a2: " + lengthA2);
        System.out.println("Length of a3: " + lengthA3);
    }
    }
    static class Clause2_2 {
    public static void main(String[] args) {
            int[][] matrix = new int[3][3];

            int value = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = value++;
                }
            }

            // Printing the matrix
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

class Clause2part4 {
        public static void main(String[] args) {
        int[] arr = {234, 6, 846, 85, 96, 198, 545, 12, 60, 34, 4, 87, 7, 1};

        // Perform bubble sort
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Sorted Array in Ascending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

class Clause2part5 {
    static class Clause2_1 {
        public static int[][] performMatrixAddition(int[][] a, int[][] b) {
            int rows = a.length;
            int cols = a[0].length;

            int[][] result = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = a[i][j] + b[i][j];
                }
            }

            return result;
        }
    }
    
    static class Clause2_2 {
        public static int[][] performMatrixMultiplication(int[][] a, int[][] b) {
            int rowsA = a.length;
            int colsA = a[0].length;
            int colsB = b[0].length;

            int[][] result = new int[rowsA][colsB];

            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < colsA; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            return result;
        }
    }
}

public class Unit2 {
    public static void main(String[] args) {
        System.out.println("Unit 2: Basic Programming");
        System.out.println("Part 1");
        System.out.println("1 Clause");
        Clause2part1.Clause2_1.main(args);
        System.out.println();

        System.out.println("2 Clause");
        Clause2part1.Clause2_2.main(args);
        System.out.println();

        System.out.println("3 Clause");
        Clause2part1.Clause2_3.main(args);
        System.out.println();

        System.out.println("4 Clause");
        Clause2part1.Clause2_4.main(args);
        System.out.println();

        System.out.println("Part 2");
        System.out.println("1 Clause");
        Clause2part2.Clause2_1.main(args);
        System.out.println();

        System.out.println("2 Clause");
        Clause2part2.Clause2_2.main(args);
        System.out.println();

        System.out.println("3 Clause");
        Clause2part2.Clause2_3.main(args);
        System.out.println();
        
        System.out.println("4 Clause");
        Clause2part2.Clause2_4.main(args);
        System.out.println();

        System.out.println("5 Clause");
        Clause2part2.Clause2_5.main(args);
        System.out.println();

        System.out.println("Part 3");
        System.out.println("1 Clause");
        Clause2part3.Clause2_1.main(args);
        System.out.println();

        System.out.println("2 Clause");
        Clause2part3.Clause2_2.main(args);
        System.out.println();

        System.out.println("Part 4");
        Clause2part4.main(args);
        System.out.println(); 

        System.out.println("Part 5");
        int[][] a1 = {
            {4, 7, 9, 8, 3},
            {2, 4, 7, 8, 1},
            {1, 1, 8, 1, 2},
            {0, 0, 1, 0, 4}
        };

        int[][] b1 = {
            {1, 2, 8, 4, 3},
            {4, 1, 8, 3, 1},
            {2, 1, 0, 0, 5},
            {1, 2, 1, 1, 7}
        };
        int[][] result1 = Clause2part5.Clause2_1.performMatrixAddition(a1, b1);

        System.out.println("Matrix Addition:");
        for (int[] row : result1) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("2 Clause");
        int[][] a2 = {
            {1, 2, 3},
            {4, 5, 6},
            {2, 3, 4}
        };

        int[][] b2 = {
            {1, 2, 3},
            {4, 5, 6},
            {2, 3, 4}
        };

        int[][] result2 = Clause2part5.Clause2_2.performMatrixMultiplication(a2, b2);

        System.out.println("Matrix Multiplication:");
        for (int[] row : result2) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}

