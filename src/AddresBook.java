/**
 * Created by student on 23.10.2014.
 */
public class AddresBook {
 private Addres[] list = new Addres[100];
    private int count = 1;
    public static int getCount(AddresBook book){
        return book.count;
        
    }

    public static void add(AddresBook book, Addres newAddres) {
        book.list [book.count] = newAddres;
        book.count++;
    }
}
