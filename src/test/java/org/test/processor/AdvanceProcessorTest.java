package org.test.processor;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdvanceProcessorTest {

    @Test
    public void execute() {
        Assert.assertEquals(new AdvanceProcessor().execute("abcccbad"),"d");
    }

    @Test
    public void getReplaceChar() {
        Assert.assertEquals(new AdvanceProcessor().getReplaceChar("cccb"),"b");
        Assert.assertEquals(new AdvanceProcessor().getReplaceChar("bbb"),"a");
        Assert.assertEquals(new AdvanceProcessor().getReplaceChar("aaa"),"");
    }
}