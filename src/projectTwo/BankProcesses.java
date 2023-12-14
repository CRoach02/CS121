package projectTwo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankProcesses {
    private Bank fleecaBank = new Bank();
    private HashMap<Integer,ArrayList<Object>> fleecaHash;
    BankProcesses(HashMap<Integer, ArrayList<Object>> Hash){
        this.fleecaHash = Hash;
    }

    public void getUserInfo(int id) {
        if (!fleecaHash.containsKey(id)) {
            System.out.println("User Does Not Exist");
        } else {
            ArrayList<Object> info = fleecaHash.get(id);
            System.out.println("***User Information***");
            System.out.printf("User ID: %d\nName: %s\nRouting Number: %d\nBalance: $%.2f\n", id, info.get(0), Integer.parseInt(info.get(1).toString()), Double.parseDouble(info.get(2).toString()));

        }
    }
    public void findID(String userName){
        ArrayList<Object> hashID = fleecaHash.get(userName);
        String i = String.valueOf(hashID);
        System.out.println("ID: "+hashID);
    }
    public Double getBalance(int id){
        if(!fleecaHash.containsKey(id)){
            return null;
        }
        else {
            return Double.parseDouble(fleecaHash.get(id).get(2).toString());
        }
    }
    public String getUser(int id){
        if(!fleecaHash.containsKey(id)){
            return null;
        }
        else {
            return fleecaHash.get(id).get(0).toString();
        }
    }
    public int getRoutingNum(int id){
        if(!fleecaHash.containsKey(id)){
            //return Integer.parseInt(null);
            return id;
        }
        else {
            return Integer.parseInt(fleecaHash.get(id).get(1).toString());
        }
    }
    public void adjustBalance(int id, double change){
        if(!fleecaHash.containsKey(id)){
            System.out.println("User Does Not Exist");
        }
        else {
            ArrayList<Object> info = fleecaHash.get(id);
            info.set(2, getBalance(id) + change);
            fleecaHash.replace(id, info);
            if (change >= 0) {
                System.out.printf("$%.2f Added to %s's Balance\n", Math.abs(change), info.get(0));
            } else {
                System.out.printf("$%.2f Deducted from %s's Balance\n", Math.abs(change), info.get(0));
            }
        }
    }
    public void tranferFunds(int from, int to, double amount){
        if(!fleecaHash.containsKey(from) || !fleecaHash.containsKey(to)){
            System.out.println("One or More Inputted Account Does Not Exist");
        }
        else {
            ArrayList<Object> info1 = fleecaHash.get(from);
            ArrayList<Object> info2 = fleecaHash.get(to);
            info2.set(2, Double.parseDouble(info2.get(2).toString()) + amount);
            info1.set(2, Double.parseDouble(info1.get(2).toString()) - amount);
            System.out.printf("$%.2f Transferred from %s to %s\n", amount, info1.get(0), info2.get(0));
        }
    }
    public int userConfirm(){
        int userStatus = JOptionPane.showConfirmDialog(null, "Would you like to return to the first screen?\n\n(To exit, select the X in the upper right corner)");
        System.out.println(userStatus);
        return userStatus;
    }
    public int routingNum(){
        double rNum = Math.random();
        rNum *= 10000000;
        int routing = (int)rNum;
        return routing;
    }

}
