package pr4_4;

import static pr4_4.Marka.*;

public class MAIN {
    public static void main(String[] args) {

        Computer[] comp = {
                new Memory(LEN,"black",128,"memory"),
                new Monitor(ASUS,"white",256,"monitor"),
                new Processor(SUMSA,"blue",65,"processor")
        };

        new all().print(comp);
    }

}

