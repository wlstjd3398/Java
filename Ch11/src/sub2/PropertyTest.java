package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/*
 *  날짜 : 2021/05/27
 *  이름 : 김철학
 *  내용 : 자바 프로퍼티 실습
 */
public class PropertyTest {
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\bigdata\\Desktop\\city.properties";
		
		Properties props = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path1);
			
			// 프로퍼티 객체에 데이터 저장
			props.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("101번 도시 : "+props.getProperty("101"));
		System.out.println("102번 도시 : "+props.getProperty("102"));
		System.out.println("103번 도시 : "+props.getProperty("103"));
	}
}
