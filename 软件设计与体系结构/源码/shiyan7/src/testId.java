import java.util.UUID;

public class testId {
 
    public static void main(String[] args) {
        String[] id=new String[10002];
        for (int i = 0; i < 10000; i++) {
            //��ȡ���һ����
            id[i]=UUID.randomUUID().toString().substring(24);
        }
      
        System.out.println("��һ��:"+id[0]);
        System.out.println("�ڶ�����" + id[1]);
    }

}