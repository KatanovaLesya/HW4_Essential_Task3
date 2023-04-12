import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Recodable rec = new Player();
        Playable play = new Player();

        System.out.println("Функції при записі: ");
        System.out.println("");

        rec.record();
        rec.pause();
        rec.stop();

        System.out.println("");
        System.out.println("Функції при програванні: ");
        System.out.println("");

        play.pause();
        play.stop();
        play.play();
    }
}

// Потрібно: Створіть 2 інтерфейси Playable та Recodable.
// У кожному з інтерфейсів створіть по 3 методи void play() / void pause() / void stop() та void record() /
// void pause() / void stop() відповідно.
// Створіть похідний клас Player від базових інтерфейсів Playable та Recodable.
// Написати програму, яка виконує програвання та запис.