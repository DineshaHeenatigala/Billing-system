package pdsacw;
import java.sql.*;

import javax.print.DocFlavor.STRING;
import javax.swing.*;
import java.text.SimpleDateFormat;  
import java.util.Date;


public class SqlConnection{
// JDBC driver name and database URL
public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
public static final String DB_URL = "jdbc:mysql://localhost/billingsystem";
// Database credentials
public static final String USER = "root";
public static final String PASS = "";
public String sql;
public Connection conn = null;
public Statement stmt = null;
public Statement stmt2 = null;
Integer[] pId = new Integer[10];
Integer[] qnt = new Integer[10];
int prdCount = -1;
int i = 0;
public int subT;
public int dis;
public int payable;
public int payment;
public int balance;
int prIce;
int prUnit;
int prQnt;
Homepage recHM;
public int TKID;

//Constructor 
public void dbConnect(){
    
    try {
        //STEP 2: Register JDBC driver
        Class.forName(JDBC_DRIVER);
        //STEP 3: Open a connection
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
    }
    catch(SQLException e){
//System.out.println("Sql connection failed !");
    }
    catch(Exception e){
//System.out.println("Error in JDBC is detected !");
    }
   /*  finally{
        try{
            if(stmt!=null)
            stmt.close();
            }catch(SQLException se2){
            }// nothing can be done
            try{
            if(conn!=null)
            conn.close();
            }catch(SQLException se){
            se.printStackTrace();
            }//end finally try
    }*/
    

}
/* 
public void recieveHMObject(Homepage hmobj){
recHM = hmobj;
}*/

//Function for setup sqlCommand
public void setSql(String sqlCommand){
    
    try{
        sql = sqlCommand;
        stmt =conn.createStatement();
        stmt.executeUpdate(sqlCommand);
        if(stmt!=null){stmt.close();}
            
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    
}


//Function to fetch data from database
public void fetchData(String Sqli){

try{
    //STEP 2: Register JDBC driver
    Class.forName(JDBC_DRIVER);
    //STEP 3: Open a connection
    conn = DriverManager.getConnection(DB_URL,USER,PASS);
    //STEP 4: Execute a query
stmt = conn.createStatement();
//stmt2 = conn.createStatement();
ResultSet rs = stmt.executeQuery(Sqli);
//ResultSet rs2;
//STEP 5: Extract data from result set
//int pc = 0;
while(rs.next()){
//Retrieve by column name
int tkID = rs.getInt("Token_Id");
int prID = rs.getInt("Product_Id");
int quantity = rs.getInt("Quantity");
TKID = tkID;
//recHM.data[pc][0] = String.valueOf(tkID);
//recHM.data[pc][1] = String.valueOf(prID);
//recHM.data[pc][2] = String.valueOf(quantity);

//pc = pc+1;
prdCount = prdCount+1;
pId[prdCount] = prID;
qnt[prdCount] = quantity;

}
//STEP 6: Clean-up environment


//create a new statement and results set
stmt2 = conn.createStatement();
ResultSet rs2;

while(i<prdCount+1){
    rs2 = stmt2.executeQuery("SELECT `Product_Id`, `Product_Name`, `Price`, `Product_Unit` FROM `product` WHERE `Product_Id` = '"+pId[i]+"' ");
    
    while(rs2.next()){
        prIce = rs2.getInt("Price");
        prUnit = rs2.getInt("Product_Unit");
        prQnt = qnt[i];
        subT += prIce * (prQnt/prUnit);
    }
    i = i+1;
}

}catch(Exception e){
    }finally{
        //
    }
}



public void printBill(int dis,int payment,String cName){

try{
    if(dis == 0){
        payable = subT;
    }else{
        payable = subT- Math.round(((subT/100)*dis));
    }
    balance = payment - payable;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    //System.out.println(formatter.format(date)); 

    String billDate = String.valueOf(date);
    sql = "INSERT INTO `bill`(`Token_Id`, `Sub_Total`, `Discount`, `Balance`, `Payable`, `Cashier_Name`, `Date`,`Payment`) VALUES ('"+TKID+"','"+subT+"','"+dis+"','"+balance+"','"+payable+"','"+cName+"','"+billDate+"','"+payment+"')";
setSql(sql);
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, "Couldn't calculate the bill, Please contact the developer !");
}finally{
    try{
        if(conn!=null){
            conn.close();
                }
                if(stmt!=null){
stmt.close();
                }
                if(stmt2!=null){
stmt2.close();
                }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Couldn't free-up the ram space !");
    }
    
}

    
}

public void cleanUp(){
    try{
        if(conn!=null)
        conn.close();
        }catch(SQLException se){
        se.printStackTrace();
        }
}

public static void main(String[] args){
    System.out.println("This works perfectly !");
}

}