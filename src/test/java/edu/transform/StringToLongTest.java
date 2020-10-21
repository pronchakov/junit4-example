package edu.transform;


import org.junit.Assert;
import org.junit.Test;

public class StringToLongTest {

    @Test
    public void test34() {

        Transformer transformer = new Transformer();
        Long l = transformer.transform("34");

        Assert.assertEquals(Long.valueOf(34), l);

    }

    @Test
    public void test340() {

        Transformer transformer = new Transformer();
        Long l = transformer.transform("34.0");
        Assert.assertEquals(Long.valueOf(34), l);

    }

    @Test(expected = Exception.class)
    public void test347() {

        Transformer transformer = new Transformer();
        Long l = transformer.transform("34.7");

    }



}
