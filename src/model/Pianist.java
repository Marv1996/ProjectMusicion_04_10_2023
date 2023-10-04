package model;

public class Pianist extends Musician {

    @Override
    public void play() {
        System.out.println("Play piano");
    }

    @Override
    public void readNotes() {
        System.out.println("Read piano notes");
    }
}
