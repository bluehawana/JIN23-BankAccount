package se.dsve.bankstuff;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

public class CreditAccount extends BaseAccount {
    private double creditLimit;

    public CreditAccount() {
        // Pseudokod
        // - Anropa basklassens konstruktor med super();
        super();
        // - Sätt kreditgräns
    }

    public double getAvailableCredit() {
        // Pseudokod
        // - Beräkna tillgänglig kredit
        // - Returnera den tillgängliga krediten
        // Lägg till en return-sats här
    }

    @Override
    public void deposit(double amount) {
        // Pseudokod
        // - Kolla om beloppet är negativt
        // - Om inte, anropa super.deposit(amount) för att betala av krediten först
        // Lägg till en return-sats här
    }

    @Override
    public boolean withdraw(double amount) {
        // Pseudokod
        // - Kolla om beloppet är negativt
        // - Kolla om tillräckligt saldo eller kredit finns
        // - Om ja, anropa super.withdraw(amount) och gör uttag, justera kredit/saldo
        // Lägg till en return-sats här
    }
}
