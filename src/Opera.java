public class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director,
                 String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
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
        if (choirSize <= 0) {
            throw new IllegalArgumentException("Колличество человек в хоре не может быть меньше 1!");
        }
        this.choirSize = choirSize;
    }
}