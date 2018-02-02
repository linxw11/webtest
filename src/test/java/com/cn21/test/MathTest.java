package com.cn21.test;

import com.cn21.utils.MathUtil;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by linxw on 2018/2/2.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/applicationContext-*.xml", "classpath*:/spring-mvc.xml" })
@WebAppConfiguration
public class MathTest {

    @BeforeClass
    public static void start() {

    }

    @Test
    public void testAdd() {
        Assert.assertEquals(4, MathUtil.add(1,3));
    }
}
