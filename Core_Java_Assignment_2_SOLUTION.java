
import java.util.*;

class ArrayListSort {

    long[] arrayListSortDesc(long[] arrayList) {
        // Arrays.sort(arrayList); //This is java prebuild sorting method
        for (int a = 0; a < arrayList.length; a++) {
            for (int b = a; b < arrayList.length; b++) {
                if (arrayList[b] > arrayList[a]) {
                    long index = arrayList[a];
                    arrayList[a] = arrayList[b];
                    arrayList[b] = index;
                }
            }
        }
        return arrayList;
    }

}

public class Core_Java_Assignment_2_SOLUTION {
    public static void main(String[] args) {
        long arrayList[] = { 24, 543534, 545, 2342, 9 };
        ArrayListSort al = new ArrayListSort();
        arrayList = al.arrayListSortDesc(arrayList);
        System.out.print("[ ");
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(arrayList[i] + " ");
        }
        System.out.print("]");
    }
}
