package day0228;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
//        创建一个哈希表集合
        Map<String, String> country = new HashMap<>();
//        以键值对形式存入数据
        country.put("cn", "中国");
        country.put("en", "英国");
        country.put("usa", "美国");
        country.put("au", "澳大利亚");
//        根据键,返回相应的值,如果没有键,则返回null
        System.out.println(country.get("en"));
//        根据键,删除映射的键值对
        country.remove("usa");
//        返回元素的个数
        System.out.println(country.size());
//        返回键的集合
        System.out.println(country.keySet());
//        返回值的集合
        System.out.println(country.values());
//        如果存在这个键值对,则返回true
        System.out.println(country.containsKey("en"));

/*//        通过Map.keySet遍历key和value：,简单易学
        for (String key : country.keySet()) {
            System.out.println("key= "+ key + " and value= " + country.get(key));
        }*/



//        通过Map.entrySet遍历key和value",推荐,速度快
        for (Map.Entry<String, String> entry : country.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
