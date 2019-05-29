package entities;

public class Studant {
	
	public String nome;  
	public double notaT1;  
	public double notaT2;  
	public double notaT3; 
	
	public double finalGrade() {
		return notaT1 + notaT2 + notaT3;
	}
	
	public double missingPoint() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade(); 
		} else {
			return 0.0;	
		}
			
		
	}
}
