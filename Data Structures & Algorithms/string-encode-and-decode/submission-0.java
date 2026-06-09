class Solution {

    public String encode(List<String> strs) {
        String encoded_str = "";
        for (String str : strs) {
            encoded_str = encoded_str + Integer.toString(str.length())
                        + '#' + str;
        }
        return encoded_str;
    }

    public List<String> decode(String str) {
        List<String> decoded_str = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') 
                j++;

            int nbr = Integer.parseInt(str.substring(i, j));

            decoded_str.add(str.substring(j + 1, j + 1 + nbr));

            i = j + 1 + nbr;
        }
        return decoded_str;
    }
}
