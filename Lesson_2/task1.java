package Lesson_2;

import java.util.HashMap;
import java.util.Map;


public class task1 {
    public static void main(String[] args) {

        Map<String, String> params1 = new HashMap<String,String>();
        params1.put("name","Ivanov");
        params1.put("country","Ukraine");
        params1.put("city","Kiev");
        params1.put("age",null);
        System.out.println(getQuery(params1));
    }
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' ; ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();
    }
}