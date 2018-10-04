public abstract class MoodyObject {
    protected abstract String getMood();
    protected abstract String expressFeelings();
    public void queryMood(){
        System.out.println(this.getMood());
    }
}
