package assignment.acceptance_tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		   features="cases",
           plugin= {"html:target/cucumber/wikipedia.html"},
           monochrome=true,
           snippets = SnippetType.CAMELCASE,
           glue= {"assignment.acceptance_tests"},
           strict=true
)

public class AcceptanceTest {

}

