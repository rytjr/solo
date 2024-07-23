package distance2;

import java.util.*;
import java.io.*;

public class distane2 {
	public static void main(String[] args)throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int Num = Integer.parseInt(bf.readLine());
		
		int[][] arr = new int[Num][2];
		
		for(int i = 0; i < Num; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 0; j< 2; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		 Arrays.sort(arr, (e1,e2) ->

	        {

	        if (e1[1] == e2[1]) {

	        return e1[0] - e2[0];

	        }

	        else return e1[1] - e2[1];

	        });
		 
		 for(int i = 0; i < Num; i++) {
				System.out.println(arr[i][0] + " " + arr[i][1]);
			}
	}


}