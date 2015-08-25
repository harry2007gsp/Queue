package com.harry.noElems;

/**
 * Created by hsingh on 8/25/15.
 */
// this Queue is with logic having rear = -1 and without nItemls;
public class NoItemsQueue1 {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;

    public NoItemsQueue1(int max) {
        maxSize = max;
        queArray = new long[maxSize];
        front =0;
        rear = -1;
    }

    public void insert(long j) {
        if (rear == maxSize-1 ) {
            rear = -1;
        }
        rear++;
        queArray[rear]=j;
    }

    public long remove() {
        long temp = queArray[front];
        front++;
        if (front == maxSize) {
            front=0;
        }
        return temp;
    }
    public long peekFront() {
        return queArray[front];
    }
    public boolean isEmpty() {
        return (rear + 1 == front || front + maxSize - 1 == rear);
//        return (nItems == 0);
    }
    public boolean isFull() {
        return (rear + 2 == front || front + maxSize - 2 == rear);
//        return (nItems == maxSize);
    }
    public int size() {
        if (rear >= front) {
            return rear + 1 - front;
        } else {
            return (maxSize - front) + (rear + 1);
        }
//        return nItems;
    }
}