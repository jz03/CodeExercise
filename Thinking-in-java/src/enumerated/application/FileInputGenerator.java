package enumerated.application;

import String.util.TextFile;
import enumerated.enums.Input;
import util.Generator;

import java.util.Iterator;

/**
 * @author: 冀陆涛
 * @create: 2018-08-05 22:29
 **/
public class FileInputGenerator implements Generator<Input> {
    private Iterator<String> input;

    public FileInputGenerator(String fileName) {
        input = new TextFile(fileName, ":").iterator();
    }

    @Override
    public Input next() {
        if (!input.hasNext())
            return null;
        return Enum.valueOf(Input.class,input.next().trim());
    }
}
