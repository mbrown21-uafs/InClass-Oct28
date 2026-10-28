package InClassOct;

public class Eval {

	public static void main(String[] args) {
		String str = "xxxxxxxx";
		char[] array = str.toCharArray();
		Sequence[] sequences;
			
		sequences=sequences(array);
		show(sequences);
	}
		
	public static void show(Sequence[] sequences) {
		int index;
		
		for(index = 0; index < sequences.length; index++) {
			System.out.println("Start: " + sequences[index].getStart() 
					+ ", End: " + sequences[index].getEnd()
					+ ", Character: " + sequences[index].getCh()
					+ ", Length: " + sequences[index].getLength());
		}
	}
		
	public static Sequence[] sequences(char[] array) {
	   
		Sequence[] result = new Sequence[array.length];
	    int sequenceCount = 0;
	    int start = 0;
	    int index = 0;

	    while (start < array.length) {
	        int end = start;

	        while (end < array.length && array[end] == array[start] && end - start < 5) {
	            end++;
	        }

	        int length = end - start;
	        int last = end - 1;

	        result[sequenceCount] = new Sequence(start, last, array[start], length);
	        sequenceCount++;
	        start = end;
	    }

	    Sequence[] newArray = new Sequence[sequenceCount];

	    for (index = 0; index < sequenceCount; index++) {
	        newArray[index] = result[index];
	    }

	    return newArray;
	}
}