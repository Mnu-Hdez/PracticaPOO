
import java.util.Scanner;
public class CLI
{
    private Scanner scanner;
 
    public CLI()
    {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String scan()
    {
        return this.scanner.nextLine();
    }

    
    
}