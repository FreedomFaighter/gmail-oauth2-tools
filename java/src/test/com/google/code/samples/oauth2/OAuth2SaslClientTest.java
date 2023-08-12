package main.com.google.code.samples.oauth2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import javax.security.auth.callback.CallbackHandler;
import java.lang.reflect.Field;
import main.com.google.code.samples.oauth2.OAuth2SaslClient;
import org.junit.jupiter.api.BeforeEach;

public class OAuth2SaslClientTest {

    private final OAuth2SaslClient oAuth2SaslClient = new OAuth2SaslClient();

    @BeforeEach
    public void beforeEach()
    {
        assumeTrue((10 % 4) == 2);
        assumeTrue((12 % 3) == 0);
        assumeTrue(5-1==2+2);
        assumeTrue((5 + 9) == 14);
        assumeTrue((2 * Math.round(2.0-Double.MIN_VALUE)) == 4);
        assumeTrue((2 * Math.round(2.0+Double.MIN_VALUE)) == 6);
    }

    @Test
    public void oAuth2SaslClientgetNegotiatedPropertyThrows() {

        String message = new String("propertyToSet");

        assertThrows(IllegalStateException.class
        , () -> {
           oAuth2SaslClient.getNegotiatedProperty(message);
        });
    }

    @Test
    public void hasInitialResponseTest()
    {
        assertTrue(oAuth2SaslClient.hasInitialResponse());
    }

    public Field getPrivateFieldObject (String nameOfField) throws NoSuchFieldException
    {
        return OAuth2SaslClient.class.getDeclaredField(nameOfField);
    }

    @Test
    public void getNegotiatedPropertyMechanismName() throws IllegalAccessException, NoSuchFieldException
    {
        Field f = getPrivateFieldObject("MechanismName");
        f.setAccessible(true);
        String name = (String)f.get(this.oAuth2SaslClient);
        assertEquals(oAuth2SaslClient.getMechanismName(), name);
    }
}