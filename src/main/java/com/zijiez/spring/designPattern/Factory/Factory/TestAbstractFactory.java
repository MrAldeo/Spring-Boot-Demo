package com.zijiez.spring.designPattern.Factory.Factory;

/**
 * @Auther: zhangzijie
 * @Date: 2019/5/8 17:08
 * @Email: zhangzj@vipcode.com
 * @Description:
 */
public abstract class TestAbstractFactory {
    public void needMethoid (){
        System.out.println("所有子类都具有的方法");
    }

    public abstract void neddOverride();
}
