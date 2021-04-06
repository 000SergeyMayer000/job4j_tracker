package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("C", 1),
                new Job("B", 4),
                new Job("A", 2),
                new Job("D", 0)
        );
        System.out.println("Несортированная коллекция");
        for (Job job : jobs) {
            System.out.println(job);
        }
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println("Отсортированная коллекция");
        for (Job job : jobs) {
            System.out.println(job);
        }
    }
}