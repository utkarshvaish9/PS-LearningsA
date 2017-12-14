package Shape;

public class Square {
private double side;

public Square(int side)
{
	this.side = side;
}
public double perimeter()
{
	return 4*side;
}
public double area()
{
	return side*side;
}
public double getSide() {
	return side;
}
public void setSide(double side) {
	this.side = side;
}



}
