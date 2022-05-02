import static org.junit.Assert.*;
import org.junit.*;

public class GradeTester {
    @Test
    public void gradeTester() {
        Grades myGrades = new Grades(90, 85, 95);
        assertEquals(90, myGrades.getAverage(), 1);
    }
}
