public class SadObject extends MoodyObject {
    @Override
    protected String getMood() {
        return "I feel Sas Today";
    }
    @Override
    protected String expressFeelings() {
        return " 'wah' 'boo hoo' 'weep' 'sob' 'weep'";
    }
    public String toString(){
        return "Subject cries a lot";
    }
}
