package src.by.overone.hw27;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
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

        System.out.println(result);
    }

    private static void downloadFromInternet(String urlStr, String file) throws IOException, IOException {
        URL url = new URL(urlStr);

        BufferedInputStream bufferedInputStream= new BufferedInputStream(url.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        byte[] buffer = new byte[1024];

        int i;
        while ((i = bufferedInputStream.read(buffer, 0, 1024)) != -1) {
            fileOutputStream.write(buffer, 0, i);
        }

        fileOutputStream.close();
        bufferedInputStream.close();
    }
}
