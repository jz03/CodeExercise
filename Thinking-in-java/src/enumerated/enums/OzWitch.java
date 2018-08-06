package enumerated.enums;

/**
 * 方位
 * 增加描述属性,给枚举增加新功能
 *
 * @author: 冀陆涛
 * @create: 2018-08-04 17:31
 **/
public enum OzWitch {
    WEST("西方"),
    NORTH("北方"),
    EAST("东方"),
    SOUTH("南方");
    private String desc;
    private OzWitch(String desc){
        this.desc = desc;
    }
    //private 即使不写也是private
    private String getDesc(){
        return desc;
    }

    public static void main(String[] args) {
        for(OzWitch witch : OzWitch.values()){
            System.out.println(witch+ " : " + witch.getDesc());
        }
    }
}
