package Map;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * Created by riosysm on 2017/10/25.
 */
public class hashTablesenumatrion {
    public static void main(String[] args){
        Hashtable<Integer,String> namebox = new Hashtable<>();
        namebox.put(1,"rio");
        namebox.put(2,"bob");
        namebox.put(3,"niko");
        Enumeration<String> enumeration1 = namebox.elements();
        while (enumeration1.hasMoreElements()){
            System.out.println(enumeration1.nextElement());
        }
        HashMap<Integer,String> namemap = new HashMap<>(namebox);
        Set<Integer> indexSet = namemap.keySet();
        Iterator iterator1 = indexSet.iterator();
            while(iterator1.hasNext())
                System.out.println(namemap.get(iterator1.next()));

    }

}
