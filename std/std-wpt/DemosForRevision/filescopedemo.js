// Scope.js

var fileScope = "Can be accessed anywhere in the file";
console.log("at line no 4 " + fileScope);

function doSomething() {
    var localScope = "Can only be accessed inside this function";
    console.log("at line no 8 " + localScope);

    //fileScope = "Can be accessed in the function too!";
    console.log("at line no 11 " + fileScope);
}
doSomething();
// This will result in an error because the variable does not exist
// outside the function.
console.log("at line no 17 " + localScope);
