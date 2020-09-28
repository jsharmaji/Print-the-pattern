package gfg;

public class pattern {
	public static void print_the_pat(int n) {
		int t=n;
        for(int a=1;a<=n;++a,--t){
            for(int b=n;b<=n*b&&b>0;--b){
                
                for(int c= 1;c<=t;c++){
                    System.out.print(b+" ");
                }
            }
            System.out.print("$");
        }
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		print_the_pat(n);

	}

}
