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
        System.out.println("� �� ���� ��� �, �� � ��������.");
    }
}

public class Snake extends Animal{
    @Override
    public void tellHowAreYouMoving() {
        System.out.println("���� ������.");
    }
}

public class Dog extends Animal{
    @Override
    public void tellHowAreYouMoving() {
        System.out.println("� ������. � ����� �� ����.");
    }
}

public class Cat extends Animal {
    @Override
    public void tellHowAreYouMoving() {
        System.out.println("� �����. � �����.");
    }
}

