package test.java.ar.edu.unlp.info.oo1.ej10_jobScheduler;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicio12.*;


public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;
    protected Fifo fifo;
    protected Lifo lifo;
    protected HighestPriority highestpriority;
    protected MostEffort mosteffort;
    

    private void initializeJobs() {

        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
    }
    private void initializedStrategy() 
    {
    	fifo = new Fifo();
        lifo = new Lifo();
        highestpriority = new HighestPriority();
        mosteffort = new MostEffort();
    }
    

    @BeforeEach
    void setUp() {
        this.initializeJobs();
        this.initializedStrategy();
    }

 

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test
    void testSchedule() {
        JobScheduler aScheduler = new JobScheduler();
        aScheduler.schedule(highestPriorityJob);
        assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testUnschedule() {
        JobScheduler aScheduler = new JobScheduler();
        this.scheduleJobsIn(aScheduler);
        aScheduler.unschedule(highestPriorityJob);
        assertFalse(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testNext() {
        JobScheduler scheduler = new JobScheduler();

        
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(fifo), firstJob);
        assertEquals(scheduler.getJobs().size(), 3);
        assertEquals(scheduler.next(lifo), lastJob);
        assertEquals(scheduler.getJobs().size(), 2);
        assertEquals(scheduler.next(highestpriority), highestPriorityJob);
        assertEquals(scheduler.getJobs().size(), 1);
        assertEquals(scheduler.next(mosteffort), mostEffortJob);
        assertEquals(scheduler.getJobs().size(), 0);
    }
}
