// Use the provided index.html
// -----------------------------------------------------------------------------------

// 1. USA
// Define function getUSA()
// Find the html element that contains "USA".
// Print that element's contents.
function getUSA() {
    const h1 = document.getElementsByTagName('h1')[0];
    const usa = h1.children[1];
    console.log(usa.innerText);
};
getUSA();

// 2. Sales
// Define function getPeopleInSales()
// Print the names of all the people in the sales department.
function getPeopleInSales() {
    const table = document.getElementsByTagName('table')[0];
    for (let i = 1; i < 7; i++) {
        const row = table.getElementsByTagName('tr')[i];
        const td = row.getElementsByTagName('td')[1].innerText;
        if (td === 'Sales') {
            console.log(row.children[0].innerText)
        }
    }
}
getPeopleInSales();

// 3. Click Here
// Define function getAnchorChildren()
// Find all anchor elements with a <span> child.
// Print the contents of <span>
function getAnchorChildren(event) {
    const anchor = document.getElementsByTagName('a');
    for (let i = 0; i < anchor.length; i++) {

        let span = anchor[i].getElementsByTagName('span')[0];
        if (span) {
            console.log(span.innerText);
        }
    }
}
getAnchorChildren();


// 4. Hobbies
// Define function getHobbies()
// Find the selected 'hobby' in the select element.
// Print the value and the contents.
function getHobbies() {
    const select = document.getElementsByTagName('select')[1];
    const options = select.getElementsByTagName('option');
    for (let i = 0; i < options.length; i++) {
        if (options[i].attributes[1] && options[i].attributes[1].value) {
            console.log(options[i].innerText);
        }
    }
}
getHobbies();

// 5. Custom Attribute
// Define function getCustomAttribute()
// Find all elements with "data-customAttr" attribute
// Print the value of the attribute.
// Print the element that has the attribute.
function getCustomAttribute() {
    const elements = document.querySelectorAll('[data-customAttr]')
    for (let i = 0; i < elements.length; i++) {
        console.log(elements[i].getAttribute('data-customAttr'));
    }
}
getCustomAttribute();


// 6. Sum Event
// Regarding these elements:
// 	<input id="num1" class="nums" type="text"/>
// 	<input id="num2" class="nums" type="text"/>
// 	<h3>Sum: <span id="sum"></span></h3>  
// Define onchange event handler.
// Add <input> element values.
// Put the sum in the <span> element.4
// If values cannot be added, put "Cannot add" in the <span> element

const sum = document.getElementById('sum');
const num1 = document.getElementById('num1');
const num2 = document.getElementById('num2');
let value1 = '';
let value2 = '';
let numsum;
const checkValue = function (value) {
    if (value) {
        numsum = +value1 + +value2;
        sum.innerText = numsum;
    } else {
        sum.innerText = 'Cannot add';
    }
}
num1.addEventListener('change', () => {
    value1 = parseInt(num1.value);
    checkValue(value1);
});
num2.addEventListener('change', () => {
    value2 = parseInt(num2.value);
    checkValue(value2);
});

// 7. Skills Event
// When user selects a skill, create an alert with a message similar to:
// 	"Are you sure CSS is one of your skills?"
// NOTE: no alert should appear when user deselects a skill.
// Note: Try bootstrap model rather then alert

const skillSelector = document.getElementsByName('skills');
for (let i = 0; i < skillSelector.length; i++) {
    skillSelector[i].addEventListener('change', () => {
        const skill = skillSelector[i].value;
        alert(`Are you sure ${skill} is one of your skills?`);
    })
};

// 8. Favorite Color Event
// NOTE: This is regarding the favoriteColor radio buttons.
// When a user selects a color, create an alert with a message similar to:
// 	"So you like green more than blue now?"
// In this example, green is the new value and blue is the old value.
// Make the background color (of all favoriteColor radio buttons) the newly selected favoriteColor

const colors = document.getElementsByName('favoriteColor');
let oldColor;
let newColor = '';
const favColors = document.getElementsByClassName('favoriteColorDiv');
for (let i = 0; i < colors.length; i++) {
    colors[i].addEventListener('change', () => {
        newColor = colors[i].value;
        if (oldColor) {
            alert(`So you like ${newColor} more than ${oldColor} now?`);
        } else {
            alert(`So you like ${newColor}?`);
        }
        for (favColor of favColors) {
            favColor.style.background = newColor;
        }
        oldColor = newColor;
    });
};

// 9. Show/Hide Event
// When user hovers over an employees name:
// 	Hide the name if shown.
// 	Show the name if hidden.
//  Note: Might want to just change color of text to hide the element

const empNames = document.getElementsByClassName('empName');

let oldName = [];
for (let i = 0; i < empNames.length; i++) {
    empNames[i].addEventListener('mouseenter', () => {
        if (!oldName[i]) {
            oldName[i] = empNames[i].innerText;
            empNames[i].innerText = '';
        } else {
            empNames[i].innerText = oldName[i];
            oldName[i] = '';
        }
    })
}

// 10. Current Time
// Regarding this element:
// 	<h5 id="currentTime"></h5>
// Show the current time in this element in this format: 9:05:23 AM
// The time should be accurate to the second without having to reload the page.

const currentTimeSelected = document.getElementById('currentTime');
const showTime = function () {
    let currentTime = new Date();
    let currentHour = currentTime.getHours();
    let currentMinute = currentTime.getMinutes();
    let currentSecond = currentTime.getSeconds();
    if (currentHour > 12) {
        currentHour -= 12;
        timeOfDay = 'PM';
    } else {
        timeOfDay = 'AM';
    }
    if (currentSecond < 10) {
        currentSecond = '0' + currentSecond;
    }
    if (currentMinute < 10) {
        currentMinute = '0' + currentMinute;
    }
    let newCT = `${currentHour}:${currentMinute}:${currentSecond} ${timeOfDay}`
    currentTimeSelected.innerText = newCT;
};
setInterval(showTime, 1000);

// 11. Delay
// Regarding this element:
// 	<p id="helloWorld">Hello, World!</p>
// Three seconds after a user clicks on this element, change the text to a random color.

const helloWorld = document.getElementById('helloWorld');
helloWorld.addEventListener('click', () => {
    setTimeout(randomColor, 3000);
})
function getRandomColor() {
    var letters = '0123456789ABCDEF';
    var color = '#';
    for (var i = 0; i < 6; i++) {
        color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
}
function randomColor() {
    let color = getRandomColor();
    helloWorld.style.color = color;
}

// 12. Walk the DOM
// Define function walkTheDOM(node, func)
// This function should traverse every node in the DOM. Use recursion.
// On each node, call func(node).

function func(node) {
    for (let i = 0; i < node.length; i++) {
        func(node[i].children);
        console.log(node[i].nodeName)
    }
}
let test = document.getElementsByTagName('html');
func(test);