package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{
    private final Logger _log = LoggerFactory.getLogger(HumanPlayer.class.getName());
    private final Scanner scan = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        long number = -1;
        while (number==-1){
            try {
                number = Long.parseLong(scan.nextLine());
            }catch (Exception e){
                _log.log("Error ! Message : "+e.getMessage());
            }
        }

        _log.log("The user give the number "+number);
        return number;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            _log.log("The guess number is lower !");
            System.out.println("The guess number is lower !");
        }else{
            _log.log("The guess number is greater");
            System.out.println("The guess number is greater");
        }
    }
}
