package javaPractice;

import java.util.Arrays;
import java.util.List;

public class ForEachPractice {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2,3,5,7,9);

//        using for loop
//        for (int i=0;i<values.size();i++)
//            System.out.println(values.get(i));

//        using enhanced for loop
//        for (int i : values )
//            System.out.println((i));

//        for each loop
       values.forEach(i -> System.out.println(i));





    }
}
