import java.util.Scanner;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ellipse e = new Ellipse(40,50);
		//e.computeArea();
		e.area=e.computeArea();
		System.out.println("La surface du cercle est de : "+e.area);	
	}
}
