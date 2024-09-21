// https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.List;

public class Q11_MatchingRule {
   public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int col;
       if (null==ruleKey) {
           col=2;
       }else col = switch (ruleKey) {
        case "type" -> 0;
        case "color" -> 1;
        default -> 2;
    };
       int count=0;
       for (int i = 0; i < items.size(); i++) {
         if (items.get(i).get(col).equals(ruleValue)) {
           count++;
         }
       }
   
       return count;
    } 
}
