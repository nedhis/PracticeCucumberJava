package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesWithtags",glue={"StepDefinitions"},
plugin={"pretty","html:target/HTMLReports/reporthook.html"})
public class TestRunnerwithHooks {

}
