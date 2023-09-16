class Queue {
    int arr[] = new int[5];
    int rear = -1, front = -1;

    public void enqueue(int x) {
        if (this.front == -1 && this.rear == -1) {
            this.front++;
            this.rear++;
            this.arr[this.rear] = x;

        } else if (this.rear == 4) {
            System.out.println("queue is full");
        } else {
            this.rear++;
            this.arr[this.rear] = x;
        }
    }

    public void dequeue() {
        if (this.front == -1) {
            System.out.println("queue is empty");
        }
        
       else {
         front++;
          arr[front];
       }
        
        
    }

    public static void main(String[] args) {
        Queue l1 = new Queue();
        l1.enqueue(2);
        l1.enqueue(3);
        l1.dequeue();

    }
}
