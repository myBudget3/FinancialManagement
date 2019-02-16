/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialmanagementsys;

/**
 *
 * @author yifeisun
 */

public class Transaction {
    
    private static int transId;
    private String startDate;
    private String endDate;
    private String type;
    private double amount;
    private String description;
   
    private String paymentMiethod;
    private String category;
    private String comment;
    private boolean transPrivate;
    private boolean transFrequency;
    public enum freqType {Daily, Weekly,Monthly};
    private String Tprivate;

    
    
 
            
    private static int nextTransId=1;
    private Card card;
    private User user;
    private UserGroup group;
    
    
    public static int getNextId() { return nextTransId; }
    public static void setNextId(int i) { nextTransId = i; }
    
  
    

    
    public Transaction()
    {   transId = nextTransId;
        nextTransId++;}
    
    public Transaction(String startDate,String endDate,double amount,String type, String paymentMethod,String description, String category,String comment,boolean transPrivate){
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.type = type;
        this.paymentMiethod = paymentMethod;
        this.description = description;
        this.category = category;
        this.comment = comment;
        this.transPrivate = transPrivate;
        
        if(transPrivate == true){
        Tprivate = "Yes";}
        else{Tprivate = "No";}
       

        transId = nextTransId;
        nextTransId++;
    }
    
   


    public int getTransId() {
        return transId;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMiethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMiethod;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setTransFrequency(boolean transFrequency) {
        this.transFrequency = transFrequency;
    }

    public boolean isTransFrequency() {
        return transFrequency;
    }

    public void setTransPrivate(boolean transPrivate) {
        this.transPrivate = transPrivate;
    }

    public boolean isTransPrivate() {
        return transPrivate;
    }
    
    
    @Override
    
    public String toString() {
        return startDate+ "," +endDate+ "," +amount+ "," +type+ "," +paymentMiethod+ "," +description+ "," +category+ "," +comment
                + Tprivate;
    }
}
