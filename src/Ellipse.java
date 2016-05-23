
public class Ellipse extends Shape {
	// class attributs
	private double smallRay;
	private double largeRay;

	void computeArea(){
		area= Math.PI * smallRay * largeRay;
	}
}
