/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fido.database; 
import fido.config.dbConfig;

import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.driver.OracleConnection;
import oracle.jdbc.driver.OracleDriver;
import java.util.Locale;
public class dbConnect {
    
    dbConfig database=new dbConfig();
    private String dburl=database.db_url;
    private String dbname=database.db_name;
    private String dbpassword=database.db_password;
    private OracleConnection connection=null;
  
   
    
    public dbConnect (){ 
            initConnection();
    }
        
    public OracleConnection initConnection() {
		this.connection = null;
		if (this.dburl == null) {
			return null;
		}
		try {
			DriverManager.registerDriver(new OracleDriver());
			this.connection = ((OracleConnection) DriverManager.getConnection(
					this.dburl, this.dbname, this.dbpassword));
		} catch (Exception localException) {
		}
		return this.connection;
	}

    
    
    
    
    
}
