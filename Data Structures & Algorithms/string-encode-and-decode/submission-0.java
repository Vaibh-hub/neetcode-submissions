class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i < s.length()) {
            // Find '#'
            int j = i;
            while(s.charAt(j) != '#') {
                j++;
            }
            // Extract length
            int len = Integer.parseInt(s.substring(i, j));
            // Move after '#'
            j++;
            // Extract actual string
            String str = s.substring(j, j + len);
            ans.add(str);
            // Move to next encoded string
            i = j + len;
        }

        return ans;
    }
}
