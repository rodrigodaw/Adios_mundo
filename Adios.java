
public class Adios {

	public static void main(String[] args) {
		String amarillo = "\033[33m";
		String verde = "\033[32m";
		String reset = "\033[0m"
			System.out.println(amarillo + "¡Adios mundo!" + reset);
			System.out.println(verde + "Pero... volveré" + reset);
	}

}
