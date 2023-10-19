
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management;
    
    //before is used to tell the program to run before each test method below
    //in other words it has to initialize the management object
    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        //           parameter 1 is what is EXPECTED (0),
        //           parameter 2 is what management.exerciseList().size() ACTUALly is
        //           (expected,actual)
        assertEquals(0, management.exerciseList().size());

    }

    //in this test we are checking if the list grows by 1 when 'add' method is called
    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void excerciseCanBeMarkedAsCompletedd() {
        management.add("New Exercise");
        management.markAsCompleted("New Exercise");
        assertTrue(management.isCompleted("New Exercise"));
    }
    
    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("New exercise");
        management.markAsCompleted("New Exercise");
        assertFalse(management.isCompleted("Some exercise"));
                
    }

}
