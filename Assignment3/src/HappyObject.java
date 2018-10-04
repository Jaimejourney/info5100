public class HappyObject extends MoodyObject {
    @Override
    protected String getMood() {
        return "I feel happy today！";
    }
    @Override
    protected String expressFeelings() {
        return "hehehehe...hahahahah...HAHAHAHAHAHA!";
    }
    public String toString(){
        return "Subject laughs a lot";
    }
}
