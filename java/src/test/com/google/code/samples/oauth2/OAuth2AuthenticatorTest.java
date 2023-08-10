package main.com.google.code.samples.oauth2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

import main.com.google.code.samples.oauth2.OAuth2Authenticator;

import org.junit.jupiter.api.DisplayName;

public class OAuth2AuthenticatorTest {
    private final OAuth2Authenticator oAuth2Authenticator = new OAuth2Authenticator();
    @DisplayName("Assumptions needed for tests")
    @Test
    public void trueAssumption() {
        assumeTrue((4 % 1) == 0);
        assertEquals(8 % 3, 2);
        assumeTrue((7 % 5) == 2);
        assertTrue(2+2==5-1);
        assertEquals(7 % 3, 1);
        assumeTrue(((2 + 2) % 2) == 0);
        assertEquals(2 + 2, 4);
    }

    @BeforeAll
    public static void initAll() {
        
    }
}