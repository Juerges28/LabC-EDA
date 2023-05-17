public class Inverse{
	public int[] invertirArray(int[] A){
		int[] Ain = new int[A.length];
		for(int i=0; i<A.length; i++){
			int n = A.length - 1;
			Ain[i] = A[n-i];
		}
		return Ain;
	}
}
