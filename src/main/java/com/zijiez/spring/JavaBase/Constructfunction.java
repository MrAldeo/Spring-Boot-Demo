package com.zijiez.spring.JavaBase;

/**
 * @Auther: zhangzijie
 * @Date: 2019/5/14 15:48
 * @Email: zhangzj@vipcode.com
 * @Description:
 * 构造方法是类里的一个特殊的方法，他不能有返回值（包括void）。
 * 所谓构造方法，就是这个类在被实例化时（创建对象时）就要执行的方法，方法名为类的名字，
 * 一般的目的是为了给类进行一些初始化值。
 */
public class Constructfunction {
    private String name;
    private int age;

    //构造方法1（构造函数不能有任何返回值包括void）
    public Constructfunction(String name,int age){
        this.name = name;
        this.age = age;
    }

    //构造方法二（必须h）
    public Constructfunction(int age,String name){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //创建一个内部类，用以测试构造函数
    public class TestConstructFunction{
        Constructfunction constructfunction = new Constructfunction("小明",1);
        Constructfunction constructfunction2 = new Constructfunction(1,"小明");
    }
}
