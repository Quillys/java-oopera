public class Ballet extends MusicalShow {
    private String choreographer;

    public Ballet(String title, int duration, Director director,
                  String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        if (title == null) {
            throw new IllegalArgumentException("Название баллета не может быть null!");
        }
        if (duration <= 0) {
            throw new IllegalArgumentException("Длительность баллета должна быть положительной!");
        }
        if (director == null) {
            throw new IllegalArgumentException("Режиссёр баллета не может быть null!");
        }
        if (musicAuthor == null) {
            throw new IllegalArgumentException("Автор музыки баллета не может быть null!");
        }
        if (librettoText == null) {
            throw new IllegalArgumentException("Текст либретто не может быть null!");
        }
        if (choreographer == null) {
            throw new IllegalArgumentException("Хореограф не может быть null!");
        }
        this.choreographer = choreographer;
    }
}
