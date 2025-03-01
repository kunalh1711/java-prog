package EnumExample;

public class Basic {
    enum Week  implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is Week


        Week() {
            System.out.println("Constructor called for " + this);

        }// this is not public or protected, only private or default
        // why? we dont want to create new objects
        // this is not the enum concept, thats why

        // internally: public static final Week Monday = new Week();
        // void display() {

        // }
        @Override
        public void hello() {
            System.out.println("hey");
        }
    }
    public static void main(final String[] args) {
        final Week week = Week.Monday;

        week.hello();
        // for (Week day : Week.values()) {
        //     System.out.println(day);
        // }

        // System.out.println(week.ordinal());
    }
   
}
