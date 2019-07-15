package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {
    @Test
    public void should_return_330_when_call_getPrice_given_quantityIs300_itemPriceIs1() {
        //given
        PriceCalculator priceCalculator=new PriceCalculator();
        int quantity=300;
        int itemPrice=1;

        //when
        double actual = priceCalculator.getPrice(quantity, itemPrice);
        double expected=330.00;

        //then
        assertEquals(expected,actual,0);
    }

    @Test
    public void should_return_550_when_call_getPrice_given_quantityIs500_itemPriceIs1() {
        //given
        PriceCalculator priceCalculator=new PriceCalculator();
        int quantity=500;
        int itemPrice=1;

        //when
        double actual = priceCalculator.getPrice(quantity, itemPrice);
        double expected=550.00;

        //then
        assertEquals(expected,actual,0);
    }

    @Test
    public void should_return_655_when_call_getPrice_given_quantityIs600_itemPriceIs1() {
        //given
        PriceCalculator priceCalculator=new PriceCalculator();
        int quantity=600;
        int itemPrice=1;

        //when
        double actual = priceCalculator.getPrice(quantity, itemPrice);
        double expected=655.00;

        //then
        assertEquals(expected,actual,0);
    }

    @Test
    public void should_return_600_when_call_getPrice_given_quantityIs500_itemPriceIs2() {
        //given
        PriceCalculator priceCalculator=new PriceCalculator();
        int quantity=500;
        int itemPrice=2;

        //when
        double actual = priceCalculator.getPrice(quantity, itemPrice);
        double expected=1100.00;

        //then
        assertEquals(expected,actual,0);
    }

    @Test
    public void should_return_600_when_call_getPrice_given_quantityIs600_itemPriceIs2() {
        //given
        PriceCalculator priceCalculator=new PriceCalculator();
        int quantity=600;
        int itemPrice=2;

        //when
        double actual = priceCalculator.getPrice(quantity, itemPrice);
        double expected=1290.00;

        //then
        assertEquals(expected,actual,0);
    }
}