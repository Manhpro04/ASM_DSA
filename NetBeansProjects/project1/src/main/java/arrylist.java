import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class arrylist {
    public static void main(String[] args) {
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.add(" 1");
        linkedListQueue.add(" 2");
        linkedListQueue.add(" 3");
        linkedListQueue.add(" 4");
        System.out.println("LinkedList Queue: " + linkedListQueue);
        String E1 = linkedListQueue.peek();
        System.out.println("First element (LinkedList): " + E1);
        linkedListQueue.poll();
        System.out.println("LinkedList Queue after deletion: " + linkedListQueue);
            
        
        
        
        ArrayList<String> arrayListQueue = new ArrayList<>();
        arrayListQueue.add(" 1");
        arrayListQueue.add(" 2");
        arrayListQueue.add(" 3");
        arrayListQueue.add(" 4");
        System.out.println("ArrayList Queue: " + arrayListQueue);
        String E2 = arrayListQueue.get(0);
        System.out.println("First element (ArrayList): " + E2);
        arrayListQueue.remove(0);
        System.out.println("ArrayList Queue after deletion: " + arrayListQueue);
    }
}