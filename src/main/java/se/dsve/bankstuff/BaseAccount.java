package se.dsve.bankstuff;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

// This account is the mother of alla accounts
public class BaseAccount {
    protected double balance; // Saldo

    public BaseAccount() {
        this.balance = 0;
        // Pseudokod
        // - Sätt saldo till 0
    }

    public double getBalance() {
        return this.balance;// Pseudokod
    }
    // - Returnera nuvarande saldo
    // Lägg till en return-sats här

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            System.out.println("Du har satt in " + amount + " kr.");
        } else {
            System.out.println("Du kan inte sätta in ett negativt belopp");
        }
        // Pseudokod
        // - Kolla om beloppet är negativt
        // - Lägg till beloppet i saldo om det inte är negativt
        // Lägg till return-sats här
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Du kan inte ta ut ett negativt belopp");
            return false;
        } else if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Du har inte tillräckligt med pengar på kontot");
            return false;
        }
    }



            // Pseudokod
            // - Kolla om beloppet är negativt
            // - Kolla om tillräckligt saldo finns
            // - Om ja, dra av beloppet från saldo
            // Lägg till return-sats här
        }




