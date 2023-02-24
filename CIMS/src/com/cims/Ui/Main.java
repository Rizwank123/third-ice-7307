package com.cims.Ui;

import java.sql.SQLException;
import java.util.Scanner;

import com.cims.Exceptions.NoCrimeRecord;
import com.cims.dao.Police_StationDao;
import com.cims.dao.Police_stationDaoImpl;

public class Main {
	public static void main(String[] args) throws SQLException, NoCrimeRecord {
		String banner = " ======================================================================================================================\n"
				+ "=  ====  ====  =========  ==========================================================     ===    ==  =====  ===      ==\n"
				+ "=  ====  ====  =========  =========================================================  ===  ===  ===   ===   ==  ====  =\n"
				+ "=  ====  ====  =========  =======================================  ===============  =========  ===  =   =  ==  ====  =\n"
				+ "=  ====  ====  ===   ===  ===   ====   ===  =  = ====   ========    ===   ========  =========  ===  == ==  ===  ======\n"
				+ "=   ==    ==  ===  =  ==  ==  =  ==     ==        ==  =  ========  ===     =======  =========  ===  =====  =====  ====\n"
				+ "==  ==    ==  ===     ==  ==  =====  =  ==  =  =  ==     ========  ===  =  =======  =========  ===  =====  =======  ==\n"
				+ "==  ==    ==  ===  =====  ==  =====  =  ==  =  =  ==  ===========  ===  =  =======  =========  ===  =====  ==  ====  =\n"
				+ "===    ==    ====  =  ==  ==  =  ==  =  ==  =  =  ==  =  ========  ===  =  ========  ===  ===  ===  =====  ==  ====  =\n"
				+ "====  ====  ======   ===  ===   ====   ===  =  =  ===   =========   ===   ==========     ===    ==  =====  ===      ==\n"
				+ "======================================================================================================================\n";
String[] colors = {"\033[0;31m", "\033[0;32m", "\033[0;33m", "\033[0;34m", "\033[0;35m", "\033[0;36m"};
String[] messages = {"Developed ", "By", "Mohammad ", "Rizwan!"};

StringBuilder sb = new StringBuilder();
for (String message : messages) {
    sb.append(colors[(int) (Math.random() * colors.length)]);
    sb.append(message);
    sb.append(" ");
}
sb.append("\033[0m");

System.out.println(banner);
System.out.println(sb.toString());
System.out.println();
		DashBoard dbs=new DashBoard();
		
		Scanner sc=new Scanner(System.in);
			int i=0;
			do {
				System.out.println("1. For login Already Register user");
				System.out.println("2. For New  User  Register ");
				System.out.println("0. For Exit ");
				i=sc.nextInt();
				switch(i) {
				case 1: Police_StationDao ps=new Police_stationDaoImpl();
						System.out.println("Please Enter the username: ");
						String uname=sc.next();
						System.out.println("Please Enter password: ");
						String pass=sc.next();
						
						
						if(uname.equalsIgnoreCase("admin"))
						{
							System.out.println(ps.AdminLogin(uname, pass));
							dbs.printAdminMenu(sc);
							
						}
						else {
							System.out.println(ps.psLogin(uname, pass));
							dbs.printUserMenu(sc);
						}
						break;
						
				case 2:
				}
				
				
			}while(i!=0);
			
			
			
					
	}

}
