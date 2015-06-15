package ba.bitcamp.week5.day1;

import java.util.Arrays;

public class Wallet {

private Integer money = 0;
private CreditCard[] cards;

public Wallet(int cards) {
    super();
    this.money = 0;
    this.cards = new CreditCard[cards];
}

@Override
public String toString() {
    return "Wallet [money=" + money + ", cards=" + Arrays.toString(cards)
            + "]";
}

public void addWalletMoney(Integer add) {

    money += add;
}

public void subtractWalletMoney(Integer sub) {
    if (money - sub > 0) {
        money -= sub;
    }
}

public void addCard(CreditCard c) {

    for (int i = 0; i < cards.length; i++) {
        if (cards[i] == null) {
            cards[i] = c;
            break;
        }
    }

}

public Integer getWalletBalance(){
    return money;
}

public Integer getNumberOfCards(){

    int counter = 0;

    for(int i =0;i<cards.length;i++){
        if(cards[i] != null){
            counter++;
        }
    }
    return counter;

}

public CreditCard getCard(int idx){

    return cards[idx];



}
}