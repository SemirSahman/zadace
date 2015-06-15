package ba.bitcamp.week5.day1;

public class Main {

public static void main(String[] args) {

    Wallet w = new Wallet(2); 
    System.out.println(w.getWalletBalance());
    CreditCard c1 = new CreditCard(); 
    c1.addCreditCardMoney(7900);
    System.out.println(c1.getCardBalance());
    w.addCard(c1);
    CreditCard c2 = new CreditCard();
    w.addCard(c2);
    CreditCard c3 = new CreditCard();
    w.addCard(c3); 


    for (int i = 0; i < w.getNumberOfCards(); i++) {
        System.out.println(w.getCard(i).getCardBalance());
    }

}
}