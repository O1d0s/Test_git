public class Dog extends Animal implements interfaceVoice {


    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void getVoice() {
        System.out.println("gaf-gaf");
    }


}
