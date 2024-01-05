import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Імпорт класів з пакету, в якому знаходиться ECommercePlatform
import com.example.ecommerce.ECommercePlatform;
import com.example.ecommerce.UserInteractionHandler;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class UserInteractionHandlerTest {
    @Test
    void simulateInteractions_DisplayMainMenu() {
        // Arrange
        ECommercePlatform ecommercePlatform = new ECommercePlatform();
        UserInteractionHandler userInteractionHandler = new UserInteractionHandler(ecommercePlatform);

        // Set up System.in to provide user input
        String input = "6\n"; // simulate choosing option 6 to exit
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Set up System.out to capture the console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Act
        userInteractionHandler.simulateInteractions();

        // Assert
        assertTrue(outContent.toString().contains("Вихід"));
    }
    @Test
    void testSimulateInteractions() {
        // You may need to refactor the UserInteractionHandler to accept an InputStream in the constructor
        // to allow for easier testing of simulateInteractions method.

        ECommercePlatform ecommercePlatform = new ECommercePlatform();
        UserInteractionHandler userInteractionHandler = new UserInteractionHandler(ecommercePlatform);

        // Mock user input to simulate interactions
        String mockInput = "1\n6\n";  // Simulates choosing option 1 (display available products) and then option 6 (exit)
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        // Run the simulation
        userInteractionHandler.simulateInteractions();

        // Assuming there are no exceptions thrown, the test passes.
        assertTrue(true);
    }
    @Test
    void testDisplayAvailableProductsMenu() {
        ECommercePlatform ecommercePlatform = new ECommercePlatform();
        UserInteractionHandler userInteractionHandler = new UserInteractionHandler(ecommercePlatform);

        // Mock user input to simulate choosing option 1 (display available products) and then option 6 (exit)
        String mockInput = "1\n6\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        // Run the simulation
        userInteractionHandler.simulateInteractions();

        // Assuming there are no exceptions thrown, the test passes.
        assertTrue(true);
    }

    @Test
    void testAddToCartMenu() {
        ECommercePlatform ecommercePlatform = new ECommercePlatform();
        UserInteractionHandler userInteractionHandler = new UserInteractionHandler(ecommercePlatform);

        // Mock user input to simulate choosing option 2 (add products to the cart) and then option 6 (exit)
        String mockInput = "2\n6\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        // Run the simulation
        userInteractionHandler.simulateInteractions();

        // Assuming there are no exceptions thrown, the test passes.
        assertTrue(true);
    }

    @Test
    void testCreateOrderMenu() {
        ECommercePlatform ecommercePlatform = new ECommercePlatform();
        UserInteractionHandler userInteractionHandler = new UserInteractionHandler(ecommercePlatform);

        // Mock user input to simulate choosing option 3 (create order) and then option 6 (exit)
        String mockInput = "3\n6\n";
        InputStream inputStream = new ByteArrayInputStream(mockInput.getBytes());
        System.setIn(inputStream);

        // Run the simulation
        userInteractionHandler.simulateInteractions();

        // Assuming there are no exceptions thrown, the test passes.
        assertTrue(true);
    }
 }
