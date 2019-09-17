package com.xibei;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * main方法启动spring
     */
    @Test
    public void ManualRunSpring()
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        com.xibei.domain.Test bean = ac.getBean(com.xibei.domain.Test.class);
        bean.print();
    }
}
