public class Main {

    public static void main(String[] args) {
        var male = new Person("Joao", 12);
        male.incAge();
        var female = new Person("Maria");
        female.incAge();
        System.out.println("Male name: " + male.getName());
        System.out.println("Male age: " + male.getAge());
        System.out.println("Female name: " + female.getName());
        System.out.println("Female na " + female.getAge());
    }
}