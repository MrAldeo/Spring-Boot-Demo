package com.zijiez.spring.designPattern;

import com.zijiez.spring.designPattern.Factory.Factory.TestAbstractFactory;
import com.zijiez.spring.designPattern.Factory.Factory.TestAbstractFactory1;
import com.zijiez.spring.designPattern.Factory.Factory.TestAbstractFactory2;

/**
 * @Auther: zhangzijie
 * @Date: 2019/5/8 17:07
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
public class TestController {
    public static void main(String[] args) {
        //测试工厂方法
        TestAbstractFactory testAbstractFactory1 = new TestAbstractFactory1();
        testAbstractFactory1.neddOverride();
        TestAbstractFactory testAbstractFactory2 = new TestAbstractFactory2();
        testAbstractFactory2.neddOverride();
    }
}
