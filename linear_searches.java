public class linear_searches {
    public static void main(String[] args) {
        //Linear Search = Iterate through a collection one element at a time
        //                runtime complixity: O(n)
        //                Disadvantages: slow for large data
        //                Advantages: Fast for searches of small data sets
        //                            Does not need to be sorted
        //                            Useful for data structures that do not have random access (Linked Lists)
        
        int[] array = {9,1,4,5,3,2,6,7};
        
        int index = LinearSearch(array, 1);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    private static int LinearSearch(int[] array, int value){

        for(int i = 0; i<array.length; i++){
            if(array[i]== value){
                return i;
            }
        }
        return -1;
    }

}
