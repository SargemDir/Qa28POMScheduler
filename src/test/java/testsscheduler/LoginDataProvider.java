package testsscheduler;

import config.ConfigScheduler;
import config.MyDataProvider;
import dto.AuthTest;
import dto.Authdto;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesscheduler.LoginScreen;
import pagesscheduler.SplashScreen;

public class LoginDataProvider extends ConfigScheduler {

  @Test (dataProvider = "validLoginData",dataProviderClass = MyDataProvider.class)

    public void loginWithDto(String email, String password){

    Authdto dto = Authdto.builder().email(email).password(password).build();

//        new SplashScreen(driver)
//                .checkVersion("0.0.3")
      new LoginScreen(driver)
                .loginWithDto(dto)
                .skipWizard()
                .openMenu()
                .logout();



    }
}
