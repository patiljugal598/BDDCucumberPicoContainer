package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;
import static io.cucumber.testng.CucumberOptions.SnippetType.UNDERSCORE;

@CucumberOptions(plugin = {"html:target/cucumber/cucumber.html"}, snippets = UNDERSCORE,
        //dryRun = true, monochrome = true,
       tags = "@test",
glue = {"org.example","org.example.customDataTableType"}, features = "src/test/resources/org.example")
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
