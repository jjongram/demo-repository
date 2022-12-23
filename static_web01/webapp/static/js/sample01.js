console.log("스크립트 파일 실행 확인!");

function fn1() {
    document.getElementById("result1").innerText = "함수 실행 완료!!";
}

function fn2(x, y) {
    var res = x + y;
    document.getElementById("result1").innerText = "x + y = " + res;
}