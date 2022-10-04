package MasterCardAssessment;

class TaskOne {
    // write method to find the most frequent integer in the array

    public static void main(String[] args) {
        int[] array = {1, 3, 1, 3, 2, 1};
        System.out.println("The most frequently occuring integer is: " + findMostFrequent(array));
    }

    static int findMostFrequent(int[] array) {
        int max = 0, maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i]) 
                    count++;
                
            }
            if (count > maxCount) {
                maxCount = count;
                max = array[i];
            }
        }
        return max;
    }
}