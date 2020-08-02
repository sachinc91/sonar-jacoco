import com.actimize.automation.Module1;
import org.testng.annotations.Test;

public class Module1IT {

    @Test
    public void integrationTest() {
        new Module1().coveredByIntegrationTest();
    }

}