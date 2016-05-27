package manage.execution;

import java.util.ArrayList;

import manage.actions.ManageAction;
import config.ConfigurationAdmin;
import utility.ExcelUtils;

public class ManageDriverScript {
	String sPath = ConfigurationAdmin.data;
	ExcelUtils excelUtils = new ExcelUtils();
	String nameTest;
	int numberOfRows;
	ArrayList<String> list = new ArrayList<String>();
	
	public void manageTest(String nameTestSheet) throws Exception{
		nameTest = nameTestSheet;
		excelUtils.setExcelFile(sPath, nameTest);
		numberOfRows = excelUtils.getNumberOfRows();
		selectActions();
		ManageAction manageActions = new ManageAction();
		manageActions.manageActions(list, nameTest);
	}
	
	public void selectActions() throws Exception{
		for (int iRow=1;iRow<=numberOfRows;iRow++){
			String value = excelUtils.getCellData(iRow, 3);
			list.add(value);
		}
	}
	
	public String manageInputParameter(String nameTestSheet, String parameterName) throws Exception{
		String res = "";
		nameTest = nameTestSheet;
		excelUtils.setExcelFile(sPath, nameTest);
		numberOfRows = excelUtils.getNumberOfRows();
		for (int i=0;i<=numberOfRows;i++){
			if(parameterName.equals( excelUtils.getCellData(i, 3))){
				res = excelUtils.getCellData(i, 4);
			}
		}
		return res;
	}
	
}
