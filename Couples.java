package masi;

public class Couples {
	private String name;
	private String loverName;
	private int noOfLovers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoverName() {
		return loverName;
	}
	public void setloverName(String loverName) {
		this.loverName = loverName;
	}
	public int getNoOfLovers() {
		return noOfLovers;
	}
	public void setNoOfLovers(int noOfLovers) {
		this.noOfLovers = noOfLovers;
	}
	
	public Couples(String name, String loverName, int noOfLovers) {
		super();
		this.name = name;
		this.loverName = loverName;
		this.noOfLovers = noOfLovers;
	}
	@Override
	public String toString() {
		return "Couples [name=" + name + ", LoverName=" + loverName + ", noOfLovers=" + noOfLovers + "]";
	}
	
	

}
