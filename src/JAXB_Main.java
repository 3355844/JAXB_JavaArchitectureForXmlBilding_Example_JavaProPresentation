import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Date;

/**
 * Created by 33558 on 18.01.2017.
 */
public class JAXB_Main {

    public static String PATH = "output.xml";

    public static void main(String[] args) {
      Catalog catalog = new Catalog();
      catalog.add(new Book("Author1", "Title1", 14.55, new Date()));
      catalog.add(new Book("Author2", "Title2", 66, new Date()));

      File file = new File(PATH);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(catalog, file);
            marshaller.marshal(catalog, System.out);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            catalog = (Catalog) unmarshaller.unmarshal(file);
            System.out.println(catalog);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
