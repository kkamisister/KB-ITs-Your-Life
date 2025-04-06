fs = require('fs')

const data = fs.readFileSync('./example.txt', 'uft8')

if (fs.existSync('text-1.txt')) {
  console.log('file already exist')
} else {
  fs.writeFileSync('./text-1.txt', data)
}
