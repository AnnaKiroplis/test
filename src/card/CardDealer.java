package card;

public class CardDealer {
    String cardType;

    CardDealer(String s)
    {
        s=cardType;
    }
    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CardType=" + cardType;
    }
    
    
}
