package TestUtility;

import java.util.ArrayList;

import ExcelUtil.Xls_Reader;



public class NewSearchUtility {
	
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
				
				for(int rownum=2; rownum<= reader.getRowCount("NewSearchSheet"); rownum++) {
	
					String Title=reader.getCellData("NewSearchSheet", "SearchTitle", rownum);
					String Location=reader.getCellData("NewSearchSheet", "EnterLocation", rownum);
					Object ob[]= {Title, Location};
					//myData.add(ob);
					myData.add(new Object[] {Title,Location});
					
				/*TestNGUtilityLogin.Phonenumber=MobileNumber;
				TestNGUtilityLogin.Password=Password1;*/
				//this.getDataFromExcel();
				//	}
				}
				
				return myData;
		
		
	}



}
