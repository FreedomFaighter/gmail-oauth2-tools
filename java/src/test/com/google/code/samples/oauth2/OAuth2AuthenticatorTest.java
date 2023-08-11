package main.com.google.code.samples.oauth2;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.com.google.code.samples.oauth2.OAuth2Authenticator;

import org.junit.jupiter.api.DisplayName;

public class OAuth2AuthenticatorTest {
    private final OAuth2Authenticator oAuth2Authenticator = new OAuth2Authenticator();
    @DisplayName("Assumptions needed for tests")
    @BeforeEach
    public void trueAssumption() {
        assumeTrue((4 % 1) == 0);
        assumeTrue((7 % 5) == 2);
        assertTrue(2+2==5-1);
        assumeTrue(((2 + 2) % 2) == 0);
    }
}