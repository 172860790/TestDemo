package org.test.processor;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicProcessorTest {

    @Test
    public void execute() {
        Assert.assertEquals(new BasicProcessor().execute("aabcccbbad"),"d");
        Assert.assertEquals(new BasicProcessor().execute("abbccdddcbaaf"),"f");
    }

    @Test
    public void getConsecutiveChar() {
        Assert.assertEquals(new BasicProcessor().getConsecutiveChar("aabcccbbad"),"ccc");
        Assert.assertEquals(new BasicProcessor().getConsecutiveChar("aabbbad"),"bbb");
        Assert.assertEquals(new BasicProcessor().getConsecutiveChar("aaad"),"aaa");
    }
}