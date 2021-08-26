package testsscheduler;

import config.ConfigScheduler;
import dto.Authdto;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagesscheduler.HomeScreen;
import pagesscheduler.SplashScreen;

public class LoginWithBefore extends ConfigScheduler {

    @BeforeMethod
    public void preCondition(){
        new SplashScreen(driver)
                .checkVersion("0.0.3")
                .loginWithDto(Authdto.builder().build())
                .skipWizard();
    }

    @Test
    public void test(){

        new HomeScreen(driver).isFabAddPresent();
    }
}
