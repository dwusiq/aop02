package com.wusiq.controller;

/**
 * 汽车的控制器，测试xml配置springAOP的切面
 */
public class CarController {
    public String carMove(){
      /*  int a = 1/0;*/
        System.out.println("汽车正常启动");
        return "汽车启动后返回信息";
    }
}
