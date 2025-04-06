// 1)
let obj1 = { name: '박문수', age: 29 }
// obj1의 키 값을 obj2로 복사
let obj2 = { ...obj1 }
// obj2의 email 속성 추가
obj2.email = 'mspark@gmail.com'
console.log(obj2)

// 2)
let arr1 = [100, 200, 300]
// 전개 연산자로 arr1 값 복사
let arr2 = ['hello', ...arr1, 'world']
console.log(arr1)
console.log(arr2)
