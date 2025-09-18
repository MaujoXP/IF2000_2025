package IF2000_2025.Lab_03.logic;

import IF2000_2025.Lab_03.domain.*;



public class Main {
    public static void main(String[] args) {

        // --- Crear clientes ---
        Client client1 = new Client(703090047, "Mauricio Leon", 64391765, "Limón, Costa Rica");
        Client client2 = new Client(703130055, "Deyner Chavez", 64816777, "Cartago, Costa Rica");

        // --- Crear cuentas ---
        Account account1 = new SavingAccount(11, 5000.0, client1, 5, "2025-09-18", 3, 64391765);
        Account account2 = new SavingAccount(22, 2000.0, client2, 8, "2025-09-18", 2, 83383281);

        // --- Crear banco ---
        Bank bank1 = new Bank("Banco de Costa Rica");
        bank1.addAccount(account1);
        bank1.addAccount(account2);

        // --- Crear sistema bancario ---
        BankSystem bankSystem = new BankSystem();
        bankSystem.addBank(bank1);

        // --- Mostrar bancos ---
        System.out.println(bankSystem.getBanks());

        // --- Hacer depósitos ---
        bankSystem.deposit(1000, account1);
        bankSystem.deposit(500, account2);

        // --- Hacer retiros ---
        bankSystem.withdraw(2000, account1);
        bankSystem.withdraw(300, account2);

        // --- Hacer transferencia SINPE Movil ---
        bankSystem.sinpeMovil(500, account1, 83383281);  // de account1 a account2
        bankSystem.sinpeMovil(1000, account2, 9999); // SINPE inválido
        bankSystem.sinpeMovil(6000, account1, 83383281); // saldo insuficiente

        // --- Calcular intereses ---
        bankSystem.interestCalculation(account1);
        bankSystem.interestCalculation(account2);

        // --- Mostrar movimientos ---
        System.out.println("\nMovimientos cuenta #1:");
        System.out.println(account1.getLogbook().getAccMovements());

        System.out.println("\nMovimientos cuenta #2:");
        System.out.println(account2.getLogbook().getAccMovements());

        // --- Mostrar balances finales ---
        System.out.println("Balance final cuenta 1: " + account1.getBalance());
        System.out.println("Balance final cuenta 2: " + account2.getBalance());
    }
}
