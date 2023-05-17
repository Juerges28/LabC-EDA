public class Test01{
	public void main(String[] args){
		int[] A = {1,2,3};
		int[] Ain = Inverse.invertirArray(A);
		
		for(int i=0;i<Ain.length;i++){
			System.out.println(Ain[i]+";");
		}
	}
}
