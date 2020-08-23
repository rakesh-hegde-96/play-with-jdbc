import java.sql.*;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rakesh hegde
 *
 */
public class StudentAdmission {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String databaseName = "college";
		String connectionString = "jdbc:mysql://localhost:3306/" + databaseName;
		Connection connection = DriverManager.getConnection(connectionString, "root", "test");
		Statement statement = connection.createStatement();
//		P("**Enter Admission Details");
//		P("Name : ");
//		String name = sc.nextLine();
//		P("Score(CGPA/%) *Write only decimals");
//		double score = sc.nextDouble();
//		P("Gender(M/F)");
//		String gender = sc.nextLine();
//		P("Previous School");
//		String prevSchool = sc.nextLine();
//		P("Board : ");
//		String board = sc.nextLine();
//		P("Combination 1-PCMS\n2-PCMCs\n3-PCMB\n4-BASE\n5-BAECs");
//		int combination = sc.nextInt();
//		String command = "INSERT INTO admission (StdentName, Score, Gender, PreviousSchool, Board, combinationId) VALUES"
//				+ String.format("('%s', %.2f, '%s', '%s', '%s', %d)", name, score, gender, prevSchool, board, combination);
//		P("Command "+ command);
		try {
			statement.executeUpdate("INSERT INTO admission (StdentName, Score, Gender, PreviousSchool, Board, combinationId) VALUES('Kothyappa', 77.98, 'M', 'AVKF', 'State', 3)");
			P("Data saved successfully");
		} catch (Exception e) {
			// TODO: handle exception
			P("Error in saving data"+e.getMessage());
		}
		connection.close();
	}
	
	static void P(String message) {
		System.out.println(message);
	}

}
