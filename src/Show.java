import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        } else {
            System.out.println("Актер " + actor + " уже участвует в спектакле");
        }
    }

    public void replaceActor(String surname, Actor newActor) {
        ArrayList<Integer> namesakesIndex = new ArrayList<>();
        for (int y = 0; y < listOfActors.size(); y++) {
            if (listOfActors.get(y).getSurname().equals(surname)) {
                namesakesIndex.add(y);
            }
        }
        if (namesakesIndex.isEmpty()) {
            System.out.println("Актер с фамилией " + surname + " отсутствует в спектакле");
            return;
        }
        int index = -1;
        if (namesakesIndex.size() == 1) {
            index = namesakesIndex.get(0);
        } else {
            System.out.println("Найдены " + namesakesIndex.size() + " однофамильцы с фамилией " + surname);
            for (int i = 0; i < namesakesIndex.size(); i++) {
                int namesakesIndexNew = namesakesIndex.get(i);
                Actor actor = listOfActors.get(namesakesIndexNew);
                System.out.println("номер " + (i + 1) + ": " + actor.getName() + " " + actor.getSurname());
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер для замены: ");
            int number = scanner.nextInt() - 1;
            if (number >= 0 && number < namesakesIndex.size()) {
                index = namesakesIndex.get(number);
            } else {
                System.out.println("Некорректный ввод. Проверьте данные и повторите");
                scanner.close();
                return;
            }
        }
        if (index != -1) {
            listOfActors.set(index, newActor);
            System.out.println("Актер с фамилией " + surname + " замен на " + newActor);
        }
    }

    public void printActorList() {
        System.out.println("Список актеров в спектакле " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
    }

    public void printDirectorInfo() {
        System.out.println("Режиссер спектакля " + title + ": " + director);
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }
}