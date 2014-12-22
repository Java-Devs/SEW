package goebel;

import java.sql.*;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * Verbindet sich zu einer RDBMS via JDBC, sendet ein SQL-Befehl.
 * @author Melanie Goebel
 * @version 2014-12-15
 */
public class Connection {
	private int anz = 0; // counts of rows of the results

	/**
	 * Verbindet sich zur DB und sendet einen SQL-Befehl
	 * @param hostname der hostname der RDBMS
	 * @param user der username
	 * @param password das passwort für den user
	 * @param database die verwendete DB
	 * @param command der SQL-Befehl 
	 * @param delimeter Zeichen um die Eintraege zu trennen
	 */
	public String sendSelectCommand (String hostname,String user,String password,String database, String command, String delimeter){
		MysqlDataSource ds = new MysqlDataSource();
		ds.setServerName(hostname);
		ds.setUser(user);
		ds.setPassword(password);
		ds.setDatabaseName(database);
		try {
			java.sql.Connection con = ds.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(command);
			ResultSetMetaData restit = rs.getMetaData(); // fuer die Zeilenanzahl
			this.anz = restit.getColumnCount(); // wv Zeilen es beinhaltet

			String result = "";
			while(rs.next()){
				for(int i = 1; i <= anz;i++){
					result += rs.getString(i)+delimeter; // rs.getString beginnt immer bei 1
				}
				result += "\n";
			}
			rs.close(); st.close(); con.close(); // alles schliessen, damit es beim 2ten Aufruf nochmal geoffnet werden kann
			return result;

		} catch (SQLException e) {
			System.err.println("SQL Fehler aufgetreten");
		}
		return null;
	}

}

