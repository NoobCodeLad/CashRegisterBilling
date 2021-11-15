package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Register {

    private static Register register = null;

    public static Register getInstance() {
        if (register == null)
            register = new Register();

        return register;
    }

    public String getTotalBill(Map<String,Integer> itemDetails) {

        // Write your code here
        double m_bal = 0.0, a_bal = 0.0, o_bal = 0.0, g_bal = 0.0;
        if(itemDetails.containsKey("mango"))
             m_bal = 1.2* itemDetails.get("mango");
        if (itemDetails.containsKey("apple"))
            a_bal = 2.0* itemDetails.get("apple");
        if (itemDetails.containsKey("orange"))
            o_bal = 1.5* itemDetails.get("orange");
        if (itemDetails.containsKey("grape"))
            g_bal = 1.0* itemDetails.get("grape");

        double balance = m_bal + a_bal + o_bal + g_bal;
        return Double.toString(balance);

    }

}
public class Solution {
    public static void main(String[] args) throws IOException{

        Scanner readInput = new Scanner(System.in);
        String[] input=readInput.nextLine().split(" ");
        Map<String,Integer> myItems=new HashMap<String,Integer>();
        for(int i=0;i<input.length;i+=2){
            myItems.put(input[i],Integer.parseInt(input[i+1]));
        }
        Register regObj = Register.getInstance();
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();

    }

}



