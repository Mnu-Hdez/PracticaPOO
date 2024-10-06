package view;

public class CLI_View
{
    public CLI_View(){}

    public void printStart()
    {
        System.out.println("UPM_sports> ");
    }

    public void welcome()
    {
        System.out.println("Welcome to UPM Sports : \n");
        System.out.println("   __  ______  __  ___                         __      ");
        System.out.println("  / / / / __ \\/  |/  /  _________  ____  _____/ /______");
        System.out.println(" / / / / /_/ / /|_/ /  / ___/ __ \\/ __ \\/ ___/ __/ ___/");
        System.out.println("/ /_/ / ____/ /  / /  (__  ) /_/ / /_/ / /  / /_(__  ) ");
        System.out.println("\\____/_/   /_/  /_/  /____/ .___/\\____/_/   \\__/____/  ");
        System.out.println("                         /_/                           ");

        System.out.println();
    
    }

    public void commandsList()
    {
        System.out.println("> create [player]");
        System.out.println("> remove [player]");
        System.out.println("> show");
        System.out.println("> rank");
        System.out.println("> score [player];[score]");
        System.out.println("> show_matchmake");
        System.out.println("> clear_matchmake");
        System.out.println("> matchmake [player1];[player2]");
        System.out.println("> random_matchmake");
        System.out.println();
    }


}