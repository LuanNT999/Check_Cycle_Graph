import java.util.*;

public class Solution {

    public static boolean solution(int[] A, int[] B){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<A.length; i++){
            if(!map.containsKey(A[i]) && !map.containsValue(B[i]) && A[i]!=B[i]){
                map.put(A[i],B[i]);
            }
            else return false;
        }
        int des = A[0];
        int count = 1;
        Set<Integer> checkSet = new HashSet<>();
        checkSet.add(des);

        while (count<=A.length){
            des = map.get(des);
            checkSet.add(des);
            if (checkSet.size() == count && count < A.length)
                return false;
            count++;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int[] B = {2,3,4,5,1};

        System.out.println(Solution.solution(A,B));


    }
}