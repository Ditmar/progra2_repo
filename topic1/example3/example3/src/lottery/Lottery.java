package lottery;

import java.util.Arrays;

public class Lottery {
    private Integer minNumber;
    private Integer maxNumber;
    private Integer length;
    private Integer list[];
    public Lottery(Integer minNumber, Integer maxNumber, Integer length) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.length = length;
        this.list = new Integer[this.length];
    }
    private Integer generateRandomNumber() {
        Double candidateNumber = Math.random() * (this.maxNumber - this.minNumber) + this.minNumber;
        candidateNumber = (double)Math.round(candidateNumber);
        Integer number = candidateNumber.intValue();
        return number;
    }
    private Boolean isRepeat(Integer number) {
        for (Integer i = 0 ; i < list.length; i++) {
            if (list[i] == number) {
                return false;
            }
        }
        return true;
    }
    private Integer getUniqueNumbers () {
        Boolean flag = true;
        Integer number = null;
        while (flag) {
            number = generateRandomNumber();
            if (isRepeat(number)) {
                flag = false;
            }
        }
        return number;
    }
    public Integer[] generateRandomNumberList() {
        for (Integer i = 0; i < this.length; i++) {
            Integer number = getUniqueNumbers();
            this.list[i] = number;
        }
        Arrays.sort(list);
        return this.list;
    }
    public void printList () {
        for (Integer i = 0;  i < this.list.length; i++) {
            System.out.print( this.list[i] + " , " );
        }
    }
}
