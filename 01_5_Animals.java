import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.tellHowAreYouMoving();

        Dog dog=new Dog();
        dog.tellHowAreYouMoving();

        Snake snake=new Snake();
        snake.tellHowAreYouMoving();
    }
}

public abstract class Animal {
    public void tellHowAreYouMoving()
    {
        System.out.println("€ не знаю кто €, но € двигаюсь.");
    }
}

public class Snake extends Animal{
    @Override
    public void tellHowAreYouMoving() {
        System.out.println("«ме€ ползет.");
    }
}

public class Dog extends Animal{
    @Override
    public void tellHowAreYouMoving() {
        System.out.println("я собака. я бреду по полю.");
    }
}

public class Cat extends Animal {
    @Override
    public void tellHowAreYouMoving() {
        System.out.println("я кошка. я бегаю.");
    }
}

