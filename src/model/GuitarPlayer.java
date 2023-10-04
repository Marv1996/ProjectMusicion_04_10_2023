package model;

public abstract class GuitarPlayer extends Musician {
    @Override
    public void readNotes() {
        System.out.println("Read guitar notes");
    }
}
