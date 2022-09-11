// BigO 표기법 - 자료구조에서 상당히 중요힘
// 빅오 표기법을 사용하여 여러가지 알고리즘을 표현
// BigO 의 핵심은 여러가지 코드를 일반적으로 서로 비교하고 성능을 평가하는 방법
// 코드의 성능을 얘기할 때는 정확한 전문용어를 사용하는 것이 중요
// 코드를 디버그 시 코드를 느리게 만드는 것을 이해하는 것이 중요

// EX
// 1 에서 부터 특정한 N 값 사이에 있는 모든 숫자들을 더하는 함수

// 1. 가장 기본 적인 방법
function addUpTo_1(n) {
    let total = 0;
    for(let i = 0; i<= n; i++) {
        total += i;
    }
    return total;
}

// 2. 수학적인 공식을 이용 
function addUpTo_2(n) {
    return n*(n+1)/2;
}

let f1_t1 = performance.now();
let totalTest_1 = addUpTo_1(1000000000);
let f1_t2 = performance.now();

console.log(`F1 함수 소요 시간 : ${(f1_t2 - f1_t1)/1000} seconds`)

console.log('6 TOTAL TEST :  ' + addUpTo_1(6));
console.log('10 TOTAL TEST : ' + totalTest_1);

let totalTest_2 = addUpTo_2(10);
console.log('6 TOTAL TEST :  ' + addUpTo_2(6));
console.log('10 TOTAL TEST : ' + totalTest_2);

// 어떤 코드가 더 나은지 ? 비교 기준은 더 빠른지 ... ?
// 메모리를 얼마나 사용을 하는 지 ... ? , 코드를 얼마나 쉽게 빨리 읽을 수 있는지... ??

// 코드가 실행하는데 걸리는 시간을 측정 
// 1. 내장되어있는 함수 (performance.now()) 를 사용 
// 기기마다 시간을 다른 방식으로 기록하기에 기계마다 시간을 믿기는 힘듦
// 똑같은 기계가 다른 시간을 기록할 수 도 있음 (완전히 믿기는 힘듦)
// 빠른 알고리즘에서는 정말 빠른 시간에 알고리즘이 실행 (정확한 시간 측정이 힘들 수 있음)

// --> 시간을 측정하여 알고리즘을 평가하는 것은 나쁜 방법은 아니지만 더 좋은 방법은 BigO 표기법을 이용하여 알고리즘을 비교

// --> 코드가 실행될 때 걸리는 정확한 시간을 초로 측정하는 것 보다는 대신에 컴퓨터가 처리해야 하는 연산 갯수를 카운트 함

// 2. 수학적인 공식을 이용
// 해당 알고리즘은 덧셈 / 곱셈 / 나눗셈  총 3가지 연산이 사용 됨 
// N의 크기에 상관없이 연산이 3번 이루어짐 
function addUpTo_4(n) {
    return n*(n+1)/2;
}

// 해당 알고리즘은 덧셈 연산만 사용이 됨 하지만 Loop 안에 있기에 N 이 5라고 하면 5번을 더하게 되는 것임
// 그래서 N이 5라면 5번을 더하고 N이 20 이면 20번을 더함, = 도 연산임 
// N 이 커질수록 갯수가 늘어남, i++ 도 연산에 포함  total = 0 도 연산에 포함, let i = 1, i<= n 도 연산에 포함  
// 모든 연산을 세는것은 쉬운 과정은 아님 
function addUpTo_3(n) {
    let total = 0;
    for(let i = 0; i<= n; i++) {
        total += i;
    }
    return total;
}

// 정확한 것은 중요한 갯수보다는 N 이 커질수록 복잡도가 증가를 한다는 추세가 중요함 (전체적인 그림을 파악하는 것이 중요) 







