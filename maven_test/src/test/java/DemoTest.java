import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;


import java.beans.Transient;

public class DemoTest {
    @Test//必须引入junit依赖架包
    public void test1(){
        System.out.println("Hello Test1");
    }
    @Test
    public void test2(){
        String original="hello world";
        String replaced= StringUtils.replace(original, "world", "java");
//        替换看源码
        System.out.println(replaced);
    }
    @Test
    public void test3(){
        int[] a1={1,2,3};
        int[] a2={3,4,5};
        int[] combine = ArrayUtils.addAll(a1,a2);
        System.out.println(ArrayUtils.toString(combine));
    }
}