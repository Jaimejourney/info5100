public class IceCream extends Dessertitem {
    int cost;

    public IceCream(String name, int cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        String price = DessertShoppe.cents2dollarsAndCentsmethod(this.getCost());
        for (int i = 0; i < DessertShoppe.maxWidth-getName().length()-price.length(); i++) {
            sb.append(" ");
        }
        sb.append(price);
        return sb.toString();
    }
}
