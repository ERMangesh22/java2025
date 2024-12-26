package BestBuy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import net.sourceforge.lept4j.util.LoadLibs;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ScreenshotUtils {

	//public static void takeScreenshot(WebDriver driver, String fileName) throws TesseractException {
        // Take screenshot and store it as a file format
      /*  File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destFile = new File("screenshots/" + fileName + ".png");

        try {
            // Copy the screenshot to the destination file
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
		public static void main(String[] args) throws TesseractException {
			
		
//		File inputFile = new File("C:\\Users\\Mangesh Gorde\\Desktop\\Tessarr\\BestBuy.png");
//		ITesseract itessaract = new Tesseract();
//		File tessDataFolder = LoadLibs.extractNativeResources("Tessarr");
//		itessaract.setDatapath(tessDataFolder.getPath());
//		
//		String res = itessaract.doOCR(inputFile);
//		System.out.println(res);
			
			ITesseract itessaract = new Tesseract();
			String str = itessaract.doOCR(new File("C:\\Users\\Mangesh Gorde\\Desktop\\Tessarr\\BestBuy.png"));
			
			System.out.println(str);
			
		
    }
}
