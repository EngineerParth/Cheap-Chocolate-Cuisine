import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            //System.out.println("hello world");
			String data = br.readLine();
			String delim = " ";
			StringTokenizer dataSt=new StringTokenizer(data,delim);
	        int totalChocolates = Integer.parseInt(dataSt.nextToken());
	        int M = Integer.parseInt(dataSt.nextToken());
	        int wrappers = totalChocolates;
	        wrappers=wrappers-M;
	        while(wrappers>=0){
	        	totalChocolates+=1;//6
	        	wrappers+=1;//0
	        	wrappers = wrappers-M;//-1
	        }
	        System.out.println(totalChocolates);
    	}
    }
}
