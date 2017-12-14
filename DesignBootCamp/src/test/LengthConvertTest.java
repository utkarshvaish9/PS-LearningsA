package test;

import org.junit.Test;

import org.junit.Assert;

import LengthConversion.LengthConvert;


public class LengthConvertTest {
@Test
public void shouldConvertMileToYard()
{
	LengthConvert lengthConvert = new LengthConvert(10,"Mile","Yard");
	Assert.assertEquals(17600,lengthConvert.convertTo(),0.01);
}
@Test
public void shouldConvertMileToFeet()
{
	LengthConvert lengthConvert = new LengthConvert(10,"Mile","Feet");
	Assert.assertEquals(52800,lengthConvert.convertTo(),0.01);
}
}
