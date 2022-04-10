import static org.junit.Assert.assertEquals;
import org.junit.Test;
import javafx.util.Pair;

public class CustomStringOrdererTests { 
    @Test
    public void customStringOrderer_ordersStringBasedOnDesiredOrdering(){
        assertEquals(new Pair<>("123456789", 9), Entrypoint.customStringOrderer("147852369", "123456789"));
    }
}
