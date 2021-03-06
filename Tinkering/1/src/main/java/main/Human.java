package main;

class Human{
	private boolean alive = true;
	private boolean hasSpirit = true;
	private String firstName = null;
	private String lastName = null;
	private int iq = 0;
	
	public Human(){
		super();
	}
	
	public Human(
			boolean isAlive, 
			boolean spirit, 
			String firstname, 
			String lastname, 
			int intelquotient
			){
		super();
		alive = isAlive;
		hasSpirit = spirit;
		firstName = firstname; 
		lastName = lastName;
		iq = intelquotient;
	}
	
	public boolean isAlive(){
		return this.alive;
	}
}
