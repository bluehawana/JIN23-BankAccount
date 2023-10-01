# Kravspecifikation för Bank Projektet

För att projektet ska bli godkänt ska följande krav vara uppfyllda:

## Kontoklasserna

### Lönekonto (SalaryAccount)

- Ska kunna hantera insättningar.
- Insättninng med negativt värde ska inte vara möjligt.
- Ska kunna hantera uttag.
- Uttag med negativt värde ska inte vara möjligt.
- Ska kunna visa aktuellt saldo.

### Kreditkonto (CreditAccount)
- Ska kunna hantera insättningar.
- Ska kunna hantera kreditsanering vid insättning.
- Kredit betalas av först innan saldo ökar.
- Insättninng med negativt värde ska inte vara möjligt.
- Ska kunna hantera uttag.
- Ska kunna hantera kredit vid uttag.
- Uttag med negativt värde ska inte vara möjligt.
- Ska kunna visa aktuellt saldo.
- Ska kunna visa tillgänglig kredit.
- Krediten är på 5000:-

## Observera

Du behöver inte göra några ändringar i de andra klasserna. 
Om du vill testa din kod innan den är klar, kan du lägga till en egen `return null` eller `return 0` i metoderna som inte är färdiga.

Dock ska allt fungera för att få godkänt, tänk på att personal_reflections.md måste fyllas i för att hela projektet ska godkännas.


