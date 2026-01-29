/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double item1Price = 20.99;
        double item2Price = 37.99;
        double item3Price = 549.99;
        System.out.println("🍖Welcome to Ghassemian Gastronomy!🍖");
        System.out.println("Here is the menu to our restaurant:");
        System.out.println("1.🥓 Premium Bacon - $" + item1Price);
        System.out.println("2.🦞 Whole Lobster - $" + item2Price);
        System.out.println("3.🥩 A5 Wagyu - $" + item3Price);
        System.out.println();
        
        
        System.out.println("What your name for this order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many Premium Bacons do you want?");
        int quantity1 = sc.nextInt();
        System.out.println("How many Whole Lobsters do you want?");
        int quantity2 = sc.nextInt();
        System.out.println("How many A5 Wagyus do you want?");
        int quantity3 = sc.nextInt();
        System.out.println();
        
        double total1 = item1Price * quantity1;
        double total2 = item2Price * quantity2;
        double total3 = item3Price * quantity3;
        double currentTotal = total1+total2+total3;
        System.out.println("Your current total is: $" + currentTotal);
        
        System.out.println("What percent would you like to tip?");
        double tipPercent = sc.nextDouble();
        double tip = currentTotal * (tipPercent/100);
        double grandTotal = currentTotal + tip;
        
        System.out.println("🧾 " + name + "'s Receipt:");
        System.out.println(quantity1 + " x Premium Bacon = $" + total1);
        System.out.println(quantity2 + " x Whole Lobster = $" + total2);
        System.out.println(quantity3 + " x A5 Wagyu = $" + total3);
        System.out.println("Tip (" + tipPercent + ") = " + tip);
        System.out.println("------------------------------------------");
        System.out.println("Grand Total = $" + grandTotal);
        System.out.println("-------------------------------------------");
        System.out.println("Thanks for eating at Ghassemian Gastronomy!");
        
	}
}
