package Function;

public class Cookie extends Dessertitem {
    int number;
    int price;

    public Cookie(String name, int number, int price) {
        super(name);
        this.number = number;
        this.price = price;
    }

    @Override
    public int getCost() {
        return Math.round((float)(number/12.0)*price);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(number+" @"+ DessertShoppe.cents2dollarsAndCentsmethod(price)+"/dz."+"\n"+getName());
        String price = DessertShoppe.cents2dollarsAndCentsmethod(this.getCost());
        for (int i = 0; i < DessertShoppe.maxWidth-getName().length()-price.length(); i++) {
            sb.append(" ");
        }
        sb.append(price);
        return sb.toString();
    }
}
