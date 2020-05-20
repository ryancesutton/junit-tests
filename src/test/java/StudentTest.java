import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfGetIdWorks () {
        assertEquals(7777777, Student.id);
    }

    @Test
    public void testIfGetNameWorks () {
        assertEquals("Ry Sutton", Student.name);
    }

    @Test
    public void testIfAddGradeWorks () {
        assertEquals(99, Student.grades.lastIndexOf(99));
    }

    @Test
    public void testIfGetAverageWorks () {

    }

}
