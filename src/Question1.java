public class Question1 {
    public static void main(String[] args) {
        PersonJava personJava = new PersonJava();
        personJava.setAddress("g-37");
        personJava.setAge(22);
        personJava.setGender('m');
        personJava.setName("chunks");

        System.out.println("Name Via Getter     " + personJava.getName());
        System.out.println("Age Via Getter      " + personJava.getAge());
        System.out.println("Gender Via Getter   " + personJava.getGender());
        System.out.println("Address Via Getter  " + personJava.getAddress());
        System.out.println("Name Via dot        " + personJava.name);
        System.out.println("Age Via dot         " + personJava.age);
        System.out.println("Gender Via dot      " + personJava.gender);
        System.out.println("Address Via dot     " + personJava.address);


    }
}
