public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dog dog = new Dog("Boyka",2);
        Cat cat = new Cat("Goot",1);

        System.out.println(cat.toString());
        cat.getVoice();
        System.out.println(dog.toString());
        dog.getVoice();


    }
}