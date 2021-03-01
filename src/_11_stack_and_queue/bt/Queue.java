package _11_stack_and_queue.bt;

import _11_stack_and_queue.th.Node;

public class Queue {
    private Node front;
    private Node rear;
        class Note {
            private int date;
            private Node link;

            public Note(int date) {
                this.date = date;
                this.link = null;
            }
        }
    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enQueue(int date){
        Node temp = new Node(date);
            if(front==null){
                this.rear=this.front=temp;
            }else
                this.rear=temp;



    }
}
