package InClassOct;

public class Sequence {
	private int start;
	private int end;
	private char ch;
	private int length;
	
	public Sequence(int start, int end, char ch, int length) {
		this.start = start;
		this.end = end;
		this.ch = ch;
		this.length = length;
	
		
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	
	
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
	
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}

	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	
}


