package com.zijiez.spring.myTest;

import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Aldeo on 2018/9/13.
 */
public class ArraTest {

    //将string字符串的单词反转(单个单词顺序不变)
    public static void getArrReverse(){
        String str = "Hello,My,Name,Is,Aldeo";
        //根据，将string转化成数组
        String[] arr = str.split(",");

        Queue<String> queue = new LinkedBlockingQueue();
        for (int i=arr.length-1;i>=0;i--){
            queue.add(arr[i]);
        }

        for(int k=0;k<arr.length;k++){
            arr[k] = queue.poll();
        }
        // [Aldeo, Is, Name, My, Hello]
        System.out.println(Arrays.toString(arr));
    }

    //将string字符串只将每一个单词反转
    public static void getArrReverse2(){
        String str = "Hello,My,Name,Is,Aldeo";
        //根据，将string转化成数组
        String[] arr = str.split(",");

        for (int i=0;i<arr.length;i++){
            //function 1将字符串的每个字符存入数组toCharArray()
            StringBuffer sb = new StringBuffer();
            char[] ch = arr[i].toCharArray();
            for(int k = ch.length-1;k>=0;k--){
                sb.append(ch[k]);
            }
            arr[i] = sb.toString();
        }


        // [olleH, yM, emaN, sI, oedlA]
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        getArrReverse();
        getArrReverse2();
    }
}
