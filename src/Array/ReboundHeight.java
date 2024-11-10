package Array;

public class ReboundHeight {
	
public static int reboundHeights(int H, int V, int Vn) {
		int a=V/Vn;
		int h=H*a*a;
		return h;
	
	}

	public static void main(String[] args) {
		int H=10,V=20,Vn=5;
		System.out.println(reboundHeights(H,V,Vn));

	}
}
/*
 *p st int reboundheight(int H,int v,int vn){
 *int a=v/vn;
 *int h=H*a*a;
 *return h;
 */