
public class Ellipse extends Shape {
	// class attributs
	private double smallRay;
	private double largeRay;
	
	public Ellipse (double smallRay, double largeRay){
		this.smallRay=smallRay;
		this.largeRay=largeRay;
	}

	public double computeArea(){
		return Math.PI * this.smallRay * this.largeRay;

	}
}
