fs = require('fs')

const data = fs.readFileSync('./example.txt', 'uft8')
fs.writeFileSync('./text 1.txt', data)
