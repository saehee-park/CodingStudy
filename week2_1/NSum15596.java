package week2_1;

public class NSum15596 {
	
//	public static long sum(int[] a) {
//		long ans = 0;
//		
//		for(int i=0; i<a.length; i++) {
//			ans += a[i];
//		}
//		return ans;
//	}
	
	public static long sum(int[] a) {
		int ans = 0;
		
		for(int i=0; i<a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] a = {5,9,45,25,12,53,64,76};
		long total = sum(a);
		System.out.println("total:" + total);
	}

}
