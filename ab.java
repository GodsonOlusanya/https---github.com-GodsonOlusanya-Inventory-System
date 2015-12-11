import java.sql.*;

public class ab {

	Connection con;
	Statement st;
	ResultSet rs;
        PreparedStatement pst = null;


	public ab () {
		connect();

	}
	public void connect(){

	try{
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		Class.forName(driver);

		String dbase ="jdbc:odbc:db1";
		con =DriverManager.getConnection(dbase);
		st = con.createStatement();
		String sql ="select * from Table1";
		rs = st.executeQuery(sql);
		//displays everything in the database

		while (rs.isAfterLast()){
			String fname = rs.getString("Fname");
			String lname = rs.getString("Lname");
			String book = rs.getString("Book");
			System.out.println(fname + " " + lname+ " " + book);


		}


	} catch(Exception ex){

	}

	}

	public static void main (String[] agrs){
		new ab();
                new gui();

	}
}
