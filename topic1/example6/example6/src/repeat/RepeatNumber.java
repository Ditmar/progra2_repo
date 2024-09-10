package repeat;

import java.util.Collection;
import java.util.HashMap;

public class RepeatNumber {
    private Integer[] numberList;
    private HashMap<Integer, Integer> hashNumber;
    public RepeatNumber(Integer[] numberList) {
        this.numberList = numberList;
        this.hashNumber = new HashMap<>();
    }
    private Integer[] convertToIntegerArray(Collection<Integer> values) {
        Integer[] results = new Integer[values.size()];
        Integer index = 0;
        for (Integer item : values) {
            results[index] = item;
            index++;
        }
        return results;
    }
    public Integer[] repeatNumbers() {
        for (Integer i = 0 ; i < this.numberList.length; i++) {
            Integer key = this.numberList[i];
            if (!this.hashNumber.containsKey(key)) {
                this.hashNumber.put(key, 1);
            } else {
                Integer counter = this.hashNumber.get(key);
                counter++;
                this.hashNumber.put(key, counter);
            }
        }
        
        return convertToIntegerArray(this.hashNumber.values());
    }
}
