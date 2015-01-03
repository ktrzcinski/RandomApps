package equalstostring;

public class Computer {
	private String producer;
	private int model;

	public String getProdcuer() {
		return this.producer;
	}

	public void setProdcuer(String producer) {
		this.producer = producer;
	}

	public int getModel() {
		return this.model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	
	public Computer(String producer, int model) {
		this.producer = producer;
		this.model = model;
	}

	@Override
	public String toString() {
		return producer + " " + model;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Computer)) {
			return false;
		}

		Computer c = (Computer) obj;

		if (producer != null) {
			if (this.producer.equals(c.getProdcuer())
					&& this.model == c.getModel()) {
				return true;
			}
		}
		return false;
	}
}
