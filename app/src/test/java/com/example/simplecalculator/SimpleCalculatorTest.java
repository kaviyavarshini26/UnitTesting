package com.example.simplecalculator;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class SimpleCalculatorTest{
@Test
  public   void Addition(){
   SimpleCalculator calculator=new SimpleCalculator();
    assertEquals(4,calculator.add(2,2));

}

}