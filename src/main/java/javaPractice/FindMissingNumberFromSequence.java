package javaPractice;

public class FindMissingNumberFromSequence {

    public static void main(String[] args) {
        int a[] = {-2,0,1, 2,3,4,5,6,7,8,9};
        int len = a.length;
        int firstNumber = a[0];
        int lastNumber = a[len-1];
        int sum = 0;
        int sum1 =0;


        for (int i = 0; i <len; i++) {
            sum = sum + a[i];

        }
        System.out.println(sum);

        for (int j=firstNumber;j<=lastNumber;j++){
            sum1 = sum1+j;

        }
        System.out.println(sum1);

        System.out.println("missing number is "+(sum1-sum));


    }
}
