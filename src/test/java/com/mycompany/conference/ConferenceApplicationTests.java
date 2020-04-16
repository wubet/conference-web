package com.mycompany.conference;

import com.mycompany.conference.Contoller.RegistrationController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(RegistrationController.class)
class ConferenceApplicationTests {

	@Test
	void contextLoads() {
	}

}
