import console.CLI;
import controller.*;
public class App 
{
    private static CLI console ;
    private Player_Controller playerCont;
    private Matchmake_Controller matchmakeCont;
    private Generator generator;

    public static void main( String[] args )
    {
     App app = new App();
     app.StartApp();
    }

    public void StartApp()
    {
        console = new CLI();
        playerCont = new Player_Controller();
        generator = new Generator(playerCont,matchmakeCont);

        generator.populate();

        for(;;)
        {
            console.initialize();
            console.getCommand();
            console.printScreen("\n");
            String command = console.getCommand();
            String[] command_args = command.split(" ");
            String[] new_args;

            //check every operation has the right number of arguments
            switch (command_args[0].toLowerCase()) 
            {
            
            case "create":
                if(command_args.length != 2 )
                {
                    throw new RuntimeException("Create command must have 2 arguments <create> <Player Name>");
                }
                else if (!playerCont.createPlayer(command_args[1]))
                {
                    throw new RuntimeException("Cannot create Player (Already Exists)");
                }             
                break;

            case "remove":

                if(command_args.length != 2 )
                {
                    throw new RuntimeException("remove command must have 2 arguments <remove> <Player Name>");
                }
                if(!playerCont.deletePlayer(command_args[1]))
                {
                    throw new RuntimeException("cannot remove "+command_args[1] + " (Not in database)");
                }
                break;

            case "show":
                
                playerCont.showList();
                break;

            case "rank":

                if(playerCont.getPlayerList().isEmpty())
                {
                    throw new RuntimeException("Player List is Empty \n");

                }
                playerCont.rank();
                break;

            case "score":

                if(command_args.length != 3 )
                {
                    throw new RuntimeException("Create command must have 2 arguments <score> <Player Name> <score>");
                }
                new_args = command_args[1].split(";");
                playerCont.setPlayerScore(new_args[0],Integer.parseInt(new_args[1]));              
                break;

            case "show_matchmake":
                //implement showMatchmaking
                matchmakeCont.showMatchmaking();
                System.out.println();
                break;

            case "clear_matchmake":

                matchmakeCont.clear_matchmaking();
                System.out.println();
                break;

            case "matchmake":
                if(command_args.length != 2)
                {
                    throw new RuntimeException("matchmake command must have 2 arguments <matchmake> <Player1;Player2> ");
                }
                new_args = command_args[1].split(";");
                matchmakeCont.matchmake(playerCont.getPlayer(new_args[0]),playerCont.getPlayer(new_args[1]));
                break;

            case "random_matchmake":
                //fix 
                 
                // matchmakeCont.random_matchmake(/*Lista o estructura con los jugadores */);
                System.out.println();
                break;
                
            case "exit":
                return;
                
            default: 
                throw new RuntimeException("Invalid Command");
            }
        }
    }
}
