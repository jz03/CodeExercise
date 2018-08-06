package enumerated.application;

import enumerated.enums.Input;
import util.Generator;

/**
 * @author: 冀陆涛
 * @create: 2018-08-05 22:27
 **/
public class RandomInputGenerator implements Generator<Input> {

    @Override
    public Input next() {
        return Input.randomSelection();
    }
}
