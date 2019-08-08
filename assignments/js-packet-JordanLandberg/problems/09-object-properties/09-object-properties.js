/* 9. Object Properties
Define function objectProperties(someObj)
Print every property and it's value. */
function objectProperties(someObj) {
    let entries = Object.entries(someObj); // transforms an object into an array with key,value pairs.
    for (const [property, value] of entries) {
        console.log(`A property is: ${property} with a value of: ${value}`);
    }
}
let jordan = {
    name: 'Jordan',
    profession: 'Software Developer',
    degreeType: 'Bachelors',
    completedHighSchool: true,
    age: 22
};

let blake = {
    name: 'Blake',
    profession: 'Senior Trainer',
    degreeType: 'Bachelors', //?
    completedHighSchool: true,
    age: 25 //?
};
objectProperties(jordan);
console.log();
objectProperties(blake);