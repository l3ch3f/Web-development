let enteredValue = [];
const input = (obj) => {
    const inputs = obj.querySelector("span").innerHTML;
    // voor de reset
    if (display.innerHTML == 0) {
        enteredValue = [];
    }
    enteredValue.push(inputs);
    currentNum = enteredValue.join("");
    display.innerHTML = currentNum;
    ;
};
