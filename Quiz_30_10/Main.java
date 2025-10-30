import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BaseDatos bd = new BaseDatos();

        String nombre = leerNoVacio(sc, "Ingrese su nombre completo: ");
        String id = leerNoVacio(sc, "Ingrese su identificación (cédula o ID): ");
        int edad = leerEnteroPositivo(sc, "Ingrese su edad: ");
        String correo = leerEmailValido(sc, "Ingrese su correo electrónico: ");
        String telefono = leerTelefonoValido(sc, "Ingrese su número de teléfono: ");

        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        String linea = String.format("%s|%s|%d|%s|%s|%s",
                nombre, id, edad, correo, telefono, fechaHora.format(formato));

        guardarLinea(linea);

        System.out.println("Registro guardado en personas.txt");
        sc.close();
    }

     public static String leerNoVacio(Scanner sc, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Este campo no puede estar vacío. Intente de nuevo.");
            }
        } while (input.isEmpty());
        return input;
    }

    public static int leerEnteroPositivo(Scanner sc, String prompt) {
        int valor = -1;
        while (valor <= 0) {
            System.out.print(prompt);
            try {
                valor = Integer.parseInt(sc.nextLine());
                if (valor <= 0) {
                    System.out.println("La edad debe ser un número entero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número válido.");
            }
        }
        return valor;
    }

    public static String leerEmailValido(Scanner sc, String prompt) {
        String email;
        do {
            System.out.print(prompt);
            email = sc.nextLine().trim();
            if (!email.contains("@") || email.startsWith("@") || email.endsWith("@")) {
                System.out.println("Correo inválido. Debe contener '@' en una posición válida.");
                email = "";
            }
        } while (email.isEmpty());
        return email;
    }

    public static String leerTelefonoValido(Scanner sc, String prompt) {
        String telefono;
        do {
            System.out.print(prompt);
            telefono = sc.nextLine().trim();
            if (!telefono.matches("\\d{8,}")) {
                System.out.println("El teléfono debe contener solo dígitos y tener al menos 8 caracteres.");
                telefono = "";
            }
        } while (telefono.isEmpty());
        return telefono;
    }

    public static void guardarLinea(String linea) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("personas.txt", true))) {
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar en el archivo: " + e.getMessage());
        }
    }
}
