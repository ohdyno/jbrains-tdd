import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class FailingTest {

    @Test
    public void shouldFail() {
        fail("failing as expected");
    }
}
