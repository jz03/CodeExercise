package enumerated;

import enumerated.enums.Explore;

/**
 * getEnumConstants()获取enum实例
 *
 * @author: 冀陆涛
 * @create: 2018-08-04 21:13
 **/
public class UpcastEnum {
    public static void main(String[] args) {
        Explore[] explores = Explore.values();
        Enum e = Explore.HERE;
        for(Enum en:e.getClass().getEnumConstants()){
            System.out.println(en);
        }
    }
}
