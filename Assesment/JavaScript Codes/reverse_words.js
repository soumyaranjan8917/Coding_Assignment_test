function reverseWords(sentence) {
    // Split the sentence into words
    let words = sentence.split(' ');

    // Reverse each word
    let reversedWords = words.map(word => {
        // Reverse the characters of the word
        let reversedWord = word.split('').reverse().join('');
        return reversedWord;
    });

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

function main() {
    const readline = require('readline-sync');
    const sentence = readline.question('Enter a sentence: ');

    const reversedSentence = reverseWords(sentence);
    console.log('Reversed sentence:', reversedSentence);
}

// Run the program
main();
