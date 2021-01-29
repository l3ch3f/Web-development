const btnReset = document.getElementById("reset");
const btnPosNeg = document.getElementById("bereken[posneg]");
const btnModulo = document.getElementById("bereken[modulo]");
const btnDelen = document.getElementById("bereken[delen]");
const btnVermenigvuldig = document.getElementById("bereken[vermenigvuldig]");
const btnMin = document.getElementById("bereken[min]");
const btnPlus = document.getElementById("bereken[plus]");
const btnBereken = document.getElementById("bereken[bereken]");
const btnIsFloat = document.getElementById("cijfer[.]");
const display = document.getElementById("display");
let oldNum = "";
let currentNum = "";
let currentValue = [];

const removeOperator = () => {
    btnDelen.classList.remove("operation");
    btnModulo.classList.remove("operation");
    btnMin.classList.remove("operation");
    btnVermenigvuldig.classList.remove("operation");
    btnPlus.classList.remove("operation");
};

const resetOperation = () => {
    isModulo = false;
    isDelen = false;
    isVermenigvuldig = false;
    isPlus = false;
    isMin = false;
    removeOperator();
};


// Reset knop
const reset = () => {
    display.innerHTML = 0;
    btnReset.querySelector("span").innerHTML="AC";
    resetOperation();
};

reset()
// positief negatief
const posneg = () => {
    oldNum = display.innerHTML;
    if (oldNum.includes("-")) {
        const newNum = oldNum.replace("-", " ");
        display.innerHTML = newNum;
    } else {
        newNum = "-" + oldNum;
        display.innerHTML = newNum;
    }
};



// functies op roepen.
btnReset.addEventListener("click", reset);
btnPosNeg.addEventListener("click", posneg);

