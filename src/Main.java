import java.util.Random;

public class Main {
    static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i=0; i<5; ++i)
            System.out.print(arr[i] + " ");
        System.out.print("...");
        for (int i=n-6; i<n; ++i)
            System.out.print(" " + arr[i]);
        System.out.println();
    }

    static int[] randomArray()
    {
        Random rd = new Random();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = randomArray();
        System.out.println("original array");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("sorted array");
        printArray(arr);
    }
}

