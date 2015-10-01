package elon.edu.adapter;

public class Compound implements ChemicalCompound{
	private String name;
	private ChemicalDataBank bank;
	
	public Compound(String string) {
		name = string;
		bank = new ChemicalDataBank();
	}

	@Override
	public String display() {
		String display = "Compound: " + name + "------ \n "
				+"Formula: " + getMolecularFormula() + "\n"
				+"Weight: " + getMolecularWeight() + "\n"
				+"Melting Pt: " + getMeltingPoint() + "\n"
				+"Boiling Point: " + getBoilingPoint();
		return display;
	}

	@Override
	public double getBoilingPoint() {
		return bank.getCriticalPoint(name, "B");
	}

	@Override
	public double getMeltingPoint() {
		return bank.getCriticalPoint(name, "M");
	}

	@Override
	public String getMolecularFormula() {
		return bank.getMolecularStructure(name);
		
	}

	@Override
	public double getMolecularWeight() {
		return bank.getMolecularWeight(name);
	}

}
