class Array1{
	public static void main(String[] args) {
		int [][][]a = new int[1][][];
		a[0]= new int[2][];
		a[0][0]=new int[1];
		a[0][1]=new int[1];
		a[0][0][0]=10;
		a[0][1][0]=20;
		System.out.println(a[0][0][0]);
		System.out.println(a[0][1][0]);

	}
}