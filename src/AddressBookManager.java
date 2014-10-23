/**
 * Created by student on 23.10.2014.
 */
public class AddressBookManager {
    public static void main(String[] args) {
        AddresBook book = new AddresBook();
        System.out.println(AddresBook.getCount(book));
        Addres a1 = new Addres();
        a1.name ="Человек";
        a1.mail ="Почта";
        a1.telefon = "Телефон";

        AddresBook.add (book,a1)
    }

}
