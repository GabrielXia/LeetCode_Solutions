package Solution;

public class Solution {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
        int Indice_nums1 = 0;
        for(int i = 0; i < n; i++){
        	while( nums2[i] >= nums1[Indice_nums1+i] && Indice_nums1 <m ) {
        		Indice_nums1++;
        	}
        	if(Indice_nums1 >= m){
        		nums1[Indice_nums1+i] = nums2[i];
        	}
        	else{
        	    for(int j = m + i; j > Indice_nums1 +i; j--) nums1[j] = nums1[j-1]; 
        	    nums1[Indice_nums1+i] = nums2[i];
        	}
        }
    }
}
