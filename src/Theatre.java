public class Theatre {
    public static void main(String[] args) {
        System.out.println("*** ТЕАТР НАЧИНАЕТ РАБОТУ ***\n");

        // 1. Создаём актёров
        Actor actor1 = new Actor("Хейден", "Кристенсен", Gender.MALE, 183);
        Actor actor2 = new Actor("Натали", "Портман", Gender.FEMALE, 160);
        Actor actor3 = new Actor("Юэн", "Макгрегор", Gender.MALE, 177);
        Actor actor4 = new Actor("Джа-джа", "Бинкс", Gender.MALE, 190);

        // 2. Создаём режиссёров
        Director director1 = new Director("Джордж", "Лукас", Gender.MALE, 4);
        Director director2 = new Director("Джей Джей", "Абрамс", Gender.MALE, 2);

        // 3. Создаём автора музыки и хореографа
        String musicAuthor = "Джон Уильямс";
        String choreographer = "Ник Гиллард";

        System.out.println("Созданный персонал:");
        System.out.println("Актёры: " + actor1 + ", " + actor2 + ", " + actor3 +", " + actor4);
        System.out.println("Режиссёры: " + director1 + ", " + director2);
        System.out.println("Автор музыки: " + musicAuthor);
        System.out.println("Хореограф: " + choreographer);
        System.out.println();

        // 4. Создаём спектакли
        Show regularShow = new Show("Скрытая угроза", 136, director1);

        Opera operaShow = new Opera("Атака клонов", 142, director2,
                musicAuthor,
                "Происходит раскол в Галактической Республике, " +
                        "тысячи систем хотят отделиться под руководством графа Дуку.",
                40);

        Ballet balletShow = new Ballet("Месть ситхов", 135, director1,
                musicAuthor,
                "Идут Войны клонов. Джедаи Энакин Скайуокер и Оби-Ван Кеноби спасают....",
                choreographer);

        System.out.println("Созданные спектакли:");
        System.out.println("1. " + regularShow.title);
        System.out.println("2. " + operaShow.title + " (опера)");
        System.out.println("3. " + balletShow.title + " (балет)");
        System.out.println();

        // 5. Распределяем актёров по спектаклям
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        operaShow.addActor(actor2);
        operaShow.addActor(actor3);
        operaShow.addActor(actor4);

        balletShow.addActor(actor1);
        balletShow.addActor(actor2);
        balletShow.addActor(actor3);

        // Попробуем добавить дубликата
        System.out.print("Попытка добавить дубликата: ");
        System.out.println();
        balletShow.addActor(actor1);
        System.out.println();

        // 6. Выводим списки актёров для каждого спектакля
        System.out.println("*** СПИСКИ АКТЁРОВ ***");
        regularShow.printActorsList();
        System.out.println();
        operaShow.printActorsList();
        System.out.println();
        balletShow.printActorsList();
        System.out.println();

        // 7. Заменяем актёра в одном из спектаклей
        System.out.println("*** ЗАМЕНА АКТЁРА ***");
        System.out.println("Заменяем актёра в спектакле \"" + regularShow.title + "\":");
        regularShow.replaceActor(actor4, "Кристенсен");

        System.out.println();
        System.out.println("Обновлённый список актёров в \"" + regularShow.title + "\":");
        regularShow.printActorsList();
        System.out.println();

        // 8. Пробуем заменить несуществующего актёра
        System.out.println("*** ПОПЫТКА ЗАМЕНЫ НЕСУЩЕСТВУЮЩЕГО АКТЁРА ***");
        operaShow.replaceActor(actor1, "Таркин");
        System.out.println();

        // 9. Выводим информацию о режиссёрах
        System.out.println("*** ИНФОРМАЦИЯ О РЕЖИССЁРАХ ***");
        System.out.println("--Обычный спектакль--");
        regularShow.printDirectorInfo();
        System.out.println("--Оперный спектакль--");
        operaShow.printDirectorInfo();
        System.out.println("--Балетный спектакль--");
        balletShow.printDirectorInfo();
        System.out.println();

        // 10. Выводим либретто для оперного и балетного спектаклей
        System.out.println("*** ЛИБРЕТТО МУЗЫКАЛЬНЫХ СПЕКТАКЛЕЙ ***");
        operaShow.printLibretto();
        balletShow.printLibretto();

        System.out.println("*** ПРЕДСТАВЛЕНИЕ НАЧИНАЕТСЯ! ***");
    }
}
