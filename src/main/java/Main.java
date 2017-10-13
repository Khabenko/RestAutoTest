import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DBConector conector = new DBConector();
        ArrayList<String> list;

       list = conector.selectResultList("SELECT Name FROM Contact","Name");
        System.out.println(list.size());
        list = conector.selectResultList("SELECT Name FROM Contact WHERE Name = 'Oleg Mysterious Uknowovych';","Name");
        System.out.println(list.size());



    }




}
