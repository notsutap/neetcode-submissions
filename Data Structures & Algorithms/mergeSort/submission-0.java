// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        return mergeSortHelper(pairs, 0, pairs.size() - 1);
    }
    public List<Pair> mergeSortHelper(List<Pair> pairs, int l, int u) {
        int m = (l + u) / 2;

        if (u - l + 1 <= 1)
            return pairs;

        mergeSortHelper(pairs, l, m);
        mergeSortHelper(pairs, m + 1, u);

        merge(pairs, l, m, u);

        return pairs;
    }
    public void merge(List<Pair> pairs, int l, int m, int u) {
        int length1 = m - l + 1;
        int length2 = m - u;
        List<Pair> L = new ArrayList<>(pairs.subList(l, m + 1));
        List<Pair> R = new ArrayList<>(pairs.subList(m + 1, u + 1));

        int i = 0;
        int j = 0;
        int k = l;

        while (i < L.size() && j < R.size()) {
            if (L.get(i).key <= R.get(j).key) {
                pairs.set(k, L.get(i));
                i++;
            } else {
                pairs.set(k, R.get(j));
                j++;
            }
            k++;
        }

        while (i < L.size()) {
            pairs.set(k, L.get(i));
            i++;
            k++;
        }

        while (j < R.size()) {
            pairs.set(k, R.get(j));
            j++;
            k++;
        }
    }
}
