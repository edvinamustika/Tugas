class HitungLuas2{
	public static int luasPersegiPanjang(int p, int l){
		return p*l;
	}
	public static double luasSegitiga(double a, double t){
		return 0.5 * a * t;
	}
	public static double luasLingkaran(int r){
		return 22/7*r*r;
	}
	public static void main(String args){
		luasPersegiPanjang(2,3);
		luasPersegiLingkaran(7,7);
	}
}