
public enum Status {
	OCZEKUJACY(0, "Oczekujacy"),
	REALIZOWANY(1, "Realizowany"),
	WYKONANY(2, "Wykonany");
	
	private final int id;
	private final String name;
	
	private Status(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
