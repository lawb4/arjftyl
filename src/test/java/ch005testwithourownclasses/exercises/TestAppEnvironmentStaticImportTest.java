package ch005testwithourownclasses.exercises;

import org.junit.Assert;
import org.junit.Test;

import static domainobject.TestAppEnv.*;

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
