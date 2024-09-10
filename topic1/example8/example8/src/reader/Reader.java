package reader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Reader {
    BufferedReader reader;
    public Reader(InputStream input) {
        InputStreamReader inputStreamReader = new InputStreamReader(input);
        this.reader = new BufferedReader(inputStreamReader);
    }
    public Reader() {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        this.reader = new BufferedReader(inputStreamReader);
    }

    public String next() {
        String result = "";
        try {
            result = this.reader.readLine();
        } catch (Exception e) {
            new Error(e.getMessage());
        }
        return result;
    }
}
