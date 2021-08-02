package week5;

import java.util.Scanner;

public class Deongsu1205 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    
	        int N = Integer.parseInt(sc.next());
	        int X = Integer.parseInt(sc.next()); // ���ο�����
	        int P = Integer.parseInt(sc.next());
	        
	        int[] rankList = new int[P];
	        
	        for(int i=0; i<N; i++) {
	            rankList[i] = Integer.parseInt(sc.next());
	        }
	        
	        if(N == 0) { // ��ŷ ����Ʈ�� ������ ������ ���
	            System.out.println("1");
	            return;
	        }
	        
	        for(int i=0; i<N; i++) {
	            if (rankList[i] <= X) {
	                if(rankList[i] == X && N == P) {
	                    boolean flag = true;
	                   
	                    for(int temp = i+1; temp < N; temp++) {
	                        if(rankList[i] > rankList[temp]) { // ���� ��ŷ����Ʈ���� ���� ���� ���������� Ȯ��
	                            flag = false;
	                            break;
	                        }
	                    }
	                    
	                    if(flag) {
	                        System.out.println("-1");
	                        return;
	                    }
	                    
	                }
	                System.out.println(i+1);  // ��ŷ�� 1�� �����̴� �ε��� + 1
	                return;
	            }
	            
	        }
	       
	        if(N < P) {  // ���� ����Ʈ�� �ƴ� ���� ����Ʈ�� (�߰�)�������� ���� ��� ������ ��ŷ ������
	            System.out.println(N+1);
	            return;
	        }
	        System.out.println("-1"); // ��ŷ ���Կ� ������ ���
	        sc.close();
	    }
	}