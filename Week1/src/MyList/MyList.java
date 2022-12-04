package MyList;

public class MyList {
    String myList = " ";

    public String add(String str) {
        String beginning = "C";

        if (str.startsWith(beginning)) {
            myList = str;
        } else {
           myList = "C harfiyle başlamıyor listeye eklenemez";
        }
        return myList;
    }
}
