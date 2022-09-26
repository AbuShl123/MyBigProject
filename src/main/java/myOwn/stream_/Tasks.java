package myOwn.stream_;


import java.util.List;
import java.util.stream.Collectors;

public class Tasks {
    public static List<Integer> noNeg(List<Integer> nums) {
        nums = nums.stream().filter(x -> x>0).collect(Collectors.toList());
        return nums;
    }
    //  The second way of solving this task:
    public List<Integer> noNeg2(List<Integer> nums) {
        nums.removeIf(x -> x < 0);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> n = List.of(1,-2,-5,7,2,-1,0);
        System.out.println(noNeg(n));

        Tasks ob = new Tasks();
        n = ob.noNeg2(n);
        System.out.println(n);
    }
}
