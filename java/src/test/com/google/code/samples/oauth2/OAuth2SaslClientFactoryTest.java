package main.com.google.code.samples.oauth2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assumptions.assumeTrue;


import org.junit.jupiter.api.Test;
import main.com.google.code.samples.oauth2.OAuth2SaslClientFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import main.com.google.code.samples.oauth2.OAuth2SaslClient;

public class OAuth2SaslClientFactoryTest {

    private final OAuth2SaslClientFactory oAuth2SaslClientFactory = new OAuth2SaslClientFactory();
    private final OAuth2SaslClient oAuth2SaslClient = new OAuth2SaslClient();

    @DisplayName("Assumptions needed for tests")
    @BeforeEach
    public void trueAssumption() {
        assumeTrue(2+2==5-1);
        assumeTrue((4 % 2) == 0);
        assumeTrue((7 % 3) == 1);
        assumeTrue((2 + 2) == 4);
        assumeTrue((69 % 10) == 9);
        assumeTrue((430 / 10) == 43);
    }

    @Test
    public void getMechanismNameXOAUTH()
    {
        OAuth2SaslClient oAuth2SaslClient = new OAuth2SaslClient();
        assertEquals(oAuth2SaslClient.getMechanismName(), oAuth2SaslClientFactory.getMechanismNames(null)[0]);
    }

    public void getMechanismNameXOAUTHFromProperty() throws NoSuchFieldException, IllegalAccessException
    {
        Field f = OAuth2SaslClient.class.getDeclaredField("MechanismName");
        f.setAccessible(true);
        String name = (String)f.get(this.oAuth2SaslClient);
        assertEquals(name, oAuth2SaslClientFactory.getMechanismNames(null)[0]);
    }
}