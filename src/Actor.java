import java.util.Objects;

    public class Actor extends Person {
        private double height;


        public Actor(String name, String surname, Gender gender, double height) {
            super(name, surname, gender);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return super.toString() + "(" + height + " м)";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Actor actor = (Actor) obj;
            return Double.compare(actor.height, height) == 0 &&
                    getName().equals(actor.getName()) &&
                    getSurname().equals(actor.getSurname());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getSurname(), height);
        }
    }