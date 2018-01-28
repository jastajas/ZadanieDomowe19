public class ArrayTest {
    public static void main(String[] args) {

        int[][] arr1 = new int[2][3];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        int[][] arr2 = new int[2][3];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;

        int[][] arr3 = new int[2][3];
        arr3[0][0] = 12;
        arr3[0][1] = 3;
        arr3[0][2] = 5;
        arr3[1][0] = 6;
        arr3[1][1] = 8;
        arr3[1][2] = 6;

        int[][] arr4 = new int[2][2];
        arr4[0][0] = 12;
        arr4[0][1] = 3;
        arr4[1][0] = 6;
        arr4[1][1] = 8;

        ArrayComparator a1 = new ArrayComparator();

        System.out.println(a1.compare(arr1,arr2));
        System.out.println(a1.compare(arr3,arr4));
    }
}
