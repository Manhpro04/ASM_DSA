class CustomQueue {
    private String[] elements;
    private int size;
    private int front;
    private int rear;
    private int capacity;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        elements = new String[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(String data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        elements[rear] = data;
        size++;
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        String data = elements[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return elements[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(elements[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");

        queue.display();

        System.out.println("First element: " + queue.peek());

        queue.dequeue();
        queue.display();
    }
}