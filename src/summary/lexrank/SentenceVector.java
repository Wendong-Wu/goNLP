package summary.lexrank;

public class SentenceVector {
	private double[] vector;
	
	public SentenceVector(double [] list) {
		vector = list;
	}
	
	public double[] getVector() {
		return this.vector;
	}
}
