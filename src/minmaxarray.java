import java.util.Scanner;

public class minmaxarray {
    public static void main(String[] args) {
        int count, max,min,i;
        int[] arr= new int[500];
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the array elements");
        count = in.nextInt();
        System.out.println("Enter " + count + "elements");

        for(i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }

        max = min = arr[0];

        for(i = 1; i < count; i++) {
            if(arr[i] > max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];

        }

        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number : " + min);
    }
}

