package Implement_Queue_using_Stacks_232;

import java.util.ArrayList;
import java.util.List;

class CustomStack {
    private List<Integer> stackList;

    public CustomStack() {
        stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int top() {
        if (isEmpty()) {
            return -1; // Assuming -1 indicates an empty stack
        }
        return stackList.get(stackList.size() - 1);
    }

    public int size() {
        return stackList.size();
    }

    public void push(int value) {
        stackList.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // Assuming -1 indicates an empty stack
        }
        int topValue = stackList.get(stackList.size() - 1);
        stackList.remove(stackList.size() - 1);
        return topValue;
    }
}

class MyQueue {
    private CustomStack stack1;
    private CustomStack stack2;

    public MyQueue() {
        stack1 = new CustomStack();
        stack2 = new CustomStack();
    }

    public void push(int x) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }

    public int peek() {
        return stack1.top();
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр MyQueue
        MyQueue myQueue = new MyQueue();

        // Добавляем элементы в очередь
        System.out.println("Push 1");
        myQueue.push(1); // Очередь: [1]

        System.out.println("Push 2");
        myQueue.push(2); // Очередь: [1, 2]

        System.out.println("Push 3");
        myQueue.push(3); // Очередь: [1, 2, 3]

        // Проверка методов
        System.out.println("Peek: " + myQueue.peek()); // Ожидается 1, так как это первый элемент в очереди
        System.out.println("Pop: " + myQueue.pop());   // Ожидается 1, удаляем первый элемент (очередь: [2, 3])

        System.out.println("Peek after pop: " + myQueue.peek()); // Ожидается 2, так как теперь первый элемент в очереди - это 2
        System.out.println("Pop: " + myQueue.pop());   // Ожидается 2, удаляем первый элемент (очередь: [3])

        System.out.println("Empty: " + myQueue.empty()); // Ожидается false, так как в очереди есть еще один элемент
        System.out.println("Pop: " + myQueue.pop());   // Ожидается 3, удаляем последний элемент (очередь: [])

        System.out.println("Empty after last pop: " + myQueue.empty()); // Ожидается true, так как очередь теперь пуста
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */