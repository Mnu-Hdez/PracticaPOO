import java.util.ArrayList;


import console.CLI;
import controller.*;
import model.Admin;
import model.Player;
import model.User;
public class App
{
    private static CLI console ;
    private Player_Controller playerCont;
    private Matchmake_Controller matchmakeCont;
    private Admin_Controller adminCont;
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
        adminCont = new Admin_Controller();
        generator = new Generator(playerCont,matchmakeCont);
        User login = null;

        generator.populate();

        for(;;)
        {
            console.initialize();
            console.getCommand();
            console.printScreen("\n");
            String command = console.getCommand();
            String[] command_args = command.split(";");
            String[] new_args;
    
            //check every operation has the right number of arguments
            switch (command_args[0].toLowerCase())
            {
            case "login":
                if(login != null)
                {
                    throw new RuntimeException("User already logged in");
                }

                if(command_args.length!=2)
                {
                    throw new IllegalArgumentException("Login command must have 2 arguments <login> <mail;password>");
                }

                login = playerCont.login(command_args[1],command_args[2]);

                if(login == null)
                {
                    login = adminCont.login(command_args[1],command_args[2]);
                }

                if(login == null)
                {
                    throw new RuntimeException("Invalid login credentials");
                }
                break;
                
            case "logout":
                if(login == null)
                {
                    throw new RuntimeException("User not logged in");
                }
                    login = null;
                break;

            case "player-create":
                if(command_args.length != 6)
                {
                    throw new IllegalArgumentException("Create command must have 2 arguments <create> <Player Name>");
                }
                if(login == null || !(login instanceof Admin))
                {
                    throw new RuntimeException("Only Admins can create players");
                }
                if (playerCont.getPlayer(command_args[1]) != null)//to fix
                {
                    throw new RuntimeException("Cannot create Player (Already Exists)");
                }
                 
                    playerCont.createPlayer(command_args[1],command_args[2],command_args[3],command_args[4],(Admin)login);
                             
                break;

            case "player-delete":
                if(command_args.length != 2 )
                {
                    throw new IllegalArgumentException("remove command must have 2 arguments <remove> <Player Name>");
                }
                if(!playerCont.deletePlayer(command_args[1]))
                {
                    throw new RuntimeException("cannot remove "+command_args[1] + " (Not in database)");
                }
                break;

            case "team-create":
                break;

            case "team-delete":
                break;
            case "team-add":
                break;
            case "team-remove":
                break;

            case "tournament-create":
            break;

            case "tournament-delete":
            break; 

            case "tournament-matchmaking":
            break;

            case "tournament-add":
            break;

            case "tournament-remove":
            break;

            case "statistics-show":
                if(command_args.length != 1)
                {
                    throw new IllegalArgumentException("Statistics command must have 1 arguments <statistics>");
                }
                if(login == null || !(login instanceof Player))
                {
                    throw new RuntimeException("User not logged in || User is not a player");
                }
                playerCont.showStatistics((Player)login);
                break;

            case "show-players":
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
                    throw new IllegalArgumentException("Create command must have 2 arguments <score> <Player Name> <score>");
                }
                new_args = command_args[1].split(";");
                playerCont.setPlayerScore(new_args[0],Integer.parseInt(new_args[1]));              
                break;

            case "show_matchmake":
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
                    throw new IllegalArgumentException("matchmake command must have 2 arguments <matchmake> <Player1;Player2> ");
                }
                new_args = command_args[1].split(";");
                matchmakeCont.matchmake(playerCont.getPlayer(new_args[0]),playerCont.getPlayer(new_args[1]));
                break;

            case "random_matchmake":
                if(command_args.length != 1)
                {
                    throw new IllegalArgumentException("random_matchmake command must have 1 arguments <random_matchmake> ");
                }
                //check
                ArrayList<Player> playerList = new ArrayList<>(playerCont.getPlayerList());
                matchmakeCont.random_matchmake(playerList);
                System.out.println();
                break;
                
            case "exit":
                return;
                
            default: 
                throw new RuntimeException("Invalid Command");
            }
        }
    }

    //es valido esto???
    /* 
    public User login(String mail,String password,Collection<Player> userList)
    {
        for(User user:userList)
        {
            if(user.getMail().equals(mail) && user.getPassword().equals(password))
            {
                return user;
            }
        }
        System.out.println("Incorrect Credentials");
        return null;
    }
        */

}
