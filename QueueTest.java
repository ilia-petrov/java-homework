public class QueueTest
{
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        for(int i = 0; i < 25; ++ i)
        {
            queue.enqueue(i);
        }
        for(int i = 0; i < 19; ++ i)
        {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
        for(int i = 0; i < 19; ++ i)
        {
            queue.enqueue(i);
        }
        while (!queue.isEmpty())
        {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
