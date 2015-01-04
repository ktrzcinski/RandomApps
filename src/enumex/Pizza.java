package enumex;

public enum Pizza {
	MARGHERITA(true, true, false, false), 
	CAPRICIOSA(true, true, true, false), 
	PROSCIUTTO(true, true, false, true);
	
	private boolean tomatoSauce;
	private boolean cheese;
	private boolean mushrooms;
	private boolean ham;
	
	public boolean getTomatoSauce() {
		return this.tomatoSauce;
	}
	
	public boolean getCheese() {
		return this.cheese;
	}
	
	public boolean getMushrooms() {
		return this.mushrooms;
	}
	
	public boolean getHam() {
		return this.ham;
	}
	
	Pizza(boolean ts, boolean ch, boolean m, boolean h) {
		this.tomatoSauce = ts;
		this.cheese = ch;
		this.mushrooms = m;
		this.ham = h;
	}
	
	@Override
	public String toString() {
		String result = super.toString() + "(";
		if (tomatoSauce) {
			result = result + "tomato sauce";
		}
		if (cheese) {
			result = result + ", cheese";
		}
		if (mushrooms) {
			result = result + ", mushrooms";
		}
		if (ham) {
			result = result + ", ham";
		}
		result = result + ")";
		return result;
	}
}
