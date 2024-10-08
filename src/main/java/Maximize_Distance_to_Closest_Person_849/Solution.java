package Maximize_Distance_to_Closest_Person_849;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 0, 1};
        System.out.println(maxDistToClosest(arr));
    }

    public static int maxDistToClosest(int[] seats) {

        int prevPerson = -1;
        int n = seats.length;
        int maxDist = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {

                if (prevPerson == -1) {
                    maxDist = i;
                } else {
                    int newDist = (i - prevPerson) / 2;

                    if (newDist > maxDist) {
                        maxDist = newDist;
                    }

                }
                prevPerson = i;
            }
        }

        if (seats[n - 1] == 0) {
            maxDist = Math.max((n - prevPerson) / 2, maxDist);
        }

        return maxDist;
    }
}
