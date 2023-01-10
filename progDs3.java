import java.util.Arrays;

public class progDs3 
{
    static void heapify(Integer[] arr, Integer n, Integer i) 
    {
        Integer largest = i; 
        Integer l = 2 * i + 1;
        Integer r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest]) 
        {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) 
        {
            largest = r;
        }

        if (largest != i) 
        {
            Integer swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) 
    {
        Integer[] arr = {49, 67, 11, 23, 8, 19, 52, 1, 16, 74, 3, 22};
        System.out.println("Изначальный массив:\n" + Arrays.toString(arr));

        Integer n = arr.length;

        for (Integer i = n / 2 - 1; i >= 0; i--) 
        {
            heapify(arr, n, i);
        }

        for (Integer i = n - 1; i >= 0; i--) 
        {
            Integer temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }

        System.out.println("Отсортированный массив:\n" + Arrays.toString(arr));
    }
}
