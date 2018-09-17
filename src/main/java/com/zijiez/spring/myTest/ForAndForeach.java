package com.zijiez.spring.myTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Aldeo on 2018/9/17.
 *
 * for和foreach的区别
 * 删除集合中某个值的元素，注意i--
 */
public class ForAndForeach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(5);

        //下面这种结构为foreach
        //foreach不是Java中的关键字。适用于只是进行集合或数组遍历
        //foreach不能对数组或集合进行修改（添加删除操作），如果想要修改就要用for循环。
        //当不知道集合的个数时用
        //因为在使用foreach循环的时候数组（集合）就已经被锁定不能被修改
        //foreach虽然是for循环的简化版本
        for (int aa:list) {
//            list.remove(aa);
//            list.add(66);
        }


        //这种结构为for
        //写起来繁琐一点，但灵活
        //面试题：list中删除值为1的元素，由于删除后会进行移位，所以需要i--退一个
        for (int i=0;i<list.size();i++) {
            //删除值为5的元素
            if(list.get(i)==1){
                list.remove(i);
                i--;  //由于删除后会进行移位，所以需要i--退一个
            }
        }





    }
}
