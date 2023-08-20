import java.util.*;

public class Test1 {

    public int findMissingShortInteger(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        /*
        for(int i=0;i<arr.length;i++) {
            int temp =arr[i];
            for(int j=i+1;j<arr.length;j++) {
                temp += arr[j];
                set.add(temp);
            }
        }*/
        findMissingNumbersUtil(0, arr, 0, set);
        for(int i:arr) {
            set.add(i);
        }
        int result = set.size();
        for(int i=1;i<set.size();i++) {
            if(!set.contains(i)) {
                return i;
            }
        }
        return result;
    }

    private void findMissingNumbersUtil(int index1, int[] arr, int intSum, Set<Integer> set) {
        set.add(intSum);
        if(index1 == arr.length) {
            return;
        }
        findMissingNumbersUtil(index1+1,arr, intSum+arr[index1], set);
        findMissingNumbersUtil(index1+1,arr, intSum, set);
    }
    public static void main(String[] args) {
        int[] in1 = {1, 2, 4, 10};
        int[] in2 = {1,1, 1, 4};
        int[] in3 = {1, 2, 3, 10};
        int[] in4 = {1,1, 1, 1};
        Test1 t = new Test1();
        System.out.println("res1: "+t.findMissingShortInteger(in1));
        System.out.println("res2: "+t.findMissingShortInteger(in2));
        System.out.println("res3: "+t.findMissingShortInteger(in3));
        System.out.println("res4: "+t.findMissingShortInteger(in4));
    }
}



/*
Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.

For example, for the input [1, 2, 3, 10], you should return 7.

Do this in O(N) time.
[1,1, 1, 1] => 5

[1, 2, 3, 10]
1+2
1+3
[1,2,3,4]
1
 */