import Keyboards.KeysOrchestra;
import Strings.StringOrchestra;

public class Main {
    public static void main(String[] args) {
        StringOrchestra stringOrchestra=new StringOrchestra();
        stringOrchestra.playYourParts();
        KeysOrchestra keysOrchestra=new KeysOrchestra();
        keysOrchestra.playYourParts();
    }
}

package Strings;

public class StringOrchestra {
    private Guitar guitar;
    private Bass bass;
    private Cello cello;
    private Violin violin;
    public StringOrchestra(){
        guitar=new Guitar();
        bass=new Bass();
        cello=new Cello();
        violin=new Violin();
    }
    public void playYourParts(){
        guitar.playStrings();
        bass.playStrings();
        cello.playStrings();
        violin.playStrings();
    }

}

package Keyboards;

public class KeysOrchestra {
    public Harpsichord harpsichord;
    public Organ organ;
    public Piano piano;

    public KeysOrchestra(){
        harpsichord=new Harpsichord();
        organ=new Organ();
        piano=new Piano();
    }
    public void playYourParts(){
        harpsichord.playKeys();
        organ.playKeys();
        piano.playKeys();
    }
}

package Strings;

public class Violin implements Strings{
    @Override
    public void playStrings() {
        System.out.println("Играет скрипка.");
    }
}

package Strings;

public class Cello implements Strings{
    @Override
    public void playStrings() {
        System.out.println("Играет Виолончель.");
    }
}

package Strings;

public class Bass implements Strings{
    @Override
    public void playStrings() {
        System.out.println("Играет Басс.");
    }
}

package Strings;

public class Guitar implements Strings {
    @Override
    public void playStrings() {
        System.out.println("Играет гитара.");
    }
}

package Keyboards;

public class Harpsichord implements Keyboards{
    @Override
    public void playKeys() {
        System.out.println("Играет Клавесин.");
    }
}

package Keyboards;

public class Piano implements Keyboards{
    @Override
    public void playKeys() {
        System.out.println("Играет Пианино.");
    }
}

package Keyboards;

public class Organ implements Keyboards{
    @Override
    public void playKeys() {
        System.out.println("Играет Орган.");
    }
}
