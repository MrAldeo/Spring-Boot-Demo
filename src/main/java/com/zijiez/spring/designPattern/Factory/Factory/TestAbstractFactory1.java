package com.zijiez.spring.designPattern.Factory.Factory;

import com.zijiez.spring.designPattern.Factory.Product.Product1;

/**
 * @Auther: zhangzijie
 * @Date: 2019/5/8 17:11
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
public class TestAbstractFactory1 extends TestAbstractFactory{
    @Override
    public void neddOverride() {
        System.out.println("工厂实现子类1");
        Product1 product1 = new Product1();
        product1.createProduct();
    }
}
