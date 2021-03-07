package tests.auth;

import com.apitests.core.ApiModule;
import com.apitests.model.auth.RegistrationModel;
import com.apitests.remote.auth.AuthRequests;
import com.google.inject.Inject;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice(modules = ApiModule.class)
public class RegistrationTests {

    @Inject
    AuthRequests authRequests;

    @Test
    public void doRegister(){
        RegistrationModel registrationModel = new RegistrationModel();
        registrationModel.setUsername("ugauga@uga.ru");
        registrationModel.setPassword("wertunec");
        authRequests.register(registrationModel);
    }
}
