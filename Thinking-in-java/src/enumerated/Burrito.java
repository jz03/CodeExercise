package enumerated;

import enumerated.enums.Spiciness;

//使用 import static 能够将枚举实例的标识符带入当前的命名空间中
import static enumerated.enums.Spiciness.HOT;
import static enumerated.enums.Spiciness.MEDIUM;
import static enumerated.enums.Spiciness.NOT;

/**
 * @author: 冀陆涛
 * @create: 2018-08-04 17:11
 **/
public class Burrito {
    Spiciness spiciness;
    public Burrito(Spiciness spiciness){
        this.spiciness = spiciness;
    }
    public String toString(){
        return "Burrito is " + spiciness;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }
}
