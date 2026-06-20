public class Ballet extends MusicalShow {
    private Actor choreographer;

    public Ballet(String title, int duration, Director director, String musicAuthor, String librettoText, Actor choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "Балет" + getTitle() + " ," + " хореограф " + choreographer;
    }
}