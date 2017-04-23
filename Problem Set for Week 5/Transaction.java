package Problem14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author jacobbushdiecker
 */
public class Transaction {

    private Date mDate; // The date of this transaction.
    private char mType; // The type of the transaction, such as 'W' for withdrawal, 'D' for deposit.

    private double mAmount; // The amount of the transaction.
    private double mBalance; // The new balance after this transaction.
    private String mDescription; // The description of this transaction.

    public Transaction(char type, double amount, double balance, String description) {
        mType = type;
        mAmount = amount;
        mBalance = balance;
        mDescription = description;
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }
}
