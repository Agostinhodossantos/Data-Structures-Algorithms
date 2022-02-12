// Create a function that reverses a string:

function reverse(str) {
    let reversedStr = [];
    for(let i = str.length; i >= 0; i--) {
        reversedStr.push(str[i])
    }
    return reversedStr.toString()
}

console.log(reverse('agostinho'))