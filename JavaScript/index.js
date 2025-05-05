var name = "anil";

console.log(name);

var name = "sunil" // we can redeclare the var type of variable name

console.log(name); {
    var id = "101"
}
console.log(id); // we can get the variable outside the block scope


let b = "hello"; // we can declare only one time let type variables otherwise it throws an error
console.log(b);

{
    let j1 = 10;
    console.log(j1);

}

// we dont access let type of variables in outside the block scope

b = "bye";
console.log(b); // we can reassign the varables in the let type variables

// const clg;
// we dont write only declaration in one linene

const clg = "UBDT"
console.log(clg);

{
    const k = "Anil";
    console.log(k);
}
confirm("Are you sure you want to exit?")

alert("Wear helmet")
    // we dont access const type variable outside the block scope

let enterName = prompt("enter the name");
console.log(enterName);