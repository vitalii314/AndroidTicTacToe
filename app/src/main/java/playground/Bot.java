package playground;

/**
 * Created by user on 15.08.2016.
 */
public class Bot {
    public SimplePlayGround playGround;
    public boolean firstMove;


    public Bot(SimplePlayGround playGround) {
        this.playGround = playGround;
        firstMove = true;
    }


    public int[] makeMove() {
        int[] computerMove = new int[2];
        if ((firstMove) && playGround.getBoard().cells[1][1].content == Seed.CROSS) {
            computerMove[0] = 0;
            computerMove[1] = 0;
            firstMove = false;
            return computerMove;
        }

        if (playGround.getBoard().cells[1][1].content == Seed.EMPTY) {
            computerMove[0] = 1;
            computerMove[1] = 1;
            firstMove = false;
            return computerMove;

        }

        // checking if can win - to be optimized
        //horizontal oportunities
        for (int i = 0; i < playGround.getBoard().cells.length; i++) {
            int repeatNumber = 0;
            int numberOfColumn = 0;
            for (int j = 0; j < playGround.getBoard().cells[i].length; j++) {
                if (playGround.getBoard().cells[i][j].content == Seed.NOUGHT) {
                    repeatNumber++;
                }
                if (playGround.getBoard().cells[i][j].content == Seed.EMPTY) {
                    numberOfColumn = j;
                }

            }
            if ((repeatNumber == 2) &&
                    (playGround.getBoard().cells[i][numberOfColumn].content == Seed.EMPTY)) {
                computerMove[0] = numberOfColumn;
                computerMove[1] = i;
                firstMove = false;
                return computerMove;
            }
        }

        ////// vertical oportunities
        for (int i = 0; i < playGround.getBoard().cells.length; i++) {
            int repeatNumber = 0;
            int numberOfLine = 0;
            for (int j = 0; j < playGround.getBoard().cells[i].length; j++) {
                if (playGround.getBoard().cells[j][i].content == Seed.CROSS) {
                    repeatNumber++;
                }
                if (playGround.getBoard().cells[j][i].content == Seed.EMPTY) {
                    numberOfLine = j;
                }

            }
            if ((repeatNumber == 2) &&
                    (playGround.getBoard().cells[numberOfLine][i].content == Seed.EMPTY)) {
                computerMove[0] = i;
                computerMove[1] = numberOfLine;
                firstMove = false;
                return computerMove;
            }
        }


        // crossing oportunities
        int repeatNumber = 0;
        int number = 0;
        for (int i = 0; i < 3; i++) {
            if (playGround.getBoard().cells[i][i].content == Seed.NOUGHT) {
                repeatNumber++;
            }
            if (playGround.getBoard().cells[i][i].content == Seed.EMPTY) {
                number = i;
            }
        }
        if ((repeatNumber == 2) &&
                (playGround.getBoard().cells[number][number].content == Seed.EMPTY)) {
            computerMove[0] = number;
            computerMove[1] = number;
            firstMove = false;
            return computerMove;
        }

        int repeatNumber2 = 0;
        int number2 = 0;
        int number3 = 0;

        if (playGround.getBoard().cells[2][0].content == Seed.NOUGHT) {
            repeatNumber2++;
        }
        if (playGround.getBoard().cells[2][0].content == Seed.EMPTY) {
            number2 = 2;
            number3 = 0;
        }

        if (playGround.getBoard().cells[1][1].content == Seed.NOUGHT) {
            repeatNumber2++;
        }
        if (playGround.getBoard().cells[1][1].content == Seed.EMPTY) {
            number2 = 1;
            number3 = 1;
        }

        if (playGround.getBoard().cells[0][2].content == Seed.NOUGHT) {
            repeatNumber2++;
        }
        if (playGround.getBoard().cells[0][2].content == Seed.EMPTY) {
            number2 = 0;
            number3 = 2;
        }

        if ((repeatNumber2 == 2) &&
                (playGround.getBoard().cells[number2][number3].content == Seed.EMPTY)) {
            computerMove[0] = number3;
            computerMove[1] = number2;
            firstMove = false;
            return computerMove;
        }
        return computerMove; // to be deleted

    }

}


