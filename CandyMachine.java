   package candymachine;
import java.util.Scanner;
 public class CandyShop {

 public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print(" Rodnel's Candy Machine \n");
    System.out.print("1. Candies \n");
    System.out.print("2. Chips \n");
    System.out.print("3. Gums \n");
    System.out.print("4. Cookies \n");

    int a = input.nextInt();
        if (a ==1) {
        System.out.print("You have selected Candies. Here are the items available: \n");
          System.out.print("1. Icool - P2 \n");
          System.out.print("2. Mentos - P2 \n");
          System.out.print("3. Maxx - P2 \n");
          int b = input.nextInt();
                    if (b==1) {
            System.out.print("How Many Icool Candies do you want? \n");
            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Icool Candies \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if (b==2){
            System.out.print("How Many Mentos Candies do you want? \n");
            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Mentos Candies \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if(b==3){
            System.out.print("How Many Maxx Candies do you want? \n");
            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Guava Candies \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
        }
        else if (a== 2) {
          System.out.print("You have selected Chips. Here are the items available: \n");
          System.out.print("1. Oishi - P7 \n ");
          System.out.print("2. Peewee - P7 \n");
          System.out.print("3. Rinbee - P7 \n");

          int b = input.nextInt();

          if (b==1) {
            System.out.print("How Many Oishi do you want? \n");
            int c = input.nextInt();
            int d = c * 7;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Oishi \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }

          }
          else if (b==2){
            System.out.print("How Many Peewee do you want? \n");
            int c = input.nextInt();
            int d = c * 7;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Peewee  \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if(b==3){
            System.out.print("How Many Rinbee do you want? \n");
            int c = input.nextInt();
            int d = c * 7;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Rinbee \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
        }
        else if (a== 3) {
          System.out.print("You have selected Gums. Here are the items available: \n");
          System.out.print("1. DoubleMint - P2 \n ");
          System.out.print("2. Pintoora - P2 \n");
          System.out.print("3. Bubble Yum - P2 \n");

          int b = input.nextInt();

          else  if (b==1) {
                  System.out.print("How Many DoubleMint do you want? \n");

            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " DoubleMint  \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if(b==2){
                System.out.print("How Many Pintoora do you want? \n");
            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Pintoora  \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if(b==3){
                System.out.print("How Many Bubble Yum do you want? \n");
            int c = input.nextInt();
            int d = c * 2;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Bubble Yum  \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
        }
        else if (a == 4)
         System.out.print("You have selected Cookies. Here are the items available: \n");
          System.out.print("1. Presto - P 7 \n ");
          System.out.print("2. Oreo - P 7 \n");
          System.out.print("3. Cookies and Cream - P45 \n");

          int b = input.nextInt();

          else  if (b==1) {
                  System.out.print("How Presto do you want? \n");

            int c = input.nextInt();
            int d = c * 7;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Presto  \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if(b==2){
                System.out.print("How Many Oreo do you want? \n");
            int c = input.nextInt();
            int d = c * 7;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Oreo \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
          else if(b==3){
                System.out.print("How Many Cookies and Cream do you want? \n");
            int c = input.nextInt();
            int d = c * 45;
            System.out.print("Please pay the amount of P" + d + " for " + c + " Cookies and Cream  \n");
            int e = input.nextInt();
            if (d== e) {
              System.out.print("Thank You for Purchasing. Dont have a good day, Have a great day!!");
            } else {
              System.out.print("Sorry Insuficient Balance, Please try again. ");
            }
          }
        }

  
