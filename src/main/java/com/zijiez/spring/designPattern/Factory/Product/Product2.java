package com.zijiez.spring.designPattern.Factory.Product;

/**
 * @Auther: zhangzijie
 * @Date: 2019/5/8 17:14
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
public class Product2 implements Product{
    @Override
    public void createProduct() {
        System.out.println("产品2");
    }
}
