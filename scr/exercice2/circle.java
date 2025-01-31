package exercice2;

public class circle {   
	   private double rayon; 
	   private String couleur;
	 
	   public circle() {   
	      rayon = 1.0; 
	      couleur = "red"; 
	   } 
	   
	   public circle(double rayon) {   
	      this.rayon = rayon; 
	      couleur = "red"; 
	   } 
	   
	   public double getRadius() { 
	     return rayon; 
	   } 
	   
	   public double getArea() { 
	      return rayon*rayon*Math.PI; 
	   } 
	   
	   public circle (double rayon, String couleur) {
		   this.rayon = rayon; 
		   this.couleur = couleur; 
	   }
	   
	   public String getcouleur() {
		   return couleur; 
	   }
	   
	   public void setrayon (double newRayon ){
		   rayon = newRayon;	 
	   }
	   
	   public void setcouleur (String newcouleur ){
		   couleur = newcouleur;	 
	   }
	}

