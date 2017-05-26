package com.wusiq.test;

import com.wusiq.controller.CarController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/applicationContext.xml")
public class CarTest {

    @Test
    public void doTest(){
        ApplicationContext ap = new ClassPathXmlApplicationContext("classpath*:/applicationContext.xml");
        CarController cc = (CarController)ap.getBean("carController");
        String str = cc.carMove();
        System.out.println(str);
    }
}
