function sortDescending(arr) {
    return arr.sort((a, b) => b - a);
}

function main() {
    const array = [5, 2, 8, 1, 4];
    console.log('Original array:', array);

    const sortedArray = sortDescending(array);
    console.log('Array sorted in descending order:', sortedArray);
}

// Run the program
main();
