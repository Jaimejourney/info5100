package INFO5100;

public class Tool {
    // add your code here
    public int Strength;
    protected char type;

    public Tool(int strength, char type) {
        Strength = strength;
        this.type = type;
    }

    public void setStrength(int Strength){
        this.Strength = Strength;
    }

    boolean fight(Tool tool) {
        return false;
    }
}

/* Implement class INFO5100.Scissors */
    class Scissors extends Tool {

    public Scissors(int strength) {
        super(strength, 'r');
    }

    public boolean fight(Tool tool){
        if(tool instanceof Rock){
            return this.Strength/2 > tool.Strength;
        }else if(tool instanceof Paper){
            return this.Strength*2 > tool.Strength;
        }else{
            return this.Strength > tool.Strength;
        }
    }
}
/* Implement class INFO5100.Paper */
    class Paper extends Tool{

    public Paper(int strength) {
        super(strength, 'p');
    }

    public boolean fight(Tool tool){
        if(tool instanceof Rock){
            return this.Strength*2 > tool.Strength;
        }else if(tool instanceof Scissors){
            return this.Strength/2 > tool.Strength;
        }else{
            return this.Strength > tool.Strength;
        }
    }


}
/* Implement class INFO5100.Rock */
    class Rock extends Tool{

    public Rock(int strength) {
        super(strength, 'r');
    }

    public boolean fight(Tool tool){
        if(tool instanceof Scissors){
            return this.Strength*2 > tool.Strength;
        }else if(tool instanceof Paper){
            return this.Strength/2 > tool.Strength;
        }else{
            return this.Strength > tool.Strength;
        }
    }
}

class RockPaperScissorsGame{
    public static void main(String args[]){
        Scissors s = new Scissors(5);
        Paper p = new Paper(7);
        Rock r = new Rock(15);
        System.out.println(s.fight(p) + " , "+ p.fight(s) );
        System.out.println(p.fight(r) + " , "+ r.fight(p) );
        System.out.println(r.fight(s) + " , "+ s.fight(r) );
    }
}
