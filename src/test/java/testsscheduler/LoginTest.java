package testsscheduler;

import config.ConfigScheduler;
import dto.AuthTest;
import dto.Authdto;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesscheduler.SplashScreen;

public class LoginTest extends ConfigScheduler {


    @Test

    public void loginTest(){

       boolean isFabbButtonPresent = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillEmail("john@gmail.com")
                .fillPassword("Jj123456$")
                .clickLoginButton()
                .skipWizard()
                .isFabAddPresent();

        Assert.assertTrue(isFabbButtonPresent);
    }

    @Test
    public void loginWithDto(){
        AuthTest testA = new AuthTest().withEmail("hgfgfdg").withPassword("657t585");
        AuthTest testB = new AuthTest().withEmail("ryftgf");

        Authdto dto = Authdto.builder().email("john@gmail.com").password("Jj123456$").build();

        boolean isFabbPr = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .loginWithDto(dto)
                .skipWizard()
                .isFabAddPresent();

        Assert.assertTrue(isFabbPr);

    }

    @Test
    public void negativeLoginTest(){
        Authdto authdto = Authdto.builder().email("john@gmail.com").password("Jj1234567").build();

        String error = new SplashScreen(driver)
                .checkVersion("0.0.3")
                .fillFormLogin(authdto)
                .errorLogin()
                .errorMessage();
        Assert.assertEquals(error,"Wrong email or password");
    }

}
