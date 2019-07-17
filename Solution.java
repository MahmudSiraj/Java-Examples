import java.util.*;

class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i = left; i <= right; i++) {
            int x = i;
            int d = 0;
            boolean flag = true;
            
            while(x != 0 && flag == true) {
                d = x % 10;
                if(d == 0 || i % d != 0) flag = false;
                x /= 10;
            }
            
            if(flag == true) result.add(i);
        }
            return result;
    }

public static void main(String[] args) {
    for (Integer var : selfDividingNumbers(1, 22)) {
        System.out.println(var);
        System.out.println("Hello");
    }
}
}
