package JavaThing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {


    int[] arr = {10000, 1000, 100, 10, 1};

    public static void main(String[] args) {
        InsertionSubClass i = new InsertionSubClass();
        i.Sort();
        i.Display();
    }

    public int[] getArr() {
        return arr;
    }
}

class InsertionSubClass extends InsertionSort {

    int arrLength = getArr().length;
    int[] afterArray = new int[arrLength];
    int[] beforeArray = getArr();
    int temp;

    void Sort() {
        for (int i = 0; i < arrLength; i++) {
            afterArray[i] = beforeArray[i];
            for (int j = 0; afterArray[j] > afterArray[i]; j++) {
                temp = afterArray[i];
                afterArray[i] = afterArray[j];
                afterArray[j] = temp;
            }
        }
    }

    void Display() {
        //Arrays.stream(afterArray);
        for (int i : afterArray) {
            System.out.print(i+" ");
        }
    }
}
