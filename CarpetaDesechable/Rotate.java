public class Rotate{
	public static void main(String[] args){
		int[] A = {1,2,3,4,5};
		int[] Aiz = rotarIzquierdaArray(A,2);
		for (int i = 0;i<Aiz.length;i++){
			System.out.print(Aiz[i]+"; ");
		}
	}
	public static int[] rotarIzquierdaArray(int[] A, int d){
		int[] Aiz = new int[A.length];
		for(int i = 1; i <= d; i++){
			for(int j = 1;j < A.length; j++){
				int key = A[0];
				Aiz[j-1] = A[j];
				if(j == (A.length - 1)){
					Aiz[A.length-1] = key;
				}
			}
		}
		return Aiz;
	}
}
