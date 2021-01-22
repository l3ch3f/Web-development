const btnReset = document.getElementById("reset");
const btnPosNeg = document.getElementById("bereken[posneg]");
const btnModulo = document.getElementById("bereken[modulo]");
const btnDelen = document.getElementById("bereken[delen]");
const btnVermenigvuldig = document.getElementById("bereken[vermenigvuldig]");
const btnMin = document.getElementById("bereken[min]");
const btnPlus = document.getElementById("bereken[plus]");
const btnBereken = document.getElementById("bereken[bereken]");
const display = document.getElementById("display");
let oldNum = "";
let currentNum = "";

// Reset knop
const reset = () => {
    display.innerHTML = 0;
}

// positief negatief
const posneg = () => {
    oldNum = display.innerHTML;
    if (oldNum.includes("-")) {
        const newNum = (oldNum.replace("-", " "));
       display.innerHTML = newNum;     
    } else {
        newNum = "-" + oldNum;
        display.innerHTML = newNum;
    }
    
};


const parseNumber = (oldNum, currentNum) => {
    oldNum = parseFloat(oldNum);
    currentNum = parseFloat(currentNum);
}

const modulo = () => {
    oldNum = display.innerHTML;
    console.log(oldNum);
};

const delen = () => {
    alert("JAJA3");
};
const vermenigvuldig = () => {
    alert("JAJA4");
};
const min = () => {
    alert("JAJA5");
};
const plus = () => {
    alert("JAJA6");
};

const bereken = () => {
    alert("JAJA7"); 
};

// functies op roepen.
btnReset.addEventListener("click", reset);
btnPosNeg.addEventListener("click", posneg);
btnModulo.addEventListener("click", modulo);
btnDelen.addEventListener("click", delen);
btnVermenigvuldig.addEventListener("click", vermenigvuldig);
btnMin.addEventListener("click", min);
btnPlus.addEventListener("click", plus);
btnBereken.addEventListener("click", bereken);
