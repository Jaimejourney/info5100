public class PsychiatristObject {
    public void examine(MoodyObject moodyObject){
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }
    public void observer(MoodyObject moodyObject){
        moodyObject.expressFeelings();
        System.out.println("Observation:" + moodyObject);
    }


    public static void main(String[] args) {
        PsychiatristObject psychiatristObject = new PsychiatristObject();
        MoodyObject HappyObject = new HappyObject();
        MoodyObject SadObject = new SadObject();

        psychiatristObject.examine(HappyObject);
        psychiatristObject.observer(HappyObject);
        System.out.println();
        psychiatristObject.examine(SadObject);
        psychiatristObject.observer(SadObject);

        /*System.out.println(reverse("    The sky    is blue   "));*/
    }
}
