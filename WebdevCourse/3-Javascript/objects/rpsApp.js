const startGameBtn = document.getElementById('start-game-btn');
const displayGame = document.getElementById('display[game]');
const ROCK = "ROCK";
const SCISSORS = "SCISSORS";
const PAPER = "PAPER";
const RESULT_DRAW = "DRAW";
const RESULT_PLAYER_WINS = "PLAYER_WINS";
const RESULT_COMPUTER_WINS = "COMPUTER_WINS";
let gameIsRunning = false;



// get playerinput
const playerInput = (obj) => {
    const selection = obj.id.toUpperCase();
    const playerChoice = selection;
    const computerChoice = computerInput();
    let winner;
    if (playerChoice) {
        winner = getWinner(computerChoice, playerChoice);
    } else {
        winner = getWinner(computerChoice);
    }

    let message = `You picked ${playerChoice}, computer picked ${computerChoice}, therefore you `;
    if (winner === RESULT_DRAW) {
        message = message + "had a draw.";
    } else if (winner === RESULT_PLAYER_WINS) {
        message = message + "Won!!!";
    } else {
        message = message + "LOST!!!!!!!! try again?!";
    }

    alert(message);
    gameIsRunning = false;
};

// radomize computer input
const computerInput = () => {
    const randomValue = Math.random();
    if (randomValue < 0.34) {
        return ROCK;
    } else if (randomValue < 0.67 ) {
        return PAPER;
    } else {
        return SCISSORS;
    }
};


// start spel display
const gameDisplay = () => {
    const rockUri =
        '"https://3dwarehouse.sketchup.com/warehouse/v1.0/publiccontent/fb61414e-e006-4270-a68a-7a083663b905"';
    const paperUri =
        '"https://i0.wp.com/harmonikreasi.com/wp-content/uploads/2020/07/Paper-source-CellMark.jpg?fit=1024%2C777&ssl=1"';
    const scissorUri =
        '"https://upload.wikimedia.org/wikipedia/commons/7/76/Pair_of_scissors_with_black_handle%2C_2015-06-07.jpg"';
    displayGame.innerHTML = `
        <h1 >Choose Rock, Paper or Scissors</h1>
        <div class="container d-flex justify-content-center">
        <img class="img" onclick="playerInput(this)" src=${rockUri} id="rock">
        <img class="img" onclick="playerInput(this)" src=${paperUri} id="paper">
        <img class="img" onclick="playerInput(this)" src=${scissorUri} id= "scissors">
        <div>
    `;
    
};
// uitslag bepalen:
const getWinner = (cChoice, pChoice) => {
   if (cChoice === pChoice) {
       return RESULT_DRAW;
   } else if (
       (cChoice === ROCK && pChoice === PAPER) ||
       (cChoice === PAPER && pChoice === SCISSORS) ||
       (cChoice === SCISSORS && pChoice === ROCK)
   ) {
       return RESULT_PLAYER_WINS;
   } else {
       return RESULT_COMPUTER_WINS;
   }
};

startGameBtn.addEventListener("click", () => {
    if (gameIsRunning) {
        return;
    }
    gameIsRunning = true;
    console.log("Game is Starting...");
    gameDisplay();  
    
});
