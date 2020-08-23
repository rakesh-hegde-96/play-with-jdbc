import java.sql.*;


public class DbConnectionUsingJdbc {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "test");
		Statement statement = connection.createStatement();
		String insertQuery = "INSERT INTO Faculty VALUES (11, \"Priyanka PO\", 6900, \"Chemistry\");";
		String deleteQuery = "DELETE FROM Faculty WHERE Id=2";
		String updateQuery = "UPDATE Faculty SET Salary = 1900 WHERE Id=5";
		int result;
		P("Inserting ...");
		try {
			result = statement.executeUpdate(insertQuery);
			P("Number of rows affected = "+result);
		} catch (Exception e) {
			// TODO: handle exception
			P("Error in insert"+e.getMessage());
		}
		P("Deleting ...");
		result = statement.executeUpdate(deleteQuery);
		P("Number of rows affected = "+result);
		P("Updating...");
		result = statement.executeUpdate(updateQuery);
		P("Number of rows affected = "+result);
		connection.close();
	}
	
	static void P(String msg) {
		System.out.println(msg);
	}

}
