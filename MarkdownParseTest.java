import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void newFile2Test() throws IOException{
        String markdown = Files.readString(Path.of("new-file-2.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(markdown));
    }

    @Test
    public void newFile5Test() throws IOException{
        String markdown = Files.readString(Path.of("new-file-5.md"));
        assertEquals(List.of(), MarkdownParse.getLinks(markdown));
    }

}