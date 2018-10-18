public abstract class Dessertitem {
    protected String name;

    public Dessertitem() {
        this.name = name;
    }

    public Dessertitem(String name) {
        if(name.length()<=DessertShoppe.maxSize) this.name = name;
        else{
            this.name = name.substring(0,DessertShoppe.maxSize);
        }
    }


    public final String getName(){
        return this.name;
    }

    public abstract int getCost();
}


class DessertShoppe {
    public static final float taxRate= 0.065f;
    public static final String storeName = "M & M Dessert Shoppe";
    public static final int maxSize = 25;
    public static final int maxWidth = 30;


    public static String cents2dollarsAndCentsmethod(int cent){
        double tmp = cent/100.0;
        String res = String.format("%.2f", tmp);//两位小数

        return res.charAt(0) == '0'? res.substring(1): res;
    }
}