import org.junit.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    /**
     * 获取当前时间
     * 增减时间
     */
    @Test
    public void test01(){
        //2020-10-26T15:38:19.333
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        //2025-10-26T15:38:19.333
        LocalDateTime localDateTime2=localDateTime.plusYears(5);
        System.out.println(localDateTime2);
    }

    /**
     * 获取时间戳
     */
    @Test
    public void test02(){
        // 时间戳  1970年1月1日00：00：00 到某一个时间点的毫秒值
        // 默认获取UTC时区
        //1603698218544
        //1603698218544
        //1603698218544
        //1603698218544
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli());
        System.out.println(System.currentTimeMillis());
        System.out.println(Instant.now().toEpochMilli());
        System.out.println(Instant.now().atOffset(ZoneOffset.ofHours(8)).toInstant().toEpochMilli());
    }

    /**
     * 时间格式化
     */
    @Test
    public void test03(){
        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
