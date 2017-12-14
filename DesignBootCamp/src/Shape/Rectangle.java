package Shape;

public class Rectangle {

	private double length;
	private double breadth;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double perimeter(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
		return 2*(length + breadth);
	}
	public double area(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
		return length*breadth;
	}
	
}
