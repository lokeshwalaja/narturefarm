package TestUtility;

import java.util.ArrayList;

import ExcelUtil.Xls_Reader;

public class LoginAndSearchUtil {
	
	static Xls_Reader reader;
public static ArrayList<Object[]> getDataFromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		  
		try {
		//Get the Excel data
			reader=new Xls_Reader("C:\\Users\\CHALAMA\\Desktop\\Handzap.xlsx");
		}
		//C:\\Users\\CHALAMA\\eclipse-workspace\\Com.HandzapDataDriven\\src\\main\\java\\com\\Handzap\\TestData\\Handzap.xlsx
		catch(Exception e) {
			e.printStackTrace();
		}
				//parameterization
				
				for(int rownum=2; rownum<= reader.getRowCount("UserDataSheet"); rownum++) {
	
					String MobileNumber=reader.getCellData("UserDataSheet", "MobileNumber", rownum);
					String Password=reader.getCellData("UserDataSheet", "Password", rownum);
					String Title=reader.getCellData("UserDataSheet", "SearchTitle", rownum);
					String Location=reader.getCellData("UserDataSheet", "EnterLocation", rownum);
					Object ob[]= {MobileNumber, Password, Title, Location};
					//myData.add(ob);
					myData.add(new Object[] {MobileNumber, Password, Title,Location});
					
				}
				
				return myData;
		
		
	}



}
