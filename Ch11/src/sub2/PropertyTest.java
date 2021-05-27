package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/*
 *  ��¥ : 2021/05/27
 *  �̸� : ��ö��
 *  ���� : �ڹ� ������Ƽ �ǽ�
 */
public class PropertyTest {
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdata\\Desktop\\city.properties";
		
		Properties props = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path1);
			
			// ������Ƽ ��ü�� ������ ����
			props.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("101�� ���� : "+props.getProperty("101"));
		System.out.println("102�� ���� : "+props.getProperty("102"));
		System.out.println("103�� ���� : "+props.getProperty("103"));
	}
}
