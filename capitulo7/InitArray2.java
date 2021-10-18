package capitulo7;

public class InitArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 3) {
			System.out.printf(
					"Error: Please re-enter the entire comand, including%n"+
					"an array size, initial value and increment.%n");
		}
		else {
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			
			for(int counter = 0; counter < array.length; counter++)
				array[counter] = initialValue + increment * counter;
			
			System.out.printf("%s%8s%n", "Index", "Value");
			
			for(int counter = 0; counter < array.length; counter++)
				System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

}
