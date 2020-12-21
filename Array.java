class Array{
	public static void main(String[] args) {
		int [][][]b = new int[2][][];
		
		b[0]=new int[2][];
		b[1]=new int[1][];
		b[0][0]=new int[1];
		b[0][1]=new int[1];
		b[1][0]=new int[5];
		b[0][0][0]=5;
		b[0][1][0]=10;
		b[1][0][0]=20;
		b[1][0][1]=30;
		b[1][0][2]=40;
		b[1][0][3]=50;
		b[1][0][4]=60;
		System.out.println(b[0][0][0]);
		System.out.println(b[0][1][0]);
		System.out.println(b[1][0][0]);
		System.out.println(b[1][0][1]);
		System.out.println(b[1][0][2]);
		System.out.println(b[1][0][3]);
		System.out.println(b[1][0][4]);
	}
}