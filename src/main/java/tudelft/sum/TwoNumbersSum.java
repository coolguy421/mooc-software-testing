package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {

        int complement = 0;
        int size = Math.max(first.size(), second.size());
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < size; i++){
            int firstVal = i < first.size() ? first.get(i) : 0;
            int secondVal = i < second.size() ? second.get(i) : 0;
            int total = firstVal + secondVal + complement;
            complement = 0;
            if (total >= 10){
                complement = 1;
                total -= 10;
            }
            result.add(i, total);
        }

        if(complement == 1)  result.add(size, 1);

        return result;
    }
}
