package projectTwo;

import javax.swing.*;
import java.io.IOException;

public class bankLoop{
    public static void main(String[] args) throws IOException {
        Bank fleecaBank = new Bank();

        fleecaBank.setHash(fleecaBank.readRecords("bankRecords.txt"));

        fleecaBank.writeRecords(fleecaBank.getHash(), "bankRecords.txt");
        fleecaBank.setHash(fleecaBank.readRecords("bankRecords.txt"));
        System.out.println(fleecaBank.readRecords("bankRecords.txt"));

        BankProcesses fleecaProcesses = new BankProcesses(fleecaBank.getHash());

        Boolean loop = true;

        while (loop == true){
            int userStatus = JOptionPane.showConfirmDialog(null, "Are you a new user?\nNotice: Users just created will need to reopen the program\n\n(To exit, select the X in the upper right corner)");
            System.out.println(userStatus);
            if(userStatus == 2){
                JOptionPane.showMessageDialog(null, "Please select yes or no.\n\n(To exit, select the X\nin the upper right corner)");
                userStatus = fleecaProcesses.userConfirm();
            }if(userStatus == -1){
                break;
            }else if(userStatus == 0){
                System.out.println("New user");
                String userName = JOptionPane.showInputDialog("Please enter your name.");
                int routingNum = fleecaProcesses.routingNum();
                String balInput = JOptionPane.showInputDialog(null,"Please enter your balance in the following format: 00.00");

                if (userName != null && !userName.isEmpty() && balInput != null && !balInput.isEmpty()) {
                    Double balance = Double.parseDouble(balInput);
                    fleecaBank.addUser(userName, routingNum, balance);
                    fleecaBank.writeRecords(fleecaBank.getHash(), "bankRecords.txt");
                    fleecaBank.setHash(fleecaBank.readRecords("bankRecords.txt"));
                    Integer userID = fleecaBank.getHash().size();
                    JOptionPane.showMessageDialog(null,"User has been added, your ID is: "+userID+".\nYou are being returned to the starting screen.\n\n(To exit, select the X in the upper right corner)");

                }else if (userName == null || userName.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"You failed to enter a name.\nYou are being returned to the starting screen.\n\n(To exit, select the X in the upper right corner)");

                }else if (balInput == null || balInput.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"You failed to enter a balance.\nYou are being returned to the starting screen.\n\n(To exit, select the X in the upper right corner)");

                }else{
                    break;
                }

            }else if(userStatus == 1){
                System.out.println("Existing user");
                int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter your user ID."));
                fleecaBank.displayRecords();

                String balance = String.valueOf(fleecaProcesses.getBalance(userInput));
                String routingNum = String.valueOf(fleecaProcesses.getRoutingNum(userInput));
                String user = String.valueOf(fleecaProcesses.getUser(userInput));
                JOptionPane.showMessageDialog(null, "Account Details:\nUsername: "+user+"\nRouting Number: "+routingNum+"\nBalance: $"+balance);

                String balChange = JOptionPane.showInputDialog(null,"To edit your balance, type 'b'.\nTo remove your account, type 'r'.\nTo transfer funds to another account, type 't'.\n\n(To exit, select the X in the upper right corner)");

                if (balChange.equalsIgnoreCase("t")){
                    int from = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of the account to transfer funds from."));
                    int to = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID of the account to transfer funds to."));
                    Double amnt = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount to be transferred."));
                    fleecaProcesses.tranferFunds(from,to,amnt);

                } else if (balChange.equalsIgnoreCase("b")){
                    //adjust balance
                    int change = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount to be changed\nFor adding just type the amount\nFor subtracting add the negative (-) symbol before the amount.\n\n(To exit, select the Xin the upper right corner)"));
                    fleecaProcesses.adjustBalance(userInput, change);
                    fleecaBank.writeRecords(fleecaBank.getHash(), "bankRecords.txt");
                    fleecaBank.setHash(fleecaBank.readRecords("bankRecords.txt"));
                    String balance1 = String.valueOf(fleecaProcesses.getBalance(userInput));
                    JOptionPane.showMessageDialog(null, "New Balance: "+balance1);

                } else if (balChange.equalsIgnoreCase("r")) {
                    int rConfirm = JOptionPane.showConfirmDialog(null, "Do you want to remove your account");
                    if(rConfirm == 0){
                        fleecaBank.removeUser(userInput);
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null,"You have been returned to the start page.");
                    }

                } else{
                    JOptionPane.showMessageDialog(null,"You have been returned to the start page.");
                }
            }
        }
    }
}
