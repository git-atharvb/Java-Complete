package Array;
class Array{
    public static void main(String[] args) {
        int[] arr = new int[20];
        // Also declare and initialize an array in one line
        // int[] arr = {1, 2, 3, 4, 5};
        // [] is used to declare an array and also to access the elements of an array
        // You can also declare an array of any data type like char, float, double, boolean, etc.
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[4] = 4;
        arr[5] = 5;
        System.out.println("In Array[1] :" + arr[1]);
        System.out.println("In Array[4] :" + arr[4]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}