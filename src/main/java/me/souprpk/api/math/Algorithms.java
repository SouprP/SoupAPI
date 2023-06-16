package me.souprpk.api.math;

public class Algorithms {

    public void quicksort(){

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
