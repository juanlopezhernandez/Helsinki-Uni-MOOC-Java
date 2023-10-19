
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;




public class ExerciseManagementTest {
    @Test
    public void exerciseListEmptyAtBeginning () {
        ExerciseManagement management = new ExerciseManagement();
        //           parameter 1 is what is EXPECTED (0),
        //           parameter 2 is what management.exerciseList().size() ACTUALly is
        //           (expected,actual)
        assertEquals (0,management.exerciseList().size());
        
    }
    //in this test we are checking if the list grows by 1 when 'add' method is called
    @Test
    public void addingExerciseGrowsListByOne() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertEquals (1, management.exerciseList().size());
    }
    @Test
    public void addedExerciseIsInList () {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));
        
    }

}
