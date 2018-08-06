package enumerated;

import enumerated.enums.Shrubbery;
/**
 * 枚举类的基本功能
 *
 * @author: 冀陆涛
 * @create: 2018-08-05 09:25
 **/
public class EnumClass {
    public static void main(String[] args) {
        //Shrubbery.values() --[GROUND, CRAWLING, HANGING]数组
        for(Shrubbery s:Shrubbery.values()){
            //int ordinal() 从0开始
            System.out.println(s+" ordinal:"+s.ordinal());
            //两个int值相减
            System.out.println(s.compareTo(Shrubbery.CRAWLING));
            System.out.println(s.equals(Shrubbery.CRAWLING));
            System.out.println(s==Shrubbery.CRAWLING);
            //返回枚举所在的类
            System.out.println(s.getDeclaringClass());
            //得到枚举的值（名字）,和toString()方法相同
            System.out.println(s.name());
            System.out.println("-----------------------------------");

        }
        for(String s:"GROUND CRAWLING HANGING".split(" ")){
            //枚举的静态方法，根据字符串返回对应的实例
            Shrubbery shrub = Enum.valueOf(Shrubbery.class,s);
            System.out.println(shrub);
        }
    }
}
