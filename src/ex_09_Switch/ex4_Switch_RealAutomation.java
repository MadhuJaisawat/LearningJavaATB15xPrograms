package ex_09_Switch;

import java.util.Scanner;

public class ex4_Switch_RealAutomation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();
        switch (browser) {
            case "chrome" :
                System.out.println("Starting the chrome");
                System.out.println("Executing Test cases");
                break;
            case "edge" :
                System.out.println("starting the Edge");
                break;
            case "firefox" :
                System.out.println("starting the Firefox");
                break;
            default:
                System.out.println("please enter the valid browser");
        }
    }
}
