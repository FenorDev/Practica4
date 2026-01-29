import java.util.Scanner;

public class Principal {
	public static Scanner teclado = new Scanner(System.in);
	public static Usuario[] crearUsuarios(int n) {
	Usuario[] usuarios = new Usuario[n];
		System.out.println("Hola Mundo");

		for (int i = 0; i < n; i++) {
			usuarios[i] = new Usuario();

			System.out.println("Nombre: ");
			usuarios[i].nombre = teclado.nextLine();
				
			System.out.println("Apellidos: ");
			usuarios[i].apellidos = teclado.nextLine();

			System.out.println("Email: ");
			usuarios[i].email = teclado.nextLine();
			
		}
		return usuarios;
	}
	public static void main(String[] args) {
		Usuario[] lista = crearUsuarios(2);

		for (Usuario u : lista) {
			System.out.println(u.nombre + " " + u.apellidos + " - " + u.email);
		}
	}
}
