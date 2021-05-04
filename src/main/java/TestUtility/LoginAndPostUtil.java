package TestUtility;

import java.util.ArrayList;

import ExcelUtil.Xls_Reader;

public class LoginAndPostUtil {
	
	static Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel() {
			
			ArrayList<Object[]> myData = new ArrayList<Object[]>();
			  
			try {
			//Get the Excel data
				reader=new Xls_Reader("C:\\Users\\CHALAMA\\eclipse-workspace\\Com.HandzapDataDriven\\src\\main\\java\\com\\Handzap\\TestData\\HandzapLoginData.xlsx");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
					//parameterization
					
					for(int rownum=9; rownum<= reader.getRowCount("LoginPostSheet"); rownum++) {
		
						String MobileNumber=reader.getCellData("LoginPostSheet", "EnterMobileNumber", rownum);
						String Password=reader.getCellData("LoginPostSheet", "EnterPassword", rownum);
						String Title=reader.getCellData("LoginPostSheet", "PostTitle", rownum);
						String Description=reader.getCellData("LoginPostSheet", "PostDescription", rownum);
						String Budget=reader.getCellData("LoginPostSheet", "Budget", rownum);
						String Location=reader.getCellData("LoginPostSheet", "EnterLocation", rownum);
						Object ob[]= {MobileNumber, Password, Title,Description,Budget,Location};
						//myData.add(ob);Budget
						myData.add(new Object[] {MobileNumber, Password, Title,Description,Budget,Location});
						
					}
					
					return myData;
			
	
	
	

}
}
