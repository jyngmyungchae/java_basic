package poly.basic;

public class AnimalMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        flyAnimal(dog);
    }

    public static void soundAnimal(Animal animal){
        System.out.println("소리 테스트 시작");
        animal.sound();
        System.out.println("소리 테스트 종료");
    }

    public static void flyAnimal(Fly fly){
        fly.fly();
    }
}
