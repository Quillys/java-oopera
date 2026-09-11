public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        if (name == null || surname == null || gender == null) {
            throw new IllegalArgumentException("Имя, фамилия, гендер не могут быть null");
        }
        if (numberOfShows < 0) {
            throw new IllegalArgumentException("Колличество спектаклей должно быть положительным");
        }
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return name + " " + surname + " ("+ numberOfShows + " постановы)";
    }
}
