let arr = [10, 20, 30, 40]
// console.log(arr[0])
// console.log(arr[1])

// let a1 = arr[0]
// let a2 = arr[1]

let [a1, a2, a3] = arr

console.log(a1)
console.log(a2)
console.log(a3)

let person = { name: '홍길돋', age: 20 }
let { name: n, age: a } = person

console.log(n)
console.log(a)
