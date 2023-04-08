import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class demo7 {
    public static void main(String[] args) {

        int a[] = { 49, 38, 65, 97, 76, 13, 27, 49 };
        quickSort(a, 0, a.length-1);
        System.out.println("ans:" + Arrays.toString(a));

    }
    public static void quickSort(int[] a, int left, int right) {
        if (left > right)return;// 区间插肩而过，无效不用递归
        int i = left, j = right, temp = a[left];// 以a[left]作为基准点开始
        while (i != j)
        {
            while (a[j] >= temp && j > i) j--;// 只要a[j]大于基准点，继续往前移动j 找小的
            if (j > i)a[i++] = a[j];
            while (a[i] <= temp && i < j)i++;
            if (i < j)a[j--] = a[i];

        }

        a[i] = temp;// 基准点元素放到最终位置

        quickSort(a, left, i - 1);
        quickSort(a, i + 1, right);
        //System.out.println(Arrays.toString(a));

    }


}
