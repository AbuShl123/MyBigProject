package myOwn.recursion.prisoners;

import java.util.*;

public class Prisoners {
    //whoGoesFree(9, 2) ➞ 2

// Prisoners = [0, 1, 2, 3, 4, 5, 6, 7, 8]
// Executed people replaced by - (a dash) for illustration purposes.
// 1st round of execution = [0, -, 2, -, 4, -, 6, -, 8]  -> [0, 2, 4, 6, 8]
// 2nd round = [-, 2, -, 6, -] -> [2, 6]  # 0 is killed in this round because it's beside 8 who was skipped over.
// 3rd round = [2, -]

    //whoGoesFree(9, 3) ➞ 0

// [0, 1, 2, 3, 4, 5, 6, 7, 8]
// [0, 1, -, 3, 4, -, 6, 7, -] -> [0, 1, 3, 4, 6, 7]
// [0, 1, -, 4, 6, -] -> [0, 1, 4, 6]
// [0, 1, -, 6] -> [0, 1, 6]
// [0, -, 6] -> [0, 6]
// [0, -] -> [0]

    static ArrayList<Integer> prisoner = new ArrayList<>();
    static int counter;
    public static int whoIsLucky(int n, int k) {
        if (prisoner.size() == 0) {
            counter = k;
            for (int i = 0; i < n; i++) {
                prisoner.add(i);
            }
        }
        for (int i = k; i <= prisoner.size(); i+=counter) {
            prisoner.set(i - 1, null);
        }
        int nul = prisoner.lastIndexOf(null)+1;
        int length = prisoner.size();
        prisoner.removeAll(Collections.singleton(null));
        if (length == 1) return prisoner.get(0);
        k = counter;
        return whoIsLucky(n, k-(length-nul));
    }

    public static void main(String[] args) {
        System.out.println(whoIsLucky(1, 3));
    }
}
