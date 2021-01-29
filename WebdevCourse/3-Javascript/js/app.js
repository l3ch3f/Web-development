const input = (obj) => {
    const inputs = obj.querySelector("span").innerHTML;
    // voor de reset 
    
    if (display.innerHTML == 0) {
        currentValue = [];
    } else if (
        currentValue.includes("modulo") ||
        currentValue.includes("plus") ||
        currentValue.includes("min") ||
        currentValue.includes("vermenigvuldig") ||
        currentValue.includes("delen") 
        ) {
            currentValue = [];
        }
    btnReset.querySelector("span").innerHTML = "C"
    currentValue.push(inputs);
    currentNum = currentValue.join("");
    display.innerHTML = currentNum;
};
const removeOperator = () => {
    btnDelen.classList.remove('operation');
    btnModulo.classList.remove('operation');
    btnMin.classList.remove('operation');
    btnVermenigvuldig.classList.remove('operation');
    btnPlus.classList.remove('operation');
}

// To check if other operator is pushed
const checkOperator = () => {
    if (
        currentValue.includes("delen") ||
        currentValue.includes("modulo") ||
        currentValue.includes("min") ||
        currentValue.includes("vermenigvuldig") ||
        currentValue.includes("plus")
    ) {
        removeOperator();
        resetOperation();
    }
}

const modulo = () => {
    checkOperator();
    oldNum = parseFloat(display.innerHTML);
    isModulo = true;
    currentValue.push("modulo");
    btnModulo.classList.toggle('operation');
    return oldNum;
};

const delen = () => {
    checkOperator(); 
    oldNum = parseFloat(display.innerHTML);
    isDelen = "true";
    currentValue.push("delen");
    btnDelen.classList.toggle('operation')
    return oldNum;
};
const vermenigvuldig = () => {
    checkOperator();
    oldNum = parseFloat(display.innerHTML);
    isVermenigvuldig = "true";
    currentValue.push("vermenigvuldig");
    btnVermenigvuldig.classList.toggle('operation')
    return oldNum;
};
const min = () => {
    checkOperator();
    oldNum = parseFloat(display.innerHTML);
    isMin = "true";
    currentValue.push("min");
    btnMin.classList.toggle('operation')
    return oldNum;
};
const plus = () => {
    checkOperator();
    oldNum = parseFloat(display.innerHTML);
    isPlus = "true";
    currentValue.push("plus");
    btnPlus.classList.toggle('operation')
    return oldNum;
};

const bereken = () => {
    currentNum = parseFloat(display.innerHTML);
    if (isModulo) {
        display.innerHTML =(oldNum % currentNum);
    } else if (isDelen) {
        display.innerHTML = (oldNum / currentNum).toFixed(2);
    } else if (isVermenigvuldig) {
        display.innerHTML = (oldNum * currentNum);
    } else if (isPlus) {
        display.innerHTML = (oldNum + currentNum);
    } else if (isMin) {
        display.innerHTML = (oldNum - currentNum);
    }
    currentValue = [];
    
};
btnModulo.addEventListener("click", modulo);
btnDelen.addEventListener("click", delen);
btnVermenigvuldig.addEventListener("click", vermenigvuldig);
btnMin.addEventListener("click", min);
btnPlus.addEventListener("click", plus);
btnBereken.addEventListener("click", bereken);