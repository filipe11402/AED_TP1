import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CustomStringOrdererTests { 
    @Test
    public void customStringOrderer_ordersStringBasedOnDesiredOrdering(){
        assertEquals("123456789", Entrypoint.customStringOrderer("147852369", "123456789"));
    }
}
