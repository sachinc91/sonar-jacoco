import com.actimize.automation.Module2;
import org.testng.annotations.Test;

public class Module2IT {

    @Test
    public void integrationTest() {
        new Module2().coveredByIntegrationTest();
    }

}