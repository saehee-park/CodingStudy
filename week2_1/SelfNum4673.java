package week2_1;

public class SelfNum4673 {

	
	public static void main(String[] args) {
		int[] arr = new int[10036]; // 9999
		int temp, result;
		
		for(int i=1; i<=10000; i++) { // �θ�Ʈ ���� ������� ������ �����ѹ� ã��
			temp = i;
			result=i;
			
			while(temp>0) {
				result = result + temp%10;
				temp = temp/10;
			}
			arr[result]++;
		}
		
		for(int i=1; i<=10000; i++) { // �Ǵٽ� 10000�� �����ʴ� �����ѹ��� ���
			if(arr[i] == 0) {
				System.out.println(i);
			}
		}
	}

}
