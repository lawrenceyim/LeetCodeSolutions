/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    let value = 0;
    for (let i = 0; i < s.length; i++) {
        if (s[i] == "I") {
            if (i == s.length - 1) {
                value += 1;
            } else if (s[i + 1] == "V") {
                value += 4;
                i++;
            } else if (s[i + 1] == "X") {
                value += 9;
                i++;
            } else value += 1;
        } else if (s[i] == "X") {
            if (i == s.length - 1) {
                value += 10;
            } else if (s[i + 1] == "L") {
                value += 40;
                i++;
            } else if (s[i + 1] == "C") {
                value += 90;
                i++;
            } else value += 10;
        } else if (s[i] == "C") {
            if (i == s.length - 1) {
                value += 100;
            } else if (s[i + 1] == "D") {
                value += 400;
                i++;
            } else if (s[i + 1] == "M") {
                value += 900;
                i++;
            } else value += 100;
        } else {
            value += getValue(s[i]);
        }
    }
    return value;
};

function getValue(ch) {
    if (ch == "I") return 1;
    else if (ch == "V") return 5;
    else if (ch == "X") return 10;
    else if (ch == "L") return 50;
    else if (ch == "C") return 100;
    else if (ch == "D") return 500;
    else if (ch == "M") return 1000;
}