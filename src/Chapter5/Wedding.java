package Chapter5;




import java.time.LocalDate;

public class Wedding {
public LocalDate weddingDate=LocalDate.now();
public String couples;
public String location;
public String date=" 1,2030";


    @Override
    public String toString() {
        Couple couple=new Couple();
        couples=couple.getGroom()+" and "+couple.getBride();
        location="Floridablanca Pampanga";
        return "The most awaited Wedding!! \n \n" +
                "WeddingDate : " +weddingDate.getMonth() +date+"\n"+
                "Couple : " + couples + "\n" +
                "Venue : " + location ;
    }

}

