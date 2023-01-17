import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(8);
        q.add(7);
        q.add(2);
        q.add(9);
        q.add(18);
        q.add(12);
        q.add(0);
        reverseHalf(q);


    }
    public static void reverseHalf(Queue<Integer> q) {
        int size = q.size();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<size;i++){
            if(i%2==0){
                q.offer(q.poll()); //добавляем эл с начала очереди в конец очереди
            }
            else {
                s.push(q.poll()); //иначе пушим из начала просто в стек
            }
        }
        while (s.size()!=0){
            q.offer(q.poll());
            q.offer(s.pop());
        }
        System.out.println(q);
    }
}