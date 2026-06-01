class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] preferenceFreq = new int[2];
        int n = students.length;
        int res = n;
        for(int st : students) {
            preferenceFreq[st]++;
        }
        for(int i = 0; i < n; i++) {
            if(preferenceFreq[sandwiches[i]] > 0) {
                res--;
                preferenceFreq[sandwiches[i]]--;
            } else {
                break;
            }
        }
        return res;
    }
}