## Exercise: Designing the BankManager application
Now it's your turn, open IntelliJ and start a new project called BankManager that will contain the following classes:

1. CheckingAccount
2. SavingsAccount
3. CertificateOfDeposit

Make sure they all extend from the same class called `BankAccount` that includes all the common fields.

Don't worry about implementing any of the methods for now, just leave them all blank. This exercise is mainly focusing on designing the code rather than writing any logic code.

Follow these steps and check them once you're done to complete this exercise:

* Create a new class called BankAccount with `account` and `balance` fields 
* Create a new class called CheckingAccount that extends BankAccount with an extra `limit` field 
* Repeat the same for SavingsAccount and COD
* In the main method, create an instance of each of the 3 child classes
* Make sure you can access the `account` and `balance` fields (set them and read them)
