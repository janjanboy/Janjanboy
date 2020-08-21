package PlayGround;

public class DogsTestDrives {
    public static void main(String[] args) {
//this is were to call the HeadFirstDogs

        String names="Name:";
        String ages="Age:";
        String sizes="Size:";


        HeadFirstDogs dog1=new HeadFirstDogs(); //This is a Dog object
        dog1.name=" Chukoy ";          // Use the dot operator to set the name,size and age of the dog
        dog1.age= 5 ;
        dog1.size=" Payat ";
        System.out.println(names+dog1.name+"\n"+ages+dog1.age+"\n"+sizes+dog1.size);
        dog1.bark();  //Calling bark Method

        HeadFirstDogs dog2=new HeadFirstDogs();
        dog2.name=" Snow -aka- (Kadiong) ";
        dog2.age= 3 ;
        dog2.size= " Mataba ";
        System.out.println(names+dog2.name+"\n"+ages+dog2.age+"\n"+sizes+dog2.size);
        dog2.bark2();

        HeadFirstDogs dog3=new HeadFirstDogs();
        dog3.name=" IO ";
        dog3.age= 4;
        dog3.size=" Mataba ";
        System.out.println(names+dog3.name+"\n"+ages+dog3.age+"\n"+sizes+dog3.size);
        dog3.bark3();

        HeadFirstDogs dog4=new HeadFirstDogs();
        dog4.name=" OG ";
        dog4.age= 5;
        dog4.size= " Pure Muscles ";
        System.out.println("Name:"+dog4.name+"\n"+"Age:"+dog4.age+"\n"+"Size:"+dog4.size);
        dog4.bark4();
    }
}
