public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Сергей ", "Безруков", Gender.MALE, 1.75);
        Actor actor2 = new Actor("Андрей ", "Миронов", Gender.MALE, 1.80);
        Actor actor3 = new Actor("Юрий ", "Никулин", Gender.MALE, 1.85);

        Director director1 = new Director("Сергей ", "Бондарчук", Gender.MALE, 100);
        Director director2 = new Director("Алла ", "Сурикова", Gender.FEMALE, 105);

        Actor musicAuthor = new Actor("Николай ", "Римский-Корсаков", Gender.MALE, 1.80);
        Actor choreographer = new Actor("Ирина ", "Зеновка", Gender.FEMALE, 1.72);

        Show regularShow = new Show("Анна Каренина", 180, director1);
        Opera opera = new Opera("Борис Годунов", 180, director2, "Михаил Глинка", "Либретто опера", 55);
        Ballet ballet = new Ballet("Щелкунчик", 240, director1, "Петр Чайковский", "Либретто балета", choreographer);

        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        opera.addActor(actor3);
        opera.addActor(actor2);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        regularShow.printActorList();
        System.out.println();
        opera.printActorList();
        System.out.println();
        ballet.printActorList();
        System.out.println();

        ballet.replaceActor("Безруков", actor2);
        ballet.printActorList();
        System.out.println();

        opera.replaceActor("Харатьян", actor3);
        opera.printActorList();
        System.out.println();

        System.out.println("Либретто оперы");
        opera.printLibretto();
        System.out.println();

        System.out.println("Либретто балета");
        ballet.printLibretto();
        System.out.println();
    }
}