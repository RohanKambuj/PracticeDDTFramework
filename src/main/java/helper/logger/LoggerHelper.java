package helper.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import utility.ResourceHelper;


@SuppressWarnings("rawtypes")
public class LoggerHelper {

	private static boolean root = false;

	public static Logger getLogger(Class clas){
		if (root) {
			return Logger.getLogger(clas);
		}
		//PropertyConfigurator.configure("/Users/bsingh5/git/excel-tutorial-with-dataDrivenFramework/log4j.properties");
		PropertyConfigurator.configure(ResourceHelper.getResourcePath("/src/main/resources/projectConfig/log4j.properties"));
		root = true;
		return Logger.getLogger(clas);
	}
}
