import java.util.ArrayList;
import java.util.List;

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
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            listOfActors.set(index, newActor);
            System.out.println("Актер с фамилией " + surname + " замен на " + newActor);
        } else {
            System.out.println("Актера с фамилией " + surname + " нет в спектакле ");
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