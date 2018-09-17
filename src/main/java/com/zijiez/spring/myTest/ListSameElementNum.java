package com.zijiez.spring.myTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Aldeo on 2018/9/17.
 *
 * 判断list中每个元素出现的个数
 */
public class ListSameElementNum {

    public static void sameElementNum(List<Integer> list){
        Map<Integer,Integer> mapHash = new HashMap<Integer,Integer>();
        for (int i=0;i<list.size();i++){
            int num = list.get(i);
            if(mapHash.get(num)==null){
                mapHash.put(num,1);
            }else {
                mapHash.put(num,mapHash.get(num)+1);
            }
        }


        for (Map.Entry<Integer,Integer> map:mapHash.entrySet()){
            System.out.println(map.getKey()+"-----"+map.getValue());
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);

        sameElementNum(list);
    }
}
