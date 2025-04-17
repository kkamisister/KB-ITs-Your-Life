// 결합
const path = require('path')
const fullPath = path.join('some', 'work', 'ex.txt')
console.log(fullPath)

// 경로 확장
const dir = path.dirname(__filename)
console.log(`경로: ${dir}`)

// 확장자 포함
const fn = path.basename(__filename)
console.log(`파일 이름(확장명 포함): ${fn}`)

// 확장자 제외
const fn2 = path.basename(__filename, '.js')
console.log(`파일 이름(확장자 제외): ${fn2}`)

// 현재 파일 확장자
const ext = path.extname(__filename)
console.log(`파일 확장자: ${ext}`)

// 현재 파일 경로 요소 전체
const parsedPath = path.parse(__filename)
console.log(parsedPath)
