public class insertion_sort {
    // insertion sort = after comparing elements to the left shift elements
    //                  to the right to make room to insert a value
    //                  time complexity: O(n^2)
    //                  best case: O(n)
    //                  less steps than bubble sort
    public static void main(String[] args) {
        int array[] = {9,2,4,8,5,1,3,6,7};

        insertionSort(array);

        for(int i: array){
            System.out.println(i);
        }
    }

    private static void insertionSort(int[] array){

        for(int i = 1; i < array.length; i ++){
            int temp = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--; 
            }
            array[j+1] = temp;
        }
    }


}
