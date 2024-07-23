package assignment4;

//Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom exception for invalid amounts
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}
