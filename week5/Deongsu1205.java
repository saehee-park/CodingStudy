package week5;

import java.util.Scanner;

public class Deongsu1205 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    
	        int N = Integer.parseInt(sc.next());
	        int X = Integer.parseInt(sc.next()); // 새로운점수
	        int P = Integer.parseInt(sc.next());
	        
	        int[] rankList = new int[P];
	        
	        for(int i=0; i<N; i++) {
	            rankList[i] = Integer.parseInt(sc.next());
	        }
	        
	        if(N == 0) { // 랭킹 리스트에 점수가 없었던 경우
	            System.out.println("1");
	            return;
	        }
	        
	        for(int i=0; i<N; i++) {
	            if (rankList[i] <= X) {
	                if(rankList[i] == X && N == P) {
	                    boolean flag = true;
	                   
	                    for(int temp = i+1; temp < N; temp++) {
	                        if(rankList[i] > rankList[temp]) { // 꽉찬 랭킹리스트에서 제일 낮은 점수인지를 확인
	                            flag = false;
	                            break;
	                        }
	                    }
	                    
	                    if(flag) {
	                        System.out.println("-1");
	                        return;
	                    }
	                    
	                }
	                System.out.println(i+1);  // 랭킹은 1등 부터이니 인덱스 + 1
	                return;
	            }
	            
	        }
	       
	        if(N < P) {  // 꽉찬 리스트가 아닌 기존 리스트에 (중간)진입하지 못한 경우 마지막 랭킹 점수됨
	            System.out.println(N+1);
	            return;
	        }
	        System.out.println("-1"); // 랭킹 진입에 실패한 경우
	        sc.close();
	    }
	}