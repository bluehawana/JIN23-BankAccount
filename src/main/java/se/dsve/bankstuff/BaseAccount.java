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
        // Pseudokod
        // - Sätt saldo till 0
    }

    public double getBalance() {
        // Pseudokod
        // - Returnera nuvarande saldo
    }

    public void deposit(double amount) {
        // Pseudokod
        // - Kolla om beloppet är negativt
        // - Lägg till beloppet i saldo om det inte är negativt
        // Lägg till return-sats här
    }

    public boolean withdraw(double amount) {
        // Pseudokod
        // - Kolla om beloppet är negativt
        // - Kolla om tillräckligt saldo finns
        // - Om ja, dra av beloppet från saldo
        // Lägg till return-sats här
    }
}


