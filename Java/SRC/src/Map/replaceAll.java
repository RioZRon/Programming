package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by riosysm on 2017/10/24.
 */
public class replaceAll {
    public static void main(String[] args)
    {
        ArrayList<String> str = new ArrayList<String>();
        str.add("haha");
        List<Object> obj = new ArrayList(str);
        List<String> str2 = str;
        List<? extends Object> obj2 = str;
        System.out.println(obj2.get(0).getClass().getName());
        System.out.println(obj2.getClass().getName());
        //�������治��ʹ ����һ�����ͼ��Ͽ��ܲ���ת��
        String[] arrstr = {"a", "b", "c"};
        Object[] arrobj = arrstr;
        System.out.println(arrobj);
        //�Զ�ת��ΪString����  ���ص�classҲ������String



    }
}

