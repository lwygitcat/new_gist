/*
 * How to write a enum quickly
 * 相当与创建instance
 *  Howto
 *  1. 怎么传入参数创建instance, 需要有相应的constructor
 *  2. 怎么在method里面选择是那种enum
 */

public enum Fruits {
	APPLE("apple"), 
		ORANGE("orange"), 
		PEAR("pear"),
		BANANA("banana");

	private String name;

	public Fruits (String name){  // constructor
		this.name = name;
	}


	//use some logic
	public String getName() {
		switch(this) {
			case APPLE: 
				return "apple";
			case ORANGE:
				return "orange";
			case PEAR:
				return "pear";
			case BANANA:
				return "banana";
		}
	}



	//enumarate all the value
	public void print() {
		for (Fruits f : Fruits.values()) {
			System.out.println(f);
		}
	}


}


