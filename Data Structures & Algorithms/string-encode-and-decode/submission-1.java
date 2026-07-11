class Solution {

    public String encode(List<String> strs) {
        //we need to append each word in the list with a certain number 
        //of characters so the decoder will be able to figure out how much until 
        //the next set of instructions.
        StringBuilder encodedString = new StringBuilder(); 
        String endDelimiter = "#";
        for(int i = 0; i < strs.size(); i++) {
            String s = strs.get(i);
            encodedString.append(s.length()+endDelimiter+s);        
        }
        return encodedString.toString(); 
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>(); 
        for(int i = 0; i < str.length();) {
            int characterCount = 0;
            while(str.charAt(i) != '#') {
                characterCount = characterCount * 10 + (str.charAt(i) - '0');
                i++;
            }
            System.out.println(i + " <- i value"); 
            System.out.println(characterCount + " <- char count"); 
            decodedString.add(str.substring(i+1, i + characterCount + 1));
            i += characterCount + 1; 
        }
        return decodedString;
    }
}
