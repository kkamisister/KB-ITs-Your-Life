// 성공 시 resolve, 실패 시 reject
const p = new Promise((resolve, reject) => {
  setTimeout(() => {
    let num = Math.random()

    //이건 내가 정한 실패 조건
    if (num >= 0.8) {
      // 실패 시 실행될 reject
      reject(`생성된 숫자가 0.8이상임 - ${num}`)
    } else {
      // 성공 시 실행될 resolve
      resolve(num)
    }
  }, 2000)
})

// p 결과가 성공 -> resolve 실행 -> then
p.then((result) => {
  console.log('처리 결과 : ', result)

  // p 결과가 실패 -> reject 실행 -> catch
}).catch((error) => {
  console.log('오류 : ', error)
})

console.log('## Promise 객체 생성!')
