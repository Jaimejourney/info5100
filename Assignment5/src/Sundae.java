public class Sundae extends IceCream {
    String topping;
    int toppingPrice;

    public Sundae(String name, int cost,String topping,int toppingPrice) {
        super(name, cost);
        this.topping = topping;
        this.toppingPrice =  toppingPrice;
    }

    public int getCost(){
        return cost+toppingPrice;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(topping+" ");
        sb.append("with" + "\n");
        sb.append(getName());
        String price = DessertShoppe.cents2dollarsAndCentsmethod(this.getCost());
        for (int i = 0; i < DessertShoppe.maxWidth-getName().length()-price.length(); i++) {
            sb.append(" ");
        }
        sb.append(price);
        return sb.toString();
    }
}
