
public class dynamic_arrays {

    public static void main(String[] args) {

        //ArrayList<String> arrayList = new ArrayList<String>();
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println("capacity:" + dynamicArray.capacity);
        System.out.println("empty:" + dynamicArray.isEmpty());

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0, "Z");
        dynamicArray.delete("A");
        System.out.println(dynamicArray.search("B"));

        System.out.println("size:" + dynamicArray.size);
        System.out.println(dynamicArray);
    }
    
}
