const fs = require('fs') // 파일 시스템 모듈 불러오기

// 읽기 스트림 생성
const read = fs.createReadStream('./readMe.txt', 'utf8')

// 쓰기 스트림 생성
const write = fs.createWriteStream('./writeMe.txt')

// 복사
read.pipe(write)
