package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job testJob1 = new Job();
    Job testJob2 = new Job();

    public void createJobObjects() {
        one = new Job();
        two = new Job();
        three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingJobId() {
        assertTrue(one.getId() != two.getId());
        assertEquals(1, two.getId() - one.getId());
        assertEquals(1, one.getId());
    }

    @Test
    public void testSettingJobFields() {
        assertEquals("Product tester", three.getName());
        assertEquals("ACME", three.getEmployer().getValue());
        assertEquals("Desert", three.getLocation().getValue());
        assertEquals("Quality control", three.getPositionType().getValue());
        assertEquals("Persistence", three.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        assertFalse(four.equals(five));
    }


}

