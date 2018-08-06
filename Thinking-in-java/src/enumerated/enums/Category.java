package enumerated.enums;

import java.util.EnumMap;

import static enumerated.enums.Input.*;

/**
 * 种类
 * @author: 冀陆涛
 * @create: 2018-08-05 21:42
 **/
public enum Category {
    MONEY(NICKEL,DIME,QUARTER,DOLLAR),
    ITEM_SELECTION(TOOTHOASTE,CHIPS,SODA,SOAP),
    QUIT_TRANSACTION(ABORT_TRANSACTION),
    SHUT_DOWN(STOP);
    private Input[] values;
    Category(Input... types){
        values = types;
    }
    private static EnumMap<Input,Category> categories = new EnumMap<Input, Category>(Input.class);
    static{
        for(Category c:Category.class.getEnumConstants()){
            for(Input type:c.values){
                categories.put(type,c);
            }
        }
    }
    public static Category categorize(Input input){
        return categories.get(input);
    }
}
