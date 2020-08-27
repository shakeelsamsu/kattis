const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', (line) => {
    var s = parseInt(line);
    console.log(s + ':');
    for(var i = 2; i < s; ++i) {
        if((s - i) % (i + i - 1) == 0) {
            console.log((i)+','+(i-1));
        }
        else if((s - i - i + 1) % (i + i - 1) == 0) {
            console.log((i)+','+(i-1));
        }
        if((s - i) % (i) == 0) {
            console.log((i)+','+(i));
        }
    }
});
    