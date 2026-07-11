class Solution {
    public String decodeString(String s) {
        int currNum = 0; 
        Deque<String> stringStack = new ArrayDeque<>();
        Deque<Integer> numStack = new ArrayDeque<>();
        StringBuilder currString = new StringBuilder(); 

        for(int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);

           if(Character.isDigit(c)) {
                currNum = currNum * 10 + (c - '0');
            }  else if(c == '[') {
                numStack.push(currNum);
                currNum = 0; 
                stringStack.push(currString.toString());
                currString.setLength(0);  
           } else if(c == ']') {
                int multiple = numStack.pop(); 
                String repeat = currString.toString().repeat(multiple); 
                currString.setLength(0);
                currString.append(stringStack.pop()); 
                currString.append(repeat);
           } else {
                currString.append(c); 
           }           
            
        }
        return currString.toString(); 

    }
}