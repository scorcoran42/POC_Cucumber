package test_code;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"src/test/resources/"},
		plugin = {"pretty", "html:target/cucumber-html-report", "junit:target/cucumber-junit-report/allcukes.xml"},
		tags = {"@Runme"},
		snippets = SnippetType.CAMELCASE
)

public class MyTestRunner {

}