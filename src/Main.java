public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setFirstName("Анна")
                .setSecondName("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder().setFirstName("Антошка").setAge(10).build();
        System.out.println("У " + mom + " есть сын " + son);
        try {
            Person test1 = new PersonBuilder().build();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        try {
            Person test2 = new PersonBuilder().setFirstName("Анна").build();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        try {
            Person test3 = new PersonBuilder().setFirstName("Анна").setSecondName("Вольф").setAge(-100).build();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}