import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
public class BufferReaderInput {
    public static void main(String args[]) throws IOException{
         BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        System.out.println("ans"+t);

    }
}
