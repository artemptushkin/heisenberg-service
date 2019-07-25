package ru.alfabank.contracts.heisenbergservice;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public abstract class BaseContractsTest {

	@Autowired
	protected WebApplicationContext applicationContext;

	@Before
	public void setUp() {
		RestAssuredMockMvc.mockMvc(
			MockMvcBuilders
				.webAppContextSetup(applicationContext)
				.build()
		);
	}
}
