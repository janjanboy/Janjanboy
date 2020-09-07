package Chapter5;

import java.time.LocalDate;

public class Couple {
String groom= new String();
String bride=new String();



    public String getGroom() {
        Person person1=new Person();
        person1.firstname="Alen";
        person1.lastname="Dimalanta";
        person1.birthdate= LocalDate.now();
        return person1.firstname+" "+person1.lastname;
    }

public String getBride(){
    Person person2=new Person();
    person2.firstname="Sarah";
    person2.lastname="Medina";
    person2.birthdate=LocalDate.now();
    return  person2.firstname+" "+person2.lastname;
    }
}
