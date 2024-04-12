/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Domain.Client;
import Logic.SavingAccount;
import Logic.Log;
import Logic.Binnacle;
/**
 *
 * @author User
 */
public class LogTesting {
    
        public LogTesting() {}
  
    public void test(){
    
        Client clients[] = new Client[10];
        
        Client client1 = new Client("1-1112-4567", "Joaquin", "67678989", "Limon, Colina");
        Client client2 = new Client("7-2345-9876", "Laura", "82345678", "Limon, Moin");
        clients[0] = client1;
        clients[1] = client2;
        SavingAccount account1 = new SavingAccount("2024-03-15", 12, 15, "104560",25000,client1);
        SavingAccount account2 = new SavingAccount("2024-03-15", 6, 12, "104561",10000,client2);

        Log log[] = new Log[5];
        log[0] = new Log( "Saving Amount", account1, 7000);
        log[1] = new Log( "WithDraw Amount", account2, 5000);
        
        for (int i = 0; i < log.length; i++) {
            if(log[i]!=null)
                System.out.println(log[i].toString());
        }
        
        Binnacle binnacle1 = new Binnacle("Deposit",account1.toString());
        Binnacle binnacle2 = new Binnacle("WithDraw Amount",account2.toString());
        
        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("BINNACLE INFORMATION");
        System.out.println(binnacle1.toString());
        System.out.println(binnacle2.toString());
    }
    
}
