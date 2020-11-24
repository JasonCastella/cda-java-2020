package bieres;

public class Beer {

	private String name;
	private String type;
	private Double degree;

	/**
	 * Beer Constructor
	 * 
	 * @param name
	 * @param type
	 * @param degree
	 */
	public Beer(String name, String type, Double degree) {
		setName(name);
		setType(type);
		setDegree(degree);
	}

	/**
	 * Allows to create a row 
	 * @return row
	 */
	public Object[] toRow() {
		Object[] row = { getName(), getType(), getDegree() };
		return row;
	}

	// Getter and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getDegree() {
		return degree;
	}

	public void setDegree(Double degree) {
		this.degree = degree;
	}

}
