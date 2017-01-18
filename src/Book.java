import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


/**
 * Created by 33558 on 18.01.2017.
 */
@XmlRootElement(name = "book")
public class Book {

    private String author;
    private String title;
    private double price;
    private Date publishDate;

    public Book() {
    }

    public Book(String author, String title, double price, Date publishDate) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", publishDate=" + publishDate +
                '}' + "\n";
    }

    public String getAuthor() {
        return author;
    }

    @XmlElement(name = "author")
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @XmlElement(name = "title")
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    @XmlElement(name = "price")
    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    @XmlElement(name = "publish_date")
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
