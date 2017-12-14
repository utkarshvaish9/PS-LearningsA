package test;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import Shape.Rectangle;
public class RectangleTest {
@Test
public void DimensionsShouldNotBeNull(){
	//given
	Rectangle rect = new Rectangle();
	//when
	boolean comparisonResult = rect.equals(null);
	//then
	assertFalse(comparisonResult);
}

}
