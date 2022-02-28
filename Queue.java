public class Queue <T>
{
    private T[] elements;
    private int first = 0;
    private int last = 0;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 8;

    public Queue(int capacity) {
        this.capacity = capacity;
        elements = (T[])(new Object[capacity]);
    }

    public Queue()
    {
        this(DEFAULT_CAPACITY);
    }

    public void enqueue(T element)
    {
        if(last == capacity)
        {
            if(last - first <= capacity / 4)
            {
                T[] temp = (T[]) new Object[capacity];
                System.arraycopy(elements, first, temp, 0, last - first);
                elements = temp;
                last -= first;
                first = 0;
            } else
            {
                capacity *= 2;
                T[] temp = (T[]) new Object[capacity];
                System.arraycopy(elements, first, temp, 0, last - first);
                elements = temp;
                last -= first;
                first = 0;
            }
        }
        elements[last ++] = element;
    }

    public boolean isEmpty()
    {
        return first == last;
    }

    public T front()
    {
        return elements[first];
    }

    public T dequeue()
    {
        return elements[first ++];
    }

    public int size()
    {
        return last - first;
    }
}
