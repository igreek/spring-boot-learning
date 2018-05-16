package com.greekw.dubbo.test;

import com.greekw.DubboClientApplication;
import com.greekw.dubbo.api.ComputeFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DubboClientApplication.class)
public class ApplicationTests {

	@Autowired
	private ComputeFacade computeFacade;

	@Test
	public void testAdd() throws Exception {
		System.out.println(computeFacade.add(1, 2));
	}

}
