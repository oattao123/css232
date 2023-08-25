package java_basic;

public class MultiArrayTest {

    int[][] numbers = { {1,2,3,4} , {5,6,7,9} };
    System.out.println("Row length is " + numbers.length);
    System.out.println("Column length of first raw is  " + numbers[0].length);

    for (int i = 0; i < numbers.length; ++i) 
{
        for (int j = 0; j < numbers[i].length; ++j) {
            System.out.println("Element " + i + "," + j + " is " + numbers[i][j]);
        }
    }
}

