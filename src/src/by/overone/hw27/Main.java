package src.by.overone.hw27;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        findWordsRomeoAndJuliet();
        findNumbersWarAndPeace();

    }

    private static void downloadFromInternet(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream(file);

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

    public static void findWordsRomeoAndJuliet() throws IOException {
        downloadFromInternet("https://shakespeare.folger.edu/downloads/txt/romeo-and-juliet_TXT_FolgerShakespeare.txt", "roman.txt");

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

        writeResult("\nThe longest word is ");

        String words[] = s.split("\\s");
        List<String> list = Arrays.asList(words);

        Optional<String> res =
                list.stream().max(Comparator.comparingInt(String::length));

        writeResult(res.get());
    }

    public static void findNumbersWarAndPeace() throws IOException {
        downloadFromInternet("https://all-the-books.ru/download_book/00ae0503fb3889d7e9faf30400aefde3/", "roman1.txt");

        InputStream inputStream = new FileInputStream("roman1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, "Cp1251"));

        StringBuilder result1 = new StringBuilder();

        int i1;
        while ((i1 = br.read()) != -1) {
            result1.append((char) i1);
        }

        br.close();

        writeResult("\nYears: ");

        Set<Integer> numbers = new HashSet<>();

        Pattern pattern = Pattern.compile("\\d+");
        String str = result1.toString();
        Matcher matcher = pattern.matcher(str);

        int start = 0;

        while (matcher.find(start)) {
            String value = str.substring(matcher.start(), matcher.end());
            int result2 = Integer.parseInt(value);

            if(result2 > 1800) {
                numbers.add(result2);
            }

            start = matcher.end();
        }

        for(int m : numbers){
            writeResult(m + " ");
        }

    }
}
