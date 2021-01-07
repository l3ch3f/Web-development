const startGameBtn = document.getElementById('start-game-btn');
const displayGame = document.getElementById('display[game]');
const ROCK = "ROCK";
const SCISSORS = "SCISSORS";
const PAPER = "PAPER";
const RESULT_DRAW = "DRAW";
const RESULT_PLAYER_WINS = "PLAYER_WINS";
const RESULT_COMPUTER_WINS = "COMPUTER_WINS";
let gameIsRunning = false;

startGameBtn.addEventListener('click', () => {
    if (gameIsRunning) {
        return;
    }
    gameIsRunning = true;
    console.log('Game is Starting...');
    gameDisplay();
});
   


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
        <img class="img" onclick="playerInput(this)" src=${rockUri}>
        <img class="img" onclick="playerInput(this)" src=${paperUri}>
        <img class="img" onclick="playerInput(this)" src=${scissorUri}>
        <div>
    `;
    const images = document.querySelectorAll("img");
    console.log(images);     
};

const playerInput = () => {
    alert('clicked');
};
