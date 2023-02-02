package tests.standalone;

public class RegistrationFormTests {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        sayHello("Emilija");

        System.out.println("Learning GIT");
        System.out.println("commit from intellij");
        System.out.println("testing");
        System.out.println("new commit - amend");
    }

    String a;

    public int getAge() {
        return age;
    }

    // tuka se pisuva avtomatski testovi

    public RegistrationFormTests(int age) {
        this.age = age;
    }

    private int age = 15;

    //this test will e run once BUG-565 is fixed
    public static void sayHello(String name){
        // TODO: Add support for multiple users
        System.out.println("Hello " + name);
    }

}
