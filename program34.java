import java.util.*;
public class program34 {
		public static void main(String[] args) {
		String s="Mahendra Singh dhoni";
		String arr[]=s.split(" ");
		System.out.println(Arrays.toString(arr));
		for(String word:arr){
			System.out.print((word.charAt(0)+" ").toUpperCase());
		}
	}

}
