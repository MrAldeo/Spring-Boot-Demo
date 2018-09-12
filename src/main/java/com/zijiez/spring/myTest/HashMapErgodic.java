package com.zijiez.spring.myTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Aldeo on 2018/9/12.
 */
//遍历hashmap
public class HashMapErgodic {
    private static Logger logger = LoggerFactory.getLogger(HashMapErgodic.class);

    public static void getHashMap(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("张三","3");
        map.put("李四","4");

        //方法一  for each map.entrySet()  如果既需要key也需要value用此方法
        for (Map.Entry<String, String> entry : map.entrySet()) {
            logger.info("key={},value={}",entry.getKey(),entry.getValue());
        }

        //方法三  for each map.keySet()，再调用get获取  如果只是遍历key而无需value的话，可以直接用
        for (String key : map.keySet()) {
            map.get(key);
            logger.info("key={},value={}",key,map.get(key));
        }

        //方法三  显示调用map.entrySet()的集合迭代器
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            logger.info("key={},value={}",entry.getKey(),entry.getValue());
        }


        //方法四  for each map.entrySet()，用临时变量保存map.entrySet()
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            entry.getKey();
            entry.getValue();
            logger.info("key={},value={}",entry.getKey(),entry.getValue());
        }



    }

    public static void main(String[] args) {
        getHashMap();
    }

}
