// ──────────────────────────────────────────────────
// Problem  : 641. Design Circular Deque
// Difficulty: Medium
// Tags     : Array, Linked List, Design, Queue
// Link     : https://leetcode.com/problems/design-circular-deque/
// Runtime  : 5 ms (beats 86%)
// Memory   : 46592000 (beats 32%)
// Language : java
// Copyright: (c) 2026 Vinith3010. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class MyCircularDeque {
    private int[] deque;
    private int front, rear, size, capacity;

    public MyCircularDeque(int k) {
        capacity = k;
        deque = new int[k];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        size++;
        if (size == 1) rear = front;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        deque[rear] = value;
        size++;
        if (size == 1) front = rear;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : deque[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : deque[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
