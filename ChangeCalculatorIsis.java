import javax.swing.JOptionPane;

public class ChangeCalculatorIsis {
	public static void main(String[] args) {
		String numQuartersString = JOptionPane.showInputDialog(null, " How many quarters do you have?");
		int numQuarters = Integer.parseInt(numQuartersString);
		String numDimesString = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		int numDimes = Integer.parseInt(numDimesString);
		String numNickelsString = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		int numNickels = Integer.parseInt(numNickelsString);
		String numPenniesString = JOptionPane.showInputDialog(null, "How many pennies do you have?");
		int numPennies = Integer.parseInt(numPenniesString);
		int quarters = 25;
		int dimes = 10;
		int nickels = 5;
		int pennies = 1;
		int totalQuarterAmount = numQuarters * quarters;
		int totalDimeAmount = numDimes * dimes;
		int totalNickelAmount = numNickels * nickels;
		int totalPenniesAmount = numPennies * pennies;
		int totalSavings = totalQuarterAmount + totalDimeAmount + totalNickelAmount + totalPenniesAmount;
		int totalSavingsDollars = totalSavings/100;
		int totalSavingsCents = totalSavings/10 + totalNickelAmount;
		JOptionPane.showMessageDialog(null, "You have " + totalSavingsDollars + " dollar(s) and " + totalSavingsCents + " cents!"  );
		//JOptionPane.showMessageDialog(null, "You have " + totalSavings + " cents!");
		
	}

}
