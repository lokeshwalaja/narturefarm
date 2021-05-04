package TestUtility;



import java.util.ArrayList;

import ExcelUtil.Xls_Reader;



public class TestNGUtilityLogin
{

	//String MobileNumber="x";
	//public static String MobileNumber;
	//public static String Password1;
	/*public static String Phonenumber;
	public static String Password;*/
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
				
				for(int rownum=2; rownum<= reader.getRowCount("LoginSheet"); rownum++ ) {
	
					String MobileNumber=reader.getCellData("LoginSheet", "MobileNumber", rownum);
					String Password=reader.getCellData("LoginSheet", "Password", rownum);
					Object ob[]= {MobileNumber, Password};
					//myData.add(ob);
					myData.add(new Object[] {MobileNumber,Password});
					
					/*String Title=reader.getCellData("NewSearchSheet", "SearchTitle", rownum);
					String Location=reader.getCellData("NewSearchSheet", "EnterLocation", rownum);
					Object ob[]= {Title, Location};
					//myData.add(ob);
					myData.add(new Object[] {Title,Location});
					*/
				/*TestNGUtilityLogin.Phonenumber=MobileNumber;
				TestNGUtilityLogin.Password=Password1;*/
				//this.getDataFromExcel();
				//	}
				}
				
				return myData;
		
		
	}
	
}
