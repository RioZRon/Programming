package Stream.Ex.Four.patten;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Describe:
 * @Date: 2017/10/26
 * @Modifiedby:
 */
public class test {
    public static void main(String[] args){
        String line = "id: 1 name: rio birth: Sat Dec 26 00:00:00 CST 3896";
        String pattern = "(id\\b.\\s)(\\d)(\\sname.)(\\D*)(\\sbirth.)(.*)";


        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
            System.out.println("Found value: " + m.group(4) );
            System.out.println("Found value: " + m.group(5) );
            System.out.println("Found value: " + m.group(6) );
        } else {
            System.out.println("NO MATCH");
        }
    }
}
