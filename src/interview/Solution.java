package interview;

import java.util.Arrays;

public class Solution {

    static int findWaitTimeForNextCustomer(int agents, int customer, int[] units) {
        // Initialize an array to keep track of when each agent will be free
        int[] agentAvailableAt = new int[agents];
        Arrays.fill(agentAvailableAt, 0);

        for (int i = 0; i < customer; i++) {
            // Find the index of the agent who will be free the earliest
            int minIndex = 0;
            for (int j = 1; j < agents; j++) {
                if (agentAvailableAt[j] < agentAvailableAt[minIndex]) {
                    minIndex = j;
                }
            }

            // Assign the current customer to this agent
            agentAvailableAt[minIndex] += units[minIndex];
        }
        System.out.println(Arrays.toString(agentAvailableAt));

        // The wait time for the last customer is when their agent will be free
        int lastCustomerAgentIndex = 0;
        for (int j = 1; j < agents; j++) {
            if (agentAvailableAt[j] < agentAvailableAt[lastCustomerAgentIndex]) {
                lastCustomerAgentIndex = j;
            }
        }

        return agentAvailableAt[lastCustomerAgentIndex];
    }

    public static void main(String[] args) {
        int agents = 2;
        int customer = 5;
        int[] units = {1, 5};

        int waitTime = findWaitTimeForNextCustomer(agents, customer, units);
        System.out.println("Total wait time for the next customer: " + waitTime);
    }
}

