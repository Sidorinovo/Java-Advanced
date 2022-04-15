package Lab03;

import java.io.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("\\s+");
        String command = input[0];
        DecimalFormat format = new DecimalFormat("#.##");
        Map<Integer, BankAccount> accounts = new HashMap<>();

        while (!"End".equals(command)) {
            switch (command) {
                case "Create":
                    BankAccount current = new BankAccount();
                    accounts.put(current.getId(), current);
                    pr.println(String.format("Account ID%d created", current.getId()));
                    break;

                case "Deposit":
                    int id = Integer.parseInt(input[1]);
                    double amount = Double.parseDouble(input[2]);

                    if (!accounts.containsKey(id)) {
                        pr.println("Account does not exist");
                    } else {
                        current = accounts.get(id);
                        current.deposit(amount);
                        accounts.put(id, current);
                        pr.println(String.format("Deposited %.0f to ID%d",amount, id));
                    }
                    break;

                case "SetInterest":
                    double interest = Double.parseDouble(input[1]);
                    BankAccount.setInterestRate(interest);
                    break;

                case "GetInterest":
                    id = Integer.parseInt(input[1]);
                    int years = Integer.parseInt(input[2]);
                    if (accounts.containsKey(id)) {
                        double balance = accounts.get(id).getBalance() * BankAccount.getInterestRate(years);
                        pr.println(String.format("%.2f", balance));
                    } else {
                        pr.println("Account does not exist");
                    }
                    break;
            }

            input = br.readLine().split("\\s+");
            command = input[0];
        }
        pr.close();
    }
}
