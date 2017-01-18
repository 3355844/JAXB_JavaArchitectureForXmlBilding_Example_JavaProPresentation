import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 33558 on 18.01.2017.
 */
@XmlRootElement(name = "catalog")
public class Catalog {
    @XmlElement(name = "book")
    private List<Book> bookList = new ArrayList<>();

    public void add(Book book) {
        bookList.add(book);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(bookList.toArray());
    }
}
