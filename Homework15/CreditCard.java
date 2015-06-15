package ba.bitcamp.week5.day1;

public class CreditCard {

Integer numOfCard;
String bank;
String monthOfExpire;
String yearOfExpire;
Integer moneyStatus;

public CreditCard() {
    super();
    this.numOfCard = numOfCard;
    this.bank = bank;
    this.monthOfExpire = monthOfExpire;
    this.yearOfExpire = yearOfExpire;
    this.moneyStatus = 0;
}

@Override
public String toString() {
    return "CreditCard [numOfCard=" + numOfCard + ", bank=" + bank
            + ", monthOfExpire=" + monthOfExpire + ", yearOfExpire="
            + yearOfExpire + "]";
}

public void addCreditCardMoney(Integer add) {

    moneyStatus += add;

}

public void subtractCreditCardMoney(Integer sub) {

    moneyStatus += sub;
}

public Integer getCardBalance() {
    return moneyStatus;
}
}