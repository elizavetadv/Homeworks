package src.by.overone.hw27;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        downloadFromInternet();

        FileReader in = new FileReader("roman.txt");
        //or
        //FileInputStream in = new FileInputStream("roman.txt");

        StringBuilder result = new StringBuilder();

        int i;
        while ((i = in.read()) != -1) {
            result.append((char) i);
        }

        in.close();

        String s = result.toString();

        writeResult("Most popular word is ");
        String word1 = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
       writeResult(word1);

        writeResult("\nMost unpopular word is ");
        String word2 = Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        writeResult(word2);

    }

    private static void downloadFromInternet() throws IOException {
        URL url = new URL("https://shakespeare.folger.edu/downloads/txt/romeo-and-juliet_TXT_FolgerShakespeare.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream("roman.txt");

        byte[] buffer = new byte[1024];

        int i;
        while ((i = bufferedInputStream.read(buffer, 0, 1024)) != -1) {
            fileOutputStream.write(buffer, 0, i);
        }

        fileOutputStream.close();
        bufferedInputStream.close();
    }

    public static void writeResult(String text) throws IOException {
        FileWriter fileWriter = new FileWriter("result.txt", true);
        fileWriter.write("");
        fileWriter.append(text);
        fileWriter.close();
    }
}
