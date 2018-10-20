package Function;

import java.util.LinkedList;
import java.util.List;

public class Checkout {
    List<Dessertitem> list;

    public Checkout(){
        this.list = new LinkedList<>();
    }

    public int numberOfItems(){
        return list.size();
    }

    public void enterItem(Dessertitem item){
        list.add(item);
    }

    public void clear(){
        list.clear();
    }

    public int totalCost(){
        int res = 0;
        for(Dessertitem item:list){
            res+=item.getCost();
        }
        return res;
    }

    public int totalTax(){
        return Math.round(totalCost()* DessertShoppe.taxRate);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        for (int i = 0; i < (DessertShoppe.maxWidth - DessertShoppe.storeName.length())/2; i++) {
            sb.append(" ");
        }
        sb.append(DessertShoppe.storeName);
        sb.append("\n");
        for (int i = 0; i < (DessertShoppe.maxWidth - DessertShoppe.storeName.length())/2; i++) {
            sb.append(" ");
        }
        for (int i = 0; i < DessertShoppe.storeName.length(); i++) {
            sb.append("-");
        }
        sb.append("\n");
        sb.append("\n");
        for(Dessertitem item:list){
            sb.append(item.toString());
            sb.append("\n");
        }
        sb.append("\n");
        sb.append("Tax");
        for (int i = 0; i < DessertShoppe.maxWidth - 3 - DessertShoppe.cents2dollarsAndCentsmethod(this.totalTax()).length(); i++) {
            sb.append(" ");
        }
        sb.append(DessertShoppe.cents2dollarsAndCentsmethod(this.totalTax()));
        sb.append("\n");
        sb.append("Total Cost");
        for (int i = 0; i < DessertShoppe.maxWidth - 10 - DessertShoppe.cents2dollarsAndCentsmethod(this.totalCost()+this.totalTax()).length(); i++) {
            sb.append(" ");
        }
        sb.append(DessertShoppe.cents2dollarsAndCentsmethod(this.totalCost()+this.totalTax()));
        sb.append("\n\n");
        return sb.toString();
    }


    public static void main(String[] args) {

            Checkout checkout = new Checkout();

            checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
            checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
            checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
            checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));

            System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
            System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
            System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
            System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
            System.out.println(checkout);

            checkout.clear();

            checkout.enterItem(new IceCream("Strawberry Ice Cream", 145));
            checkout.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
            checkout.enterItem(new Candy("Gummy Worms", 1.33, 89));
            checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
            checkout.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
            checkout.enterItem(new Candy("Function.Candy Corn", 3.0, 109));

            System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
            System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
            System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
            System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
            System.out.println(checkout);
        }
}
