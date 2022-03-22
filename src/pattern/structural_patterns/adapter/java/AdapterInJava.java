package pattern.structural_patterns.adapter.java;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");
        Enumeration<String> enumeration = Collections.enumeration(strings);

        try (InputStream is = new FileInputStream("input.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader br = new BufferedReader(isr)) {
            while (br.ready()){
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
