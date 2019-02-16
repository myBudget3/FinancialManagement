/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financialmanagementsys;

import java.util.LinkedList;

/**
 *
 * @author yifeisun
 */
public class FinancialManagementSys {
    private static LinkedList<Transaction> trans = new LinkedList<Transaction>();
    public static LinkedList<Transaction> getTrans() { return trans; }
    
    public static void addTransaction(String startDate,String endDate,double amount,String type, String paymentMethod,String description, String category,String comment,boolean transPrivate) {
            trans.add(new Transaction(startDate,endDate,amount, type,  paymentMethod,description, category,comment,transPrivate));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FinancialManagementSys fin = new FinancialManagementSys();
        // TODO code application logic here
    }
    
}
