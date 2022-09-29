public class Main {
    public static void main(String[] args)
    {
        Cat cat=new Cat();
        cat.tellHowAreYouMoving();

        Dog dog=new Dog();
        dog.tellHowAreYouMoving();

        Snake snake=new Snake();
        snake.tellHowAreYouMoving();
    }
}

public interface Animal {

    public abstract void tellHowAreYouMoving();
}

public class Cat implements Animal{
    @Override
    public void tellHowAreYouMoving() {
        System.out.println("� �����. � �����.");
    }
}

public class Dog implements Animal{
    @Override
    public void tellHowAreYouMoving() {
        System.out.println("� ������. � ����� �� ����.");
    }
}

public class Snake implements Animal{
    @Override
    public void tellHowAreYouMoving() {
        System.out.println("���� ������.");
    }
}
