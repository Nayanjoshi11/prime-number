public class sumofarray {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        int sum = 0;
        System.out.println("the array to be sum is:  ");
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.print(arr[i]);
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}


