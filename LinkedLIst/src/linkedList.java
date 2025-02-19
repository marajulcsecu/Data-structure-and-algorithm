import java.util.LinkedList;
import java.util.Queue;

public class linkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList= new LinkedList<>();

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("E");


        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");

        linkedList.add(4,"g");
        linkedList.remove("E");
        System.out.println(linkedList.indexOf("C"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addLast("1");



        System.out.println(linkedList);
    }
}
