package console;

import java.util.Scanner;

import view.CLI_View;

public class CLI
{
    private Scanner scanner;
    private CLI_View cli_View;
 
    public CLI()
    {
        this.cli_View = new CLI_View();
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner()
    {
        return scanner;
    }

    public void setScanner(Scanner scanner)
    {
        this.scanner = scanner;
    }

    public void initialize()
    {
        cli_View.welcome();
        cli_View.commandsList(); 
    }

    public String getCommand()
    {
        cli_View.printStart();
        return this.scanner.nextLine();
    }

    public void printScreen(String message)
    {
        System.out.println(message);
    }

    
  
    
}
