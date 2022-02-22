import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String,Integer> hash = new HashMap();
        for(int i=0;i<participant.length;i++) {         
            if(!hash.containsKey(participant[i])) {
                hash.put(participant[i], 1);
            }else{
                hash.put(participant[i], hash.get(participant[i])+1);
            }
        }
        for(int i=0;i<completion.length;i++) {
            hash.put(completion[i], hash.get(completion[i])-1);
        }
        System.out.println();
        String answer = (String) getKey(hash,1);
        return answer;
    }
    public static Object getKey(Map<String, Integer> hash, Object value) {

        for(Object o: hash.keySet()) {

            if(hash.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
}
