package projectTwo;

import weekFive.FileRead;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    private HashMap<Integer,ArrayList<Object>> hash = new HashMap<>();
    private int addKey = hash.size()+1;

    protected HashMap<Integer, ArrayList<Object>> getHash(){
        return hash;
    }
    protected void setHash(HashMap<Integer, ArrayList<Object>> Hash){
        this.hash = Hash;
        addKey = hash.size() + 1;
    }
    protected void displayRecords(){
        System.out.println(hash);
    }
    public void addUser(String name, int routingNumber, double balance){
        ArrayList<Object> info = new ArrayList<Object>(){
            {
                add(name);
                add(routingNumber);
                add(balance);
            }
        };
        hash.put(addKey, info);
        addKey = hash.size() + 1;
        System.out.println("User Added");
    }
    public void inputUser(){
        String name = JOptionPane.showInputDialog("Enter User Name:");
        int routingNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter User Routing Number:"));
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter User Balance:"));
        ArrayList<Object> idk = new ArrayList<Object>(){
            {
                add(name);
                add(routingNumber);
                add(balance);
            }
        };
        hash.put(addKey, idk);
        addKey = hash.size() + 1;
        System.out.println("User Added");
    }
    public void removeUser(int id){
        hash.remove(id);
        System.out.println("User Removed");
        addKey = id;
    }
    public HashMap<Integer,ArrayList<Object>> readRecords(String fileName) throws IOException {
        HashMap<Integer, ArrayList<Object>> hash = new HashMap<>();
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new FileReader(file));

        ArrayList<Object> info = new ArrayList<>();
        String line;
        int id = 0;
        while((line = br.readLine()) != null){
            if(line.startsWith("ID:")){
                id = Integer.parseInt(line.substring(line.indexOf(":") + 1));
                info = new ArrayList<>();
            }
            else{
                info.add(line);
            }
            hash.put(id,info);
        }
        br.close();
        return hash;
    }
    public void writeRecords(HashMap<Integer,ArrayList<Object>> hash, String fileName) throws IOException {
        File file = new File(fileName);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
        int through = 0;

        for(int id: hash.keySet()){
            ArrayList<Object> info = hash.get(id);
            through +=1;

            if(through == hash.size()) {
                bw.write(String.format("ID:%d\n%s\n%s\n%s", id, info.get(0), info.get(1), info.get(2)));
            }
            else{
                bw.write(String.format("ID:%d\n%s\n%s\n%s\n", id, info.get(0), info.get(1), info.get(2)));
            }
        }
        bw.close();
    }
}

