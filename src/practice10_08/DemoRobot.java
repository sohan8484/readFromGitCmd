package practice10_08;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class DemoRobot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException, AWTException {
		Runtime.getRuntime().exec("notepad");//open command prompt and run notepad
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_CONTROL+KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_ALT+KeyEvent.VK_F4);
	}
}
