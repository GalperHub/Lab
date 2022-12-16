import com.nikita.App;
import com.nikita.OffersList;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        OffersList offers = new OffersList();
        App app = new App(offers);
        app.init();
    }
}