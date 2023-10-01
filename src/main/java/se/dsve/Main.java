package se.dsve;
import se.dsve.bankstuff.Bank;

import java.util.Scanner;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Välkommen till S.Kurk & Partners bank!");
            System.out.println("Välj ett alternativ:");
            System.out.println("1. Skapa konto");
            System.out.println("2. Ta bort konto");
            System.out.println("3. Visa saldo");
            System.out.println("4. Göra en insättning");
            System.out.println("5. Göra ett uttag");
            System.out.println("6. Visa alla konton");
            System.out.println("0. Avsluta");
            choice = sc.nextInt();
            sc.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.deleteAccount();
                    break;
                case 3:
                    bank.showBalance();
                    break;
                case 4:
                    bank.makeDeposit();
                    break;
                case 5:
                    bank.makeWithdrawal();
                    break;
                case 6:
                    bank.showAllAccounts();
                    break;
                case 0:
                    System.out.println("Tack för att du använder S.Kurk & Partners bank! Hejdå!");
                    break;
                default:
                    System.out.println("Ogiltigt val, försök igen.");
                    break;
            }
        } while (choice != 0);
    }
}
