package assignment;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// shop sales tracker
Scanner scanner = new Scanner(System.in);
double[] sales = new double[100];
//stores sale of maximum 100 sales
int count =0;
int choice;
double total =0;

     System.out.println("SHOP SALES TRACKER");
 //DO WHILE keeps the menu open until there is a user
     do {
     System.out.println("Add Sale");
     System.out.println("View Sale");
     System.out.println("Exit");
     System.out.println("Choose: ");
     choice = scanner.nextInt();
    	      
//WHILE LOOP: DONT ALLOW WRONG CHOICE
     while (choice < 1 || choice > 3) {
     System.out.println("Enter 1-3 only: ");
     choice = scanner.nextInt();
     }
     if (choice == 1) {
    	 System.out.println("Enter sale amount(UgX): ");
    	 double amount = scanner.nextDouble();
    	 //confirm amount while loop
    	 while (amount <= 0) {
    		 System.out.println("Enter again: ");
    		 amount = scanner.nextDouble();
    	 }
     sales[count] = amount;
     count++;
     System.out.println("Sale Added");
     } else if (choice ==2) {
    	 if(count==0) {
    		 System.out.println("No sales yet");
    	 } else {
    		 total = 0;
    	 }
     }
     for(int i =0; i < count; i++) {
    	 System.out.println("Sale" + (i+1)+":UGX " + sales[i]);
    	 total+= sales[i];
     }
     double average = total / count;
     //ternary statements
     String perfomance = (total >= 100000)? "GOOD DAY!"  : "Slow day";
     String avgStatus = (average >= 20000)? "High Value Sales" : "Low Value Sales";
     String stockAdvise = (count >= 5)? "Consider restocking" : "Stock Still full";
     
     System.out.println("Total: UGX " + total);
     
     System.out.println("Average: UGX "+ average);
     
     System.out.println("Perfomance: " + perfomance);
     
     System.out.println("Sales Type: " + avgStatus );
     
     System.out.println("Advise: " + stockAdvise);
     
     } while(choice!= 3);// ends when user picks 3
     
     System.out.println("System closed.Total sales today: UGX " + total);
        scanner.close();
        }}
     
     
     
     
