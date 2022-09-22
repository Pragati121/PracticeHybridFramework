package Runner1;
import Stepdefinition.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\PragatiSharma\\IdeaProjects\\BddSecondProject\\src\\test\\java\\FeatureFile\\Login.feature"},
        glue = {"Stepdefinition"},
        monochrome = true,
        plugin = {"pretty","json:report/Cucumber.json"
        }
)
class RunnerClass {

}
