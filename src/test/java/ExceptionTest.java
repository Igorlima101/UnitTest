import org.example.Transaction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ExceptionTest {


    Transaction transaction = new Transaction();

    @Test
    void checkValueSenderTOperation(){
        assertThrows(RuntimeException.class, () -> transaction.validateTransaction(12.0, 11.0));
    }
}
