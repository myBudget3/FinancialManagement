/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialmanagementsys;

import java.time.LocalDate;


/**
 *
 * @author yifeisun
 */
public class Card {
    
    private String cardName;
    private String cardNumber;
    private String expDate;
   
  
    
    public Card(){}
    public Card(String cardName, String cardNumber, String date){
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.expDate = date;
    }
    
    public void setCardName(String cardName){this.cardName = cardName;}
    public void setCardNumber(String cardNumber){this.cardNumber = cardNumber;}
    public void setExpDate(String date){this.expDate = date;}
    
    public String getCardName(){ return cardName;}
    public String getCardNumber(){return cardNumber;}
    public String getExpDate(){return expDate;}
    
    
}
