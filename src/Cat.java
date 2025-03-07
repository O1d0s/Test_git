public class Cat extends Animal implements interfaceVoice{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void getVoice() {
        System.out.println("meow-meow");
    }


}
