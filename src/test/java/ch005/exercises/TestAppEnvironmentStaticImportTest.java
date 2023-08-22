package ch005.exercises;

import org.junit.Assert;
import org.junit.Test;

import static domainobject.TestAppEnv.*; // import everything from TestAppEnv
// The below imports are redundant because `TestAppEnv.*` imports everything
// import static domainobject.TestAppEnv.DOMAIN;
// import static domainobject.TestAppEnv.PORT;

public class TestAppEnvironmentStaticImportTest {
    @Test
    public void canGetUrlStatically() {
        Assert.assertEquals("Return Hard Coded URL",
                "http://192.123.0.3:67",
                getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically() {
        Assert.assertEquals("Just the Domain",
                "192.123.0.3",
                DOMAIN);

        Assert.assertEquals("Just the port",
                "67",
                PORT);
    }
}
