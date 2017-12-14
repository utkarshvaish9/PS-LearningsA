package LengthConversion;


public class LengthConvert {
private final double value;
private final String currentUnit;
private final String desiredUnit;


public LengthConvert(double value,String currentUnit,String desiredUnit)
{
	this.value = value;
	this.currentUnit = currentUnit;
	this.desiredUnit = desiredUnit;
	}
public double convertTo()
{
	return Unit.convert(value,currentUnit,desiredUnit);
}
}
