package codewar.kyu.four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextAlignJustifyTest {

    @Test
    void sampleTests() {
        assertEquals("Palavra   grande,   quase   30\nvestibulum urna", TextAlignJustify.justify("Palavra grande, quase 30 vestibulum urna", 30));
        assertEquals("Palavra   grande,   quase   30\nvestibulum urna", TextAlignJustify.justify("Palavra grande,    quase 30 vestibulum urna", 30));
        assertEquals("123  45\n6", TextAlignJustify.justify("123 45 6", 7));
        assertEquals("123", TextAlignJustify.justify("123", 7));
        assertEquals("", TextAlignJustify.justify("", 10));
    }

    private static final String LIPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sa"
            + "gittis dolor mauris, at elementum ligula tempor eget. In quis rhoncus nunc, at aliquet orci. Fusc"
            + "e at dolor sit amet felis suscipit tristique. Nam a imperdiet tellus. Nulla eu vestibulum urna. V"
            + "ivamus tincidunt suscipit enim, nec ultrices nisi volutpat ac. Maecenas sit amet lacinia arcu, no"
            + "n dictum justo. Donec sed quam vel risus faucibus euismod. Suspendisse rhoncus rhoncus felis at f"
            + "ermentum. Donec lorem magna, ultricies a nunc sit amet, blandit fringilla nunc. In vestibulum vel"
            + "it ac felis rhoncus pellentesque. Mauris at tellus enim. Aliquam eleifend tempus dapibus. Pellent"
            + "esque commodo, nisi sit amet hendrerit fringilla, ante odio porta lacus, ut elementum justo nulla"
            + " et dolor.";

    @Test
    void descriptionExample() {
        String expected = "Lorem  ipsum  dolor  sit amet,\nconsectetur  adipiscing  elit.\n"
                + "Vestibulum    sagittis   dolor\nmauris,  at  elementum  ligula\ntempor  eget.  In quis rhoncus\n"
                + "nunc,  at  aliquet orci. Fusce\nat   dolor   sit   amet  felis\nsuscipit   tristique.   Nam  a\n"
                + "imperdiet   tellus.  Nulla  eu\nvestibulum    urna.    Vivamus\ntincidunt  suscipit  enim, nec\n"
                + "ultrices   nisi  volutpat  ac.\nMaecenas   sit   amet  lacinia\narcu,  non dictum justo. Donec\n"
                + "sed  quam  vel  risus faucibus\neuismod.  Suspendisse  rhoncus\nrhoncus  felis  at  fermentum.\n"
                + "Donec lorem magna, ultricies a\nnunc    sit    amet,   blandit\nfringilla  nunc. In vestibulum\n"
                + "velit    ac    felis   rhoncus\npellentesque. Mauris at tellus\nenim.  Aliquam eleifend tempus\n"
                + "dapibus. Pellentesque commodo,\nnisi    sit   amet   hendrerit\nfringilla,   ante  odio  porta\n"
                + "lacus,   ut   elementum  justo\nnulla et dolor.";

        assertEquals(expected, TextAlignJustify.justify(LIPSUM, 30));
    }

    @Test
    void testOtherDescriptionExample() {
        String expected = "Lorem  ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sagittis\n" +
                "dolor  mauris,  at  elementum  ligula  tempor  eget. In quis rhoncus nunc, at\n"
                + "aliquet  orci.  Fusce  at  dolor  sit  amet  felis  suscipit tristique. Nam a\n"
                + "imperdiet  tellus. Nulla eu vestibulum urna. Vivamus tincidunt suscipit enim,\n"
                + "nec  ultrices  nisi  volutpat  ac. Maecenas sit amet lacinia arcu, non dictum\n" +
                "justo. Donec sed quam vel risus faucibus euismod. Suspendisse rhoncus rhoncus\n" +
                "felis  at  fermentum.  Donec  lorem magna, ultricies a nunc sit amet, blandit\n" +
                "fringilla  nunc. In vestibulum velit ac felis rhoncus pellentesque. Mauris at\n" +
                "tellus  enim. Aliquam eleifend tempus dapibus. Pellentesque commodo, nisi sit\n" +
                "amet  hendrerit fringilla, ante odio porta lacus, ut elementum justo nulla et\n" +
                "dolor.";

        assertEquals(expected, TextAlignJustify.justify(LIPSUM, 77));
    }


    @Test
    void testBigTextExample() {
        String expected = "Lorem      ipsum\n" +
                "dolor  sit amet,\n" +
                "consectetur\n" +
                "adipiscing elit.\n" +
                "Vestibulum\n" +
                "sagittis   dolor\n" +
                "mauris,       at\n" +
                "elementum ligula\n" +
                "tempor  eget. In\n" +
                "quis     rhoncus\n" +
                "nunc, at aliquet\n" +
                "orci.  Fusce  at\n" +
                "dolor  sit  amet\n" +
                "felis   suscipit\n" +
                "tristique. Nam a\n" +
                "imperdiet\n" +
                "tellus. Nulla eu\n" +
                "vestibulum urna.\n" +
                "Vivamus\n" +
                "tincidunt\n" +
                "suscipit   enim,\n" +
                "nec     ultrices\n" +
                "nisi    volutpat\n" +
                "ac. Maecenas sit\n" +
                "amet     lacinia\n" +
                "arcu, non dictum\n" +
                "justo. Donec sed\n" +
                "quam  vel  risus\n" +
                "faucibus\n" +
                "euismod.\n" +
                "Suspendisse\n" +
                "rhoncus  rhoncus\n" +
                "felis         at\n" +
                "fermentum. Donec\n" +
                "lorem     magna,\n" +
                "ultricies a nunc\n" +
                "sit        amet,\n" +
                "blandit\n" +
                "fringilla  nunc.\n" +
                "In    vestibulum\n" +
                "velit  ac  felis\n" +
                "rhoncus\n" +
                "pellentesque.\n" +
                "Mauris at tellus\n" +
                "enim.    Aliquam\n" +
                "eleifend  tempus\n" +
                "dapibus.\n" +
                "Pellentesque\n" +
                "commodo,    nisi\n" +
                "sit         amet\n" +
                "hendrerit\n" +
                "fringilla,  ante\n" +
                "odio       porta\n" +
                "lacus,        ut\n" +
                "elementum  justo\n" +
                "nulla et dolor.";

        assertEquals(expected, TextAlignJustify.justify(LIPSUM, 16));
    }
}
