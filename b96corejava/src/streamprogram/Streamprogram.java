package streamprogram;
import java.util.Arrays;
import java.util.stream.Stream;

public class Streamprogram{
	public static void main(String[] args) {
		Stream<Integer> ob= Stream.of (10,20,30,40,50);
		Integer [] values= new Integer[] {2,3,5,8};
		
		ob=Arrays.stream(values);
		ob.forEach (System.out::println);

}
	}

