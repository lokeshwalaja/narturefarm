package TestUtility;

import java.util.ArrayList;

import ExcelUtil.Xls_Reader;



public class NewPostUtil 
{
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
				
				for(int rownum=2; rownum<= reader.getRowCount("NewPostSheet"); rownum++) {
	
					String Title=reader.getCellData("NewPostSheet", "PostTitle", rownum);
					
					String Description=reader.getCellData("NewPostSheet", "PostDescription", rownum);
					
					String budget=reader.getCellData("NewPostSheet", "Budget", rownum);
					String location=reader.getCellData("NewPostSheet", "EnterLocation", rownum);
					Object ob[]= {Title,Description,budget,location};
					//myData.add(ob);
					myData.add(new Object[] {Title,Description,budget,location});
					
				/*TestNGUtilityLogin.Phonenumber=MobileNumber;
				TestNGUtilityLogin.Password=Password1;*/
				//this.getDataFromExcel();
				//	}
				}
				
				return myData;
		
		
	}
}
