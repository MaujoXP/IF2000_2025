package IF2000_2025.IntroduccionProgra.logic;
import java.util.Scanner;

public class Laboratorio_1 {

    public Laboratorio_1() {

    }

    public String ejercicio_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();
        return (num % 2 == 0) ? "El numero es par" : "El numero es impar";
    }

    public int ejercicio_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scanner.nextInt();
        return (num < 0) ? num * -1 : num;
    }

    public int ejercicio_3() {
        int resultado = 0;
        for (int i = 3; i <= 99; i += 3) {
            resultado += i;
        }
        return resultado;
    }

    public void ejercicio_4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Digite el segundo número: ");
        int b = scanner.nextInt();
        System.out.print("Digite el tercer número: ");
        int c = scanner.nextInt();


        int menor, medio, mayor;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                medio = b;
                mayor = c;
            } else {
                medio = c;
                mayor = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                medio = a;
                mayor = c;
            } else {
                medio = c;
                mayor = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                medio = a;
                mayor = b;
            } else {
                medio = b;
                mayor = a;
            }
        }

        System.out.println("Orden ascendente: " + menor + ", " + medio + ", " + mayor);
    }

    public void ejercicio_5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int resultado;

        if (num1 == num2) {
            resultado = num1 * num2;
            System.out.println(resultado);
        } else if (num1 > num2) {
            resultado = num1 - num2;
            System.out.println(resultado);
        } else {
            resultado = num1 + num2;
            System.out.println(resultado);
        }
    }

    public static void ejercicio_6() {
        Scanner scanner = new Scanner(System.in);
        boolean hayDiez = false; // bandera para saber si hubo un 10
        int nota;

        System.out.println("Ingrese las notas (0 a 10). Para terminar ingrese -1:");

        while (true) {
            System.out.print("Nota: ");
            nota = scanner.nextInt();

            if (nota == -1) {
                break; // termina el ciclo si se ingresa -1
            }

            if (nota == 10) {
                hayDiez = true;
            }
        }

        if (hayDiez) {
            System.out.println("Sí hubo al menos una nota con valor 10.");
        } else {
            System.out.println("No hubo ninguna nota con valor 10.");
        }
    }

    public void ejercicio_7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su sexo (M para masculino / F para femenino): ");
        char sexo = scanner.next().charAt(0);

        int numero_pulsaciones;

        if (sexo == 'F' || sexo == 'f') {
            numero_pulsaciones = (220 - edad) / 10;
        } else if (sexo == 'M' || sexo == 'm') {
            numero_pulsaciones = (210 - edad) / 10;
        } else {
            System.out.println("Sexo no válido, debe ingresar 'M' o 'F'.");
            return;
        }

        System.out.println("El número de pulsaciones por cada 10 segundos es: " + numero_pulsaciones);
    }

    public void ejercicio_8() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su salario mensual: ");
        double salario = scanner.nextDouble();

        System.out.print("Ingrese sus años de antigüedad en la empresa: ");
        int antiguedad = scanner.nextInt();

        double utilidad;

        if (antiguedad < 1) {
            utilidad = salario * 0.05;
        } else if (antiguedad >= 1 && antiguedad < 2) {
            utilidad = salario * 0.07;
        } else if (antiguedad >= 2 && antiguedad < 5) {
            utilidad = salario * 0.10;
        } else if (antiguedad >= 5 && antiguedad < 10) {
            utilidad = salario * 0.15;
        } else {
            utilidad = salario * 0.20;
        }

        System.out.println("La utilidad anual que recibe el trabajador es: " + utilidad);
    }

    public void ejercicio_9() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int N = scanner.nextInt();

        int contador = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                contador++; 
            }
        }

        if (contador == 2) {
            System.out.println(N + " es primo.");
        } else {
            System.out.println(N + " no es primo.");
        }
    }

    public void ejercicio_10() {
        Scanner scanner = new Scanner(System.in);

        double precio_computadora = 11000;

        System.out.print("Ingrese la cantidad de computadoras compradas: ");
        int cantidad = scanner.nextInt();

        double precioTotal = cantidad * precio_computadora;
        double descuento = 0;

        if (cantidad < 5) {
            descuento = precioTotal * 0.10;
        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = precioTotal * 0.20;
        } else { 
            descuento = precioTotal * 0.40;
        }

        double totalAPagar = precioTotal - descuento;

        System.out.println("Cantidad de computadoras: " + cantidad);
        System.out.println("Precio total sin descuento: $" + precioTotal);
        System.out.println("Monto descontado: $" + descuento);
        System.out.println("Monto total a pagar: $" + totalAPagar);
    }

    public void ejercicio_11() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número natural N: ");
        int N = scanner.nextInt();

        if (N < 2) {
            System.out.println("No hay primos menores a 2.");
            return;
        }

        System.out.println("Números primos entre 2 y " + N + ":");

        for (int num = 2; num <= N; num++) {
            int contador = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    contador++;
                }
            }

            if (contador == 2) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public void ejercicio_12() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);
    }
}
