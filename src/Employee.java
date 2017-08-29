
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setB(int n){

		System.out.println("Bonus up "+n+" to "+(bonusCalculator.computeBonus(n)));
	}
}
