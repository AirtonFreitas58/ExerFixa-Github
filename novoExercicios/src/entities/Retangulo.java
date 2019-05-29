package entities;

public class Retangulo {
	public double Width;
	public double Height;
	
	public double area() {			// formula da area: A = Base(b) * Altura(h)
		return (Width * Height);
	}
	public double perimeter() {		// formula 2(b + h).
		return 2 * (Width + Height);
	}
	public double diagonal() {		// formula h2=a2+b2.
		return Math.sqrt(Width * Width + Height * Height);
	}
}
			
	
