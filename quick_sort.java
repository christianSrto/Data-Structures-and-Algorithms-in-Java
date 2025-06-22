public class quick_sort {
    // quick sort = moves smaller elements to the left of a pivot 
    //              recursively divide array into 2 partitions
    //              time complexity: best case O(n log(n))
    //                               average case O(n log(n))
    //                               worst case O(n^2) if already sorted
    //              space complexity: O(log(n)) due to recursion
    public static void main(String[] args) {
        int[] array = {8,2,7,4,6,3,5,1,9};

        //quickSort(array, starting index, last index)
        quickSort(array,0, array.length-1);

        for(int i = 0; i <array.length; i++){
            System.out.println(array[i]);
        }
    }

    private static void quickSort(int[] array, int start, int end){

        if(end <=start) return; //base case

        int pivot = partition(array, start, end);

        //left partition
        quickSort(array, start, pivot-1);

        //right partition
        quickSort(array, pivot+ 1 , end);
    }

    private static int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start -1;
        for(int j = start; j <=end-1; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;

        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
