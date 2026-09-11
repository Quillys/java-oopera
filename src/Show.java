import java.util.ArrayList;
import java.util.List;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        if (title == null) {
            throw new IllegalArgumentException("Название спектакля не может быть null!");
        }
        if (duration <= 0) {
            throw new IllegalArgumentException("Длительность спектакля должна быть положительной!");
        }
        if (director == null) {
            throw new IllegalArgumentException("Режиссёр спектакля не может быть null!");
        }
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    // Метод для вывода информации о режиссёре
    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director);
    }

    // Метод для вывода списка актёров
    public void printActorsList() {
        System.out.println("Актёры в спектакле \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  Нет актёров");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println("  - " + actor);
            }
        }
    }

    // Метод для добавления нового актёра
    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Предупреждение: Актёр " + actor + " уже участвует в спектакле!");
            return;
        }
        listOfActors.add(actor);
    }

    // Метод для замены актёра
    public void replaceActor(Actor newActor, String surnameToReplace) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Предупреждение: Актёр " + newActor + " уже участвует в спектакле!");
            return;
        }
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.surname.equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + actor + " заменён на " + newActor);
                return;
            }
        }
        System.out.println("Предупреждение: Актёр с фамилией '" + surnameToReplace + "' не найден в спектакле!");
    }
}
