public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicarray = new DynamicArray();
      dynamicarray.add("A");
      dynamicarray.add("B");
      dynamicarray.add("C");
      dynamicarray.insert(0,"X");
      dynamicarray.delete("A");

        System.out.println(dynamicarray);
        System.out.println("size :"+ dynamicarray.size);
        System.out.println("capacity :"+dynamicarray.capacity);

System.out.println("empty: "+dynamicarray.isEmpty());


    }

}
