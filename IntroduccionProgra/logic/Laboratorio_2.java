package IF2000_2025.IntroduccionProgra.logic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Laboratorio_2 {
    public Laboratorio_2() {

    }

    public int ejercicio_13() {
        int resultado = 0;

        for (int i = 2; i <= 1000; i++) {
            if (i % 2 == 0) {
                resultado += i;
            }
        }
        return resultado;
    }

    public double ejercicio_14(int celcius) {
        return (celcius * 9/5) + 32;
    }

    public double ejercicio_15(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public void ejercicio_16() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 12: ");
        int mes = scanner.nextInt();
        switch(mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Número inválido. Por favor ingrese un número entre 1 y 12");
        }
    }

    public int ejercicio_17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero (x): ");
        int x = scanner.nextInt();

        int resultado;

        if (x > 0) {
            resultado = x + 5;
        } else if (x < 0) {
            resultado = x * x; 
        } else {
            resultado = 1;
        }

        return resultado;
    }

    public void ejercicio_18() {
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el lado a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el lado b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el lado c: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("El área del triángulo es: %.2f\n", area);
        } else {
            System.out.println("Los lados ingresados no forman un triángulo válido.");
        }

        scanner.close();
    }

    public void ejercicio_19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número");
        int numero = scanner.nextInt();

        System.out.println("Ingrese un segundo número");
        int numero2 = scanner.nextInt();

        int temp = numero;
        numero = numero2;
        numero2 = temp;

        System.out.println("Después del intercambio:");
        System.out.println("Número 1: " + numero);
        System.out.println("Número 2: " + numero2);
    }

    public void ejercicio_20() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese x0: ");
        double x0 = scanner.nextDouble();
        System.out.print("Ingrese y0: ");
        double y0 = scanner.nextDouble();

        System.out.print("Ingrese x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese y1: ");
        double y1 = scanner.nextDouble();

        double m = (y0 - y1) / (x0 - x1);
        double b = y0 - m * x0;

        System.out.printf("La ecuación de la recta es: y = %.2fx + %.2f\n", m, b);
    }

    public int ejercicio_21() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        int resultado = 0;  

        for(int i = n; i >= 0; i--) {
            resultado += i;
        }

        return resultado;
    }

    public int ejercicio_22() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int n = 0;
        int resultado = 0;
        int cant = 0;
        while(n >= 0) {
            System.out.print("Ingrese un número entero positivo (negativo para terminar): ");
            n = scanner.nextInt();

            numeros.add(n);
            cant++;
        }
        for(int num : numeros) {
            resultado += num;
        }


        return resultado/cant;
    }

    public void ejercicio_23() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int n = 0;
        int cantI = 0;
        int cantP = 0;
        int resultado = 0;
        int resultadoI = 0;
        int resultadoP = 0;

        while (cantI + cantP < 10 ) {
            System.out.print("Ingrese un número entero positivo: ");
            n = scanner.nextInt();
            numeros.add(n);

            if(n % 2 == 0) {
                cantP++;
            } else {
                cantI++;
            }
        }

        for (int num : numeros) {
            resultado += num;
        }
        System.out.println("Suma total de números ingresados: " + resultado);

        System.out.println("Números pares ingresados: " + cantP);

        for (int num : numeros) {
            if (num % 2 == 0) {
                resultadoP += num;
            }
        }

        System.out.println("Suma de números pares ingresados: " + resultadoP);

        System.out.println("Números impares ingresados: " + cantI);

        for (int num : numeros) {
            if (num % 2 != 0) {
                resultadoI += num;
            }
        }

        System.out.println("Suma de números impares ingresados: " + resultadoI);
    }

    public void ejercicio_24() {
        int resultadoI = 0;
        int resultadoP = 0;

        for(int i = 1; i <= 200; i++) {
            if(i % 2 == 0) {
                resultadoP += i;
            } else {
                resultadoI += i;
            }
        }

        System.out.println("Suma de números pares entre 1 y 200: " + resultadoP);
        System.out.println("Suma de números impares entre 1 y 200: " + resultadoI);
    }

    public void ejercicio_25() {
        int resultado = 0;
        for(int i = 0; i <= 100; i++) {
            resultado += Math.pow(i, 2);
        }

        System.out.println("La suma de los cuadrados de los primeros 100 números enteros es: " + resultado);
    }

    public void ejercicio_26() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    public void ejercicio_27() {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        ArrayList<Integer> numeros = new ArrayList<>();

        while (numeros.size() < 10) {
            System.out.print("Ingrese un número entero positivo: ");
            n = scanner.nextInt();
            numeros.add(n);
        }

        int mayor = 0;
        for(int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) > mayor) {
                mayor = numeros.get(i);
            }
        }

        System.out.println("El número mayor ingresado es: " + mayor);
    }
}