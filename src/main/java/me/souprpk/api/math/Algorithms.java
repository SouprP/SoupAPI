package me.souprpk.api.math;

public class Algorithms {

    public void quicksort(double[] arr){
        quicksort(arr, 0, arr.length - 1);
    }

    private void quicksort(double[] arr, int low, int high){
        if(low < high){
            int part = partition(arr, low, high);
            quicksort(arr, low, part -1);
            quicksort(arr, part + 1, high);
        }
    }

    private int partition(double[] arr, int low, int high){
        double pivot = arr[high];
        int i = low - 1;
        for(int j =low; j < high; j++){
            if(arr[j] <= pivot){
                i++;

                // swap
                double temp = arr[j];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public int eulersAlgorithm(int a, int b){
        // a = kb + c
        int k = 0;
        int c = 0;
        while(a > k*b){
            for(int i = 1; i < Integer.MAX_VALUE; i++)
                if(a < i*b)
                    k = i - 1;

            c = a - k*b;
            if(c == 0)
                return b;

            a = b;
            b = c;
        }
        return 1;
    }

    public Algorithms(){
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }
}
