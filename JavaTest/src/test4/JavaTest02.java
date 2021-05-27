package test4;
/*
 * 날짜 : 2021/05/20
 * 이름 : 김철학
 * 내용 : 자바 배열에서 최댓값 찾기
 */
public class JavaTest02 {

	public static void main(String[] args) {
		int arr[] = {17, 92, 18, 33, 58, 7 ,26, 42};
		int maxNum = arr[0];
		
		for(int i = 0; i<8; i++){
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
		}
		System.out.println("배열 arr에서 가장 큰 수 : "+maxNum);
	}
	
}
