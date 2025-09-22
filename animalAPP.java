import static Status.ALIVE;
import static Status.DEAD;
import static Gender.MALE;
import static Gender.FEMALE;

enum Status {
    DEAD,
    ALIVE
}

enum Gender {
    MALE,
    FEMALE
}

abstract class animal {
    String name;
    int age;
    String food;
    Gender gender;
    Status status;
    public animal(String name, int age, String food, Gender gender, Status status) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.status = status;
    }
    abstract String suara();
    boolean status() {
        return status == ALIVE;
    }
    abstract String move();

    String print(){ 
        return "Animal name : " + name + " / " + age + " / " + food + " / " + gender + " / " + status;
    }
}

class cat extends animal {
    public cat(String name, int age, String food, Gender gender, Status status){
        super(name, age, food, gender, status);
    }

    @Override
    String suara() {
        return "meow";
    }

    boolean status() {
        return super.status();
    }

    @Override
    String move() {
        return "Berjalan dengan 4 kaki";
    }
    @Override
    String print() {
        return super.print();
    }
}

class dog extends animal {
    public dog(String name, int age, String food, Gender gender, Status status){
        super(name, age, food, gender, status);
    }

    @Override
    String suara() {
        return "gok gok";
    }

    boolean status() {
        return super.status();
    }

    @Override
    String move() {
        return "Berjalan dengan 4 kaki";
    }

    @Override
    String print() {
        return super.print();
    }
}

class duck extends animal {
    public duck(String name, int age, String food, Gender gender, Status status){
        super(name, age, food, gender, status);
    }

    @Override
    String suara() {
        return "kwuek kwuek";
    }

    boolean status() {
        return super.status();
    }

    @Override
    String move() {
        return "Berjalan dengan 2 kaki, kadang terbang";
    }

    @Override
    String print() {
        return super.print();
    }
}

class horse extends animal {
    public horse(String name, int age, String food, Gender gender, Status status){
        super(name, age, food, gender, status);
    }

    @Override
    String suara() {
        return "ngihuuuuu";
    }

    boolean status() {
        return super.status();
    }

    @Override
    String move() {
        return "Berjalan dengan 4 kaki";
    }

    @Override
    String print() {
        return super.print();
    }
}

public class animalAPP{
    public static void main(String[] args) {
        animal cat = new cat("Brusko", 3, "cat food", Gender.MALE, Status.ALIVE);
        animal dog = new dog("Cherry", 1, "dog food", Gender.MALE, Status.ALIVE);
        animal duck = new duck("donal bebek", 4, "duck food", Gender.MALE, Status.ALIVE);
        animal horse = new horse("kuda", 10, "horse food", Gender.MALE, Status.ALIVE);
        
        System.out.println(cat.suara());
        System.out.println(cat.print());
        System.out.println(dog.suara());
        System.out.println(dog.print());
        System.out.println(duck.suara());
        System.out.println(duck.print());
        System.out.println(horse.suara());
        System.out.println(horse.print());
    }
}