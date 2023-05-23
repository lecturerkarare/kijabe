package kijabe.myapp.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import kijabe.myapp.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
