
public class aufgabe3 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Eingabe: ");
		int k = sc.nextInt(); // liest eine Ganzzahl (int) ein
		System.out.println(++k); // Ausgabe a)
		System.out.println(k); // Ausgabe b)
		System.out.println(k++); // Ausgabe c)
		int k2 = 5;
		double result = k2 / 2; // Stelle 1
		System.out.println("5 / 2 = " + result); // Ausgabe d)
		boolean b = false;
		if (b = false) {
			System.out.println("b ist falsch."); // Ausgabe e)
		} else {
			System.out.println("b ist wahr."); // Ausgabe f)
		}

		sc.close(); // selber hinzugef�gt wg. "warning Ressource leak"

		System.out.println(b = false); // Stelle 2 f�r Erkl�rung (siehe oben)

		System.out.println(b == true ? "b ist wahr." : "b ist falsch."); // f�r f)
	}
}
