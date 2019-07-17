class ShowBits {
	int numbits;

	ShowBits(int n){
		numbits = n;
	}

	void show(long val){
		long mask = 1;
		
		//left shift a 1 into the proper position 
		mask <<= numbits - 1;


		int spacer = 0;
		for(; mask!=0; mask >>>=1) {
			if((val & mask) !=0 ) System.out.print("1");
			else System.out.print("0");
			spacer++;


		if((spacer % 8) == 0) {
			System.out.print(" ");
			spacer = 0;
		}
	}
	System.out.println();
}	
}

class ShowBitsDemo {
	public static void main(String args[]) {
		ShowBits b = new ShowBits(8);
		ShowBits i = new ShowBits(32);
		ShowBits li = new ShowBits(64);
		ShowBits c = new ShowBits(256);
	b.show(23);
	i.show(78765);
	li.show(23676734);
	c.show(38282828);
}
}
