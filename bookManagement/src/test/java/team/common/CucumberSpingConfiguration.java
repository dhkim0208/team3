package team.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import team.BookManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { BookManagementApplication.class })
public class CucumberSpingConfiguration {}
