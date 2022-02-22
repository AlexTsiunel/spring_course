import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.Cat;
import spring_introduction.Person;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
