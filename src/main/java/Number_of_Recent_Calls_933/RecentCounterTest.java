package Number_of_Recent_Calls_933;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}

public class RecentCounterTest {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();

        System.out.println(recentCounter.ping(1));    // Ожидается: 1
        System.out.println(recentCounter.ping(100));  // Ожидается: 2
        System.out.println(recentCounter.ping(3001)); // Ожидается: 3
        System.out.println(recentCounter.ping(6002)); // Ожидается: 1
    }
}