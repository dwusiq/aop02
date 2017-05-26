package com.wusiq.aspect;

/**
 * 记录汽车日志的切面，xml配置
 */
public class CarAspect {
    void beforeCarMove(){
        System.out.println("汽车启动前，请插入钥匙");
    }
    void afterCarMove(){
        System.out.println("行车中，请注意安全");
    }
    void beforeReturn(){
        System.out.println("已停车，请拔出钥匙");
    }
    void beforeThrowing(){
        System.out.println("汽车坏掉，请修理");
    }
}
