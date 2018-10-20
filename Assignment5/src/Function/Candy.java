package Function;

public class Candy extends Dessertitem {
    double weight;
    int price;

    public Candy(String name, double weight, int price) {
        super(name);
        this.weight = weight;
        this.price = price;
    }

    @Override
    public int getCost() {
        return Math.round((float)(weight*price));
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(weight+" lbs. @"+DessertShoppe.cents2dollarsAndCentsmethod(price)+"/lb."+"\n"+getName());
        String price = DessertShoppe.cents2dollarsAndCentsmethod(this.getCost());
        for (int i = 0; i < DessertShoppe.maxWidth-getName().length()-price.length(); i++) {
            sb.append(" ");
        }
        sb.append(price);
        return sb.toString();
    }
}
