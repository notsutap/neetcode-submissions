class Solution {

/*
Hello, world
5#hello, 5#world
5#hello5#world
*/
    public String encode(List<String> strs) {
        StringBuffer strB = new StringBuffer();
        for(String str : strs) {
            strB.append(str.length());
            strB.append('#');
            strB.append(str);
        }
        return strB.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        String word;
        int i = 0, j = 0, len = 0;
        while(i < str.length()) {
            j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            len = Integer.parseInt(str.substring(i, j));
            word = str.substring(j + 1, len + j + 1);
            res.add(word);
            i = j + len + 1;
        }
        return res;
    }
}
