package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByDescName(){
        Comparator<Job> jobComparator = new JobDescByName();
        int res = jobComparator.compare(new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(res,lessThan(0));
    }
    @Test
    public void whenComparatorDescByPriority(){
        Comparator<Job> comparator = new JobDescByPriority();
        int res = comparator.compare(new Job("Impl task", 1),
                new Job("Fix bug", 0));
        assertThat(res,lessThan(0));
    }
    @Test
    public void whenComparatorAscByName(){
        Comparator<Job> jobComparator = new JobAscByName();
        int res = jobComparator.compare(new Job("Fixing bug", 1),
                new Job("Impl task", 1));
        assertThat(res,lessThan(0));
    }
    @Test
    public void whenComparatorAscByPriority(){
        Comparator<Job> jobComparator = new JobAscByName();
        int res = jobComparator.compare(new Job("Fixing bug", 1),
                new Job("Impl task", 0));
        assertThat(res,lessThan(0));
    }
    @Test
    public void whenComparatorAscByNameByPriority(){
        Comparator<Job> jobComparator = new JobAscByName().thenComparing(new JobAscByPriority()).
                thenComparing(new JobDescByName());

        int res = jobComparator.compare(new Job("Fix bug", 1),
                new Job("Fix bug", 4));
        assertThat(res,lessThan(0));

    }
    @Test
    public void whenComparatorByNameByPriority(){
        Comparator<Job> jobComparator = new JobAscByName().thenComparing(new JobDescByName());

        int res = jobComparator.compare(new Job("Fix bug", 1),
                new Job("Fixing bug", 4));
        assertThat(res,lessThan(0));

    }

}