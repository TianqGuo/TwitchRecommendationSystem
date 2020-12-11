//global
var globalvar = 2;
var person = {
    age : 40,
    name: "tian",
}

//object.property
console.log(person.age);

//scope
myfunction();

function myfunction() {
    var name = "tian"; // local variable
    console.log(name);
}

var a = 1;
var b = 2;
console.log(a + b);


