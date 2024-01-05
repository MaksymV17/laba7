import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ECommerceDemoTest {
    @Test
    void main_SimulateInteractions_DisplayECommercePlatformState() {
        // Arrange
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        ECommerceDemo.main(new String[0]);

        // Assert
        assertTrue(outContent.toString().contains("Стан електронної комерції після взаємодії:"));
     }

}
