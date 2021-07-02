import java.util.UUID;

public class testId {
 
    public static void main(String[] args) {
        String[] id=new String[10002];
        for (int i = 0; i < 10000; i++) {
            //截取最后一部分
            id[i]=UUID.randomUUID().toString().substring(24);
        }
      
        System.out.println("第一个:"+id[0]);
        System.out.println("第二个：" + id[1]);
    }

}