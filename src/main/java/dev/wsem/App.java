package dev.wsem;

import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("WSEM le Dr Computeur");
        System.out.println(asciiArt);
    }
}
