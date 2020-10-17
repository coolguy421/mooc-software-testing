package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    public void basicSum(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(3);
        list1.add(4);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(5);
        list2.add(5);
        list2.add(4);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        expected.add(9);
        expected.add(7);

        TwoNumbersSum sumObj = new TwoNumbersSum();
        ArrayList<Integer> result = sumObj.addTwoNumbers(list1, list2);
        Assertions.assertEquals(expected,result);
    }

    @Test

    public void sumWith0(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(0);
        list1.add(2);
        list1.add(4);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(0);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(2);
        expected.add(4);
        expected.add(3);

        TwoNumbersSum sumObj = new TwoNumbersSum();
        ArrayList<Integer> result = sumObj.addTwoNumbers(list1, list2);
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void sumOfDigitsExceeding10(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        for(int i = 0;i<6; i++){
            list1.add(9);
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0;i<6; i++){
            list2.add(9);
        }

        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(8);
        for(int i = 0;i<5;i++)
            expected.add(9);
        expected.add(1);

        TwoNumbersSum sumObj = new TwoNumbersSum();
        ArrayList<Integer> result = sumObj.addTwoNumbers(list1, list2);
        Assertions.assertEquals(expected,result);
    }


}
