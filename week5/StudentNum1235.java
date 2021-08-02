package week5;
/*
 * 주어진 학생들의 학생 번호를 뒤부터 k자리만큼 잘랐을때
 * 구분이 가능한지 확인해 작은 k값 구하기*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class StudentNum1235 {

	 public static void main(String[] args) throws Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        int N = Integer.parseInt(br.readLine());
	        String[] student = new String[N];
	        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
	       
	        int len = 0;
	        for(int i = 0; i < N; i++){
	            student[i] = br.readLine();
	            if(i == 0) len = student[i].length();
	        }
	        
	        int k = 0;
	        base:
	        for(int i = 0; i <= len; i++){
	            for(int j = 0; j < N; j++){
	                String sub = student[j].substring(len - i);
	                if(map.containsKey(sub)){
	                    map.clear();
	                    continue base;
	                } else {
	                    map.put(sub, true);
	                }
	            }
	            k = i;
	            break;
	        }
	        bw.write(k + "\n");

	        bw.flush();
	        br.close();
	        bw.close();
	    }
	}