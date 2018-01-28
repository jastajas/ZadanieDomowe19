public class ArrayComparator {


    public boolean compare(int[][] arr1, int[][] arr2){
        if(arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].length != arr2[i].length){
                    return false;
                }
        }

        int y = 0;

        do{
            for (int i = 0; i < arr1[y].length; i++) {
                if (arr1[y][i] != arr2[y][i]) {
                    return false;
                }
            }
        y++;
        } while (y < arr1.length);

        return true;
    }

}
