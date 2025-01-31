package exercice2;

public class testCircle {

	public static void main(String[] args) {
		circle c1 = new circle();
		System.out.println("le cercle a un raon de : " + c1.getRadius() + "et une aire de " + c1.getArea() + "la coueleur est :" + c1.getcouleur());
		
		circle c2 = new circle(2.0);
		System.out.println("le cercle a un raon de : " + c2.getRadius() + "et une aire de " + c2.getArea() + "la coueleur est :" + c2.getcouleur());
		
		circle c3 = new circle(3.0);
		System.out.println("le cercle a un raon de : " + c3.getRadius() + "et une aire de " + c3.getArea() + "la coueleur est :" + c3.getcouleur());
		
		circle c4 = new circle();
		c4.setcouleur("bleu");
		c4.setrayon(50.0);
		System.out.println("le cercle a un raon de : " + c4.getRadius() + "et une aire de " + c4.getArea() + "la coueleur est :" + c4.getcouleur());
		
	}

}
