import java.util.Random;

public class Main {
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

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
        // bubbleSort(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("sorted array");
        printArray(arr);
    }
}

