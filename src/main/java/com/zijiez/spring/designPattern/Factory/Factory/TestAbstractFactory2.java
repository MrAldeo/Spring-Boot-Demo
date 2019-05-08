package com.zijiez.spring.designPattern.Factory.Factory;

import com.zijiez.spring.designPattern.Factory.Product.Product2;

/**
 * @Auther: zhangzijie
 * @Date: 2019/5/8 17:11
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
public class TestAbstractFactory2 extends TestAbstractFactory{
    @Override
    public void neddOverride() {
        System.out.println("工厂实现子类2");
        Product2 product2 = new Product2();
        product2.createProduct();
    }
}
