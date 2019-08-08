/* 10 Object Creation
Create an object using an object literal, constructor function, and es6 class.
The object should have the fields name and age.*/

//Creating an object using an object literal.
let dog = {
    name: 'Daffy',
    age: 13
};

//Creating an object using a function.
function Animal(name, age){
    this.name = name;
    this.age = age;
};
let cat = new Animal('Tiger', 18);

//Creating an object using an ES6 class.
class Mother{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
}
let mom = new Mother('Allison', 45);

//Printing the objects created with an object literal, a constructor function and an ES6 class.
console.log(dog);
console.log();
console.log(cat);
console.log();
console.log(mom);
