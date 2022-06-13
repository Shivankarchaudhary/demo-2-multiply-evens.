package com.jap.recursion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultiplyEvensTest
{

   MultiplyEvens multiplyEvens;

   @Before
    public void setUp(){
       multiplyEvens = new MultiplyEvens();
   }

    @After
    public void tearDown(){
       multiplyEvens = null;
    }

    @Test
    public void givenANumberReturnProductOfEvenTillNumberSuccess(){
        assertEquals(3840,multiplyEvens.multiplyEvens(10));
        assertEquals(48,multiplyEvens.multiplyEvens(6));
        assertEquals(1,multiplyEvens.multiplyEvens(1));
    }
    @Test
    public void givenANumberReturnProductOfEvenTillNumberFailure(){
        assertEquals(-1,multiplyEvens.multiplyEvens(-10));
        assertEquals(-1,multiplyEvens.multiplyEvens(-6));
        assertEquals(-1,multiplyEvens.multiplyEvens(-1));
    }

}
