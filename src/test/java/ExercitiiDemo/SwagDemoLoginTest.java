package ExercitiiDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagDemoLoginTest extends SwagBaseTest{

    @Test(description = "Verify login scenario with diferent users", dataProvider = "loginUsers")
    public void testLoginScenarios(String userName, String password, boolean shouldLogin, boolean shouldWait){



    }
    @DataProvider
    public Object[][] loginUsers(){
        return new Object[][]{
                {"standard_user", "secret_sauce", true, false},
                {"locked_out_user", "secret_sauce", false, false},
                {"problem_user", "secret_sauce", true, false},
                {"performance_glitch_user", "secret_sauce", true, true},


        };
    }

}
