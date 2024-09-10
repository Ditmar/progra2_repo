package read;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reader extends BufferedReader {

    public Reader(java.io.Reader in) {
        super(in);
    
    }
    public Reader() {
        super(new InputStreamReader(System.in));
    }
    public Double readDouble() {
        Double result = null;
        try {
            String input  = this.readLine();
            result = Double.parseDouble(input);
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        
        return result;
    }
    public Integer readInt() {
        Integer result = null;
        try {
            String input  = this.readLine();
            result = Integer.parseInt(input);
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        
        return result;
    }
    
}
