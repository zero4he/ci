package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CITest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSay() throws Exception {
        CI ci = new CI();
        Assert.assertEquals("Hello World", ci.say("Hello World"));
    }
}