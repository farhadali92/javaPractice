package javaPractice;

public class SmallestAndLargestNumber {

    public static void main(String[] args) {

        int[] numbers = new int[]{100,5,50,55,500,200,10};
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i=1; i<numbers.length; i++)
            if(numbers[i]>largest)
                largest=numbers[i];
            else if (numbers[i]<smallest)
                smallest=numbers[i];
        System.out.println("smallest number "+smallest);
        System.out.println("largest number "+largest);





    }
}
