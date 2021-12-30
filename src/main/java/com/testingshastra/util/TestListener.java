package com.testingshastra.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.testingshastra.keywords.UIKeywords;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestListener implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		AShot as = new AShot();
		as.shootingStrategy(ShootingStrategies.viewportPasting(200));
		Screenshot sc = as.takeScreenshot(UIKeywords.getInstance().driver);
		BufferedImage img =sc.getImage();
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		try {
			ImageIO.write(img, "png", new File(dir+"/Screenshot/"+result.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
