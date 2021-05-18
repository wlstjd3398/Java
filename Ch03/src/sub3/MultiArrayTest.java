package sub3;
/*
 * ��¥ : 2021/05/18
 * �̸� : ��ö��
 * ���� : �ڹ� �迭 �ǽ��ϱ�
 */
public class MultiArrayTest {
	public static void main(String[] args) {
		
		//1���� �迭
		int[] scores = {80, 60, 78, 62, 92};
		int sum = 0;
		
		for(int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		System.out.println("�迭 score�� �� : "+sum);
		
		
		int[] grades = {80, 60, 78, 62, 92};
		int esum = 0;
		
		for(int grade : grades) {
			sum += grade;
		}
		System.out.println("�迭 grade�� �� : "+esum);
		
		
		//2���� �迭 = �迭 -> ����� ������ 0,1�� 2 / 1,0�� 5
		int[][] arr2d = {{1, 2, 3, 4}, 
						{5, 6, 7, 8}, 
						{9, 10, 11, 12}};
		
		for(int a=0 ; a<3 ; a++) {
			for(int b=0 ; b<4 ; b++) {
				System.out.println("�迭 arr2d["+a+"]["+b+"] : "+arr2d[a][b]);
			}
		}
		
		
		//3���� �迭 = 3��������(������ü)
		int[][][] arr3d= {{{1, 2, 3},
							{4, 5, 6}, 
							{7, 8, 9}},
						{{10, 11, 12}, 
						{13, 14, 15}, 
						{16, 17, 18}},
						{{19, 20, 21}, 
						{22, 23, 24}, 
						{25, 26, 27}}}; 
		
		System.out.println("3���� �迭 arr3d[][][] : "+arr3d[0][1][1]);
		System.out.println("3���� �迭 arr3d[][][] : "+arr3d[1][1][0]);
		System.out.println("3���� �迭 arr3d[][][] : "+arr3d[2][0][2]);
		
		
	}
}
