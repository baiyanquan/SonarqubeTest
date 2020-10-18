import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Calendar cld = Calendar.getInstance();
        cld.set(Calendar.YEAR, 2017);
        cld.set(Calendar.MONTH,0);
        cld.set(Calendar.DATE,1);

        cld.add(Calendar.DATE, 100);

        System.out.println("增加100天的日期为："+cld.get(Calendar.YEAR)+"年"+cld.get(Calendar.MONTH)+"月"+cld.get(Calendar.DATE)+"日");
    }

}
