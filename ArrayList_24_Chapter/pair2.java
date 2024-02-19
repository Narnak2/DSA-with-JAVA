package ArrayList_24_Chapter;

import java.util.ArrayList;

public class pair2{
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int num = list.size();
        int breakingPoint = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakingPoint = i;
                break;
            }
        }

        if (breakingPoint == -1) {
            // The list is not rotated, use the optimized two-pointer approach
            return pairSum(list, target);
        }

        int leftPointer = (breakingPoint + 1) % num;
        int rightPointer = breakingPoint;

        while (leftPointer != rightPointer) {
            int sum = list.get(leftPointer) + list.get(rightPointer);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                leftPointer = (leftPointer + 1) % num;
            } else {
                rightPointer = (num + rightPointer - 1) % num;
            }
        }

        return false;
    }

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);

            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(3);
        int target = 9;

        boolean result = pairSum2(list, target);
        System.out.println("Pair with sum " + target + " exists: " + result);
    }
}
