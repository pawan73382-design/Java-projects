import java.util.LinkedList;
import java.util.Queue;
public class QueDemo {
    public static void main(String[] args) {
        Queue<String> users = new LinkedList<String>();
        users.offer("Hitler");
        users.offer("Stalin");
        users.offer("GT650");
        users.offer("Kawasaki Z900");
        while (!users.isEmpty()) {
            System.out.println(users.poll());
        }
        
    }  
}
