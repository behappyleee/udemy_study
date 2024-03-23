const fs = require("fs")

console.log("1")

// 사실 비동기 적으로 동기화를 함
// 이 파일을 읽는 동안 실질적으로 Block 이됨 왜냐하면 동기적으로 작동이 되기 때문에 !
// Main Event Loop 는 해당 함수를 실행하는동안 막혀있음 ===> 조심해야 함 !!
// const res = fs.readFileSync("test.txt")

// 동기적이기에 Printing
/**
 *    1
 *    file : lorem
 *    2  
 */

// 비동기 방식은 readFile 임
// 작업이 끝나면 console.log 를 찍어 줌 !
// Callback 함수의 매개변수는 error 와 data 임 !
// 비동기 적으로 작동이 됨 !비동기 실행은 어디서나 이루어짐 !
fs.readFile("test.txt", (err, data) => console.log(data.toString()))

// 비동기 방식 Printing
/** 
 *  1
 *  2
 *  lorem
 * 
*/

// console.log("file : " + res)
console.log("2")



