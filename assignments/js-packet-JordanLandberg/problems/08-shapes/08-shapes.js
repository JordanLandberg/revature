/* 8. Shapes
Define function: printShape(shape, height, character)
shape is a String and is either "Square", "Triangle", "Diamond".
height is a Number and is the height of the shape. Assume the number is odd.
character is a String that represents the contents of the shape. Assume this String contains just one character.
Use a switch statement to determine which shape was passed in.
Use the console.log function to print the desired shape.
Example for printShape("Square", 3, "%");
%%%
%%%
%%%
Example for printShape("Triangle", 3, "$");
$
$$
$$$
Example for printShape("Diamond", 5, "*");
  *
 ***
*****
 ***
  * 
*/
function printShape(shape, height, character) {
    switch (shape.toLowerCase()) {
        case 'square':
            for (let i = 0; i < height; i++) {
                console.log(character.repeat(height));
            }
            break;
        case 'triangle':
            for (let i = 1; i <= height; i++) {
                console.log(character.repeat(i));
            }
            break;
        case 'diamond':
            let count = height * 2 - 1;
            let spaces = parseInt((height/2).toFixed(0)) - 1;
            for (let i = 1; i <= height*2; i+=2) {
                if(i >= height){
                    console.log(' '.repeat(spaces) + character.repeat(count));
                    spaces++;
                } else{
                    console.log(' '.repeat(spaces) + character.repeat(i));
                    spaces--;
                }
                count-=2;
            }
            break;

        default:
            break;
    }
}
printShape("Square", 3, "%");
printShape("Triangle", 3, "$");
printShape("Diamond", 11, "*");