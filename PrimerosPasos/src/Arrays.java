
public class Arrays {

	public static void main(String[] args) {
	/*int [] mi_matriz=new int[5];
		mi_matriz[0]=15;
		mi_matriz[1]=38;
		mi_matriz[2]=-18;
		mi_matriz[3]=3;
		mi_matriz[4]=159;*/
		
		int[] mi_matriz= {15, 38, -18, 3, 159, 57, 67, 42, 15, 74, 1245, 17, 23, 52, 45, 10, 17, 52, 8};
		
		System.out.println(mi_matriz[0]);
		System.out.println(mi_matriz[1]);
		System.out.println(mi_matriz[2]);
		System.out.println(mi_matriz[3]);
		System.out.println(mi_matriz[4]);
		
		for(int i=0; i<mi_matriz.length; i++) {
			System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
		}
	}

}
