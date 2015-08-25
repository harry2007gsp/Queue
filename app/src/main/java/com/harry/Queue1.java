package com.harry;

/**
 * Created by hsingh on 8/25/15.
 */
// this Queue is with logic having rear = -1;
public class Queue1 {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue1(int max) {
        maxSize = max;
        queArray = new long[maxSize];
        front =0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long j) {
        if (rear == maxSize-1 ) {
            rear = -1;
        }
        rear++;
        queArray[rear]=j;
        nItems++;
    }

    public long remove() {
        long temp = queArray[front];
        front++;
        if (front == maxSize) {
            front=0;
        }
        nItems--;
        return temp;
    }
    public long peekFront() {
        return queArray[front];
    }
    public boolean isEmpty() {
        return (nItems == 0);
    }
    public boolean isFull() {
        return (nItems == maxSize);
    }
    public int size() {
        return nItems;
    }
}