public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        if (title == null) {
            throw new IllegalArgumentException("Название оперы не может быть null!");
        }
        if (duration <= 0) {
            throw new IllegalArgumentException("Длительность оперы должна быть положительной!");
        }
        if (director == null) {
            throw new IllegalArgumentException("Режиссёр оперы не может быть null!");
        }
        if (musicAuthor == null) {
            throw new IllegalArgumentException("Автор музыки оперы не может быть null!");
        }
        if (librettoText == null) {
            throw new IllegalArgumentException("Текст либретто не может быть null!");
        }
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Метод для печати текста либретто
    public void printLibretto() {
        System.out.println("Либретто спектакля \"" + title + "\":");
        System.out.println(librettoText);
        System.out.println();
    }
}
