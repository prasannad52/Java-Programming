import java.util.*;

class JobSequencing {
    static class Job {
        int profit;
        int id;
        int deadline;

        public Job(int i, int d, int p) {
            profit = p;
            id = i;
            deadline = d;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collection.sort(jobs, (a, b) -> b.profit - a.profit);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < jobs.size(); i++) {

        }
    }
}