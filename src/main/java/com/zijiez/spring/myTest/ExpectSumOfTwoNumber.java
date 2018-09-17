package com.zijiez.spring.myTest;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Aldeo on 2018/9/17.
 *
 * 给定一个整型数组（数组中的元素可重复），
 * 以及一个指定的值。打印出数组中两数之和为指定值的 所有整数对
 */
public class ExpectSumOfTwoNumber {

    //方法一：
    //先将整型数组排序，排序之后定义两个指针left和right。
    // left指向已排序数组中的第一个元素，right指向已排序数组中的最后一个元素
    //将 arr[left]+arr[right]与 给定的元素比较，若前者大，right--；
    // 若前者小，left++；若相等，则找到了一对整数之和为指定值的元素。
    //此方法采用了排序，排序的时间复杂度为O(NlogN)，
    // 排序之后扫描整个数组求和比较的时间复杂度为O(N)。故总的时间复杂度为O(NlogN)。空间复杂度为O(1)
    public static void expectSum_bySort(int[] arr, int expectSum)
    {
        if(arr == null || arr.length == 0)
            return;
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while(left < right)
        {
            if(arr[left] + arr[right] > expectSum)
                right--;
            else if(arr[left] + arr[right] < expectSum)
                left++;
            else//equal
            {
                System.out.println(arr[left] + " + " + arr[right] + " = " + expectSum);
                left++;
                right--;
            }
        }
    }


    //方法二：
    //依次遍历整型数组，对整型数组中的每一个元素，
    //求解它的suplement（expectedSum-arr[i]）.suplement就是指定的值减去该数组元素。
    //如果该元素的suplement不在HashSet中，则将该元素添加到HashSet。
    //如果该元素的suplement在HashSet中，说明已经找到了一对整数之和为指定值的元素。
    //该方法使用了HashSet,故空间复杂度为O(N)，由于只需要扫描一遍整型数组，故时间复杂度为O(N)
    public static void expectSum_bySet(int[] arr, int expectSum)
    {
        if(arr == null || arr.length == 0)
            return;
        HashSet<Integer> intSets = new HashSet<Integer>(arr.length);

        int suplement;
        for (int i : arr)
        {
            suplement = expectSum - i;
            if(!intSets.contains(suplement)){
                intSets.add(i);
            }else{
                System.out.println(i + " + " + suplement + " = " + expectSum);
            }
        }
    }

    //hapjin test
    public static void main(String[] args) {
        int[] arr = {2,7,4,9,3};
        int expectSum = 11;
        expectSum_bySet(arr, expectSum);
        System.out.println("************");
//        expectSum_bySort(arr, expectSum);
        System.out.println("----------------");
        int[] arr2 = {3,7,9,1,2,8,5,6,10,5};
        int expectSum2 = 10;
        expectSum_bySet(arr2, expectSum2);
        System.out.println("**********");
        expectSum_bySort(arr2, expectSum2);
    }
}
