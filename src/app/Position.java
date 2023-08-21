package app;

public class Position {
	private int row;
	private int column;
	
	public void SetValues(int row, int column) {
		this.row = row;
		this.column = column;
	}

	@Override
	public String toString() {
		return "Position [row=" + row + ", column=" + column + "]";
	};
	
}
