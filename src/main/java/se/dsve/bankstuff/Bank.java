package se.dsve.bankstuff;
import java.util.HashMap;
import java.util.Scanner;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class Bank {
    private HashMap<String, SalaryAccount> salaryAccounts;
    private HashMap<String, CreditAccount> creditAccounts;
    private HashMap<String, CreditAccount> creditCards;
    private Scanner sc = new Scanner(System.in);

    public Bank() {
        this.salaryAccounts = new HashMap<>();
        this.creditAccounts = new HashMap<>();
        this.creditCards = new HashMap<>();
    }

    public void createAccount() {
        System.out.println("Ange kundens namn:");
        String name = sc.nextLine();
        System.out.println("Vilken typ av konto vill du skapa? (1: Lönekonto, 2: Kreditkonto, 3: Kreditkort)");
        int choice = sc.nextInt();
        sc.nextLine(); // Clear buffer

        if (choice == 1) {
            salaryAccounts.put(name, new SalaryAccount());
            System.out.println("Ett lönekonto har skapats för " + name);
        } else if (choice == 2) {
            creditAccounts.put(name, new CreditAccount());
            System.out.println("Ett kreditkonto har skapats för " + name);
        } else if (choice == 3) {
            creditCards.put(name, new CreditAccount());
            System.out.println("Ett kreditkort har skapats för " + name);
        } else {
            System.out.println("Ogiltigt val, försök igen.");
        }
    }

    public void deleteAccount() {
        System.out.println("Ange kundens namn för kontot du vill radera:");
        String name = sc.nextLine();
        // We need to check for account existence before deleting
        if (salaryAccounts.containsKey(name)) {
            salaryAccounts.remove(name);
            System.out.println("Lönekontot för " + name + " har raderats.");
        } else if (creditAccounts.containsKey(name)) {
            creditAccounts.remove(name);
            System.out.println("Kreditkontot för " + name + " har raderats.");
        } else if (creditCards.containsKey(name)) {
            creditCards.remove(name);
            System.out.println("Kreditkortet för " + name + " har raderats.");
        } else {
            System.out.println("Inget konto hittades för " + name);
        }
    }

    public void showBalance() {
        System.out.println("Ange kundens namn för att se saldo:");
        String name = sc.nextLine();
        // Checking for account existence
        if (salaryAccounts.containsKey(name)) {
            System.out.println("Saldo för " + name + ": " + salaryAccounts.get(name).getBalance() + " kr");
        } else if (creditAccounts.containsKey(name)) {
            System.out.println("Saldo för " + name + ": " + creditAccounts.get(name).getBalance() + " kr");
        } else if (creditCards.containsKey(name)) {
            System.out.println("Saldo för " + name + ": " + creditCards.get(name).getBalance() + " kr");
        } else {
            System.out.println("Inget konto hittades för " + name);
        }
    }

    public void makeDeposit() {
        System.out.println("Ange kundens namn för insättning:");
        String name = sc.nextLine();
        System.out.println("Ange belopp för insättning:");
        double amount = sc.nextDouble();
        sc.nextLine(); // Clear buffer
        // Checking for account existence
        if (salaryAccounts.containsKey(name)) {
            salaryAccounts.get(name).deposit(amount);
            System.out.println(amount + " kr har satts in på lönekontot för " + name);
        } else if (creditAccounts.containsKey(name)) {
            creditAccounts.get(name).deposit(amount);
            System.out.println(amount + " kr har satts in på kreditkontot för " + name);
        } else if (creditCards.containsKey(name)) {
            creditCards.get(name).deposit(amount);
            System.out.println(amount + " kr har satts in på kreditkortet för " + name);
        } else {
            System.out.println("Inget konto hittades för " + name);
        }
    }

    public void makeWithdrawal() {
        System.out.println("Ange kundens namn för uttag:");
        String name = sc.nextLine();
        System.out.println("Ange belopp för uttag:");
        double amount = sc.nextDouble();
        sc.nextLine(); // Clear buffer
        // Checking for account existence
        if (salaryAccounts.containsKey(name)) {
            boolean success = salaryAccounts.get(name).withdraw(amount);
            if (success)
                System.out.println(amount + " kr har tagits ut från lönekontot för " + name);
            else
                System.out.println("Det finns inte tillräckligt mycket pengar på kontot");
        } else if (creditAccounts.containsKey(name)) {
            boolean success = creditAccounts.get(name).withdraw(amount);
            if (success)
                System.out.println(amount + " kr har tagits ut från lönekontot för " + name);
            else
                System.out.println("Det finns inte tillräckligt mycket pengar på kontot");
        } else if (creditCards.containsKey(name)) {
            boolean success = creditCards.get(name).withdraw(amount);
            if (success)
                System.out.println(amount + " kr har tagits ut från kreditkortet för " + name);
            else
                System.out.println("Det finns inte tillräckligt mycket pengar på kontot");
        } else {
            System.out.println("Inget konto hittades för " + name);
        }
    }

    public void showAllAccounts() {
        System.out.println("Alla kundkonton:");

        if(salaryAccounts.isEmpty() && creditAccounts.isEmpty() && creditCards.isEmpty()) {
            System.out.println("Inga konton finns registrerade.");
            return;
        }

        for (String name : salaryAccounts.keySet()) {
            double balance = salaryAccounts.get(name).getBalance();
            System.out.println(name + " har ett lönekonto med saldo: " + balance + " SEK.");
        }

        for (String name : creditAccounts.keySet()) {
            double balance = creditAccounts.get(name).getBalance();
            double availableCredit = creditAccounts.get(name).getAvailableCredit();
            System.out.println(name + " har ett kreditkonto med saldo: " + balance + " SEK, Tillgänglig kredit: " + availableCredit + " SEK.");
        }

        for (String name : creditCards.keySet()) {
            double balance = creditCards.get(name).getBalance();
            double availableCredit = creditCards.get(name).getAvailableCredit();
            System.out.println(name + " har ett kreditkort med saldo: " + balance + " SEK, Tillgänglig kredit: " + availableCredit + " SEK.");
        }
    }
}
