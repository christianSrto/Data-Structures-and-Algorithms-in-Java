public class selection_sort {
    // Selection Sort = search through an array and keep track of the min value during
    //                  each iteration. At the end of each iteration, swap variables.
    //                  time complexity: O(n^2)

    public static void main(String[] args) {
        int array[] = {9,2,4,8,5,1,3,6,7};

        selectionSort(array);

        for(int i: array){
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array){
        for(int i =0; i < array.length - 1; i++){
            int min = i;
            for(int j =i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
