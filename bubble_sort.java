public class bubble_sort {
    // bubble sort = pairs of adjacent elements are compared,
    //               and the elements are swapped if they're not in order
    //               time complexity: O(n^2)

    public static void main(String[] args) {
        int array[] = {9,2,4,8,5,1,3,6,7};
        
        bubbleSort(array);

        for(int i: array){
            System.out.println(i);
        }
    }

    public static void bubbleSort(int array[]){
        for(int i = 0; i <array.length-1; i++){
            for(int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
