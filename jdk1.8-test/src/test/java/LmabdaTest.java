import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LmabdaTest {
    static List<Integer>list;
    static {
        list= Arrays.asList(5,8,2,5,3,4,55,2256,552);

    }

    /**
     * 集合遍历1
     */
    @Test
    public void test01(){
        list.forEach(a -> System.out.println(a));
    }

    /**
     * 集合遍历2
     */
    @Test
    public void test02(){
        list.forEach(System.out::println);
    }
    /**
     * 集合排序并遍历输出
     */
    @Test
    public void test03(){
        list.sort((a1,a2)->a1-a2);
        list.forEach(a -> System.out.print(a+","));
    }
    /**
     * Consumer函数式接口
     * 消费型接口，有参无返回值
     */
    public void compute1(Integer a ,Consumer<Integer> con){
        con.accept(a);
    }
    @Test
    public void test04(){
       compute1(5,a-> System.out.println(a*a));
    }
    public void compute2(Consumer<Integer[]> con ,Integer... a){
        con.accept(a);
    }

    /**
     * 可变参数，传入计算公式
     */
    @Test
    public void test05(){
       compute2(a-> {
           int sum=1;
           for(int i:a){
               sum*=i;
           }
           System.out.println(sum);
       },5,6,7);
       compute2(a->{
           int sum=0;
           for(int i:a){
               sum+=i;
           }
           System.out.println(sum);
       },7,2,6,5,58,2,5);
    }

}
