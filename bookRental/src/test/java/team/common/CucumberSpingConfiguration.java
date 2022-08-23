package team.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import team.BookRentalApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { BookRentalApplication.class })
public class CucumberSpingConfiguration {}
