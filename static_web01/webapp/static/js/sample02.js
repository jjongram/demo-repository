function createList() {
    var items = prompt("쉼표를 구분문자로 사용하여 태그명을 작성하세요.");
    var arr = items.split(",");
    console.log(arr);
    var result = document.getElementById("result1");
    for(let i = 0; i < arr.length; i++) {
        result.innerHTML += "<li>" + arr[i] + "</li>";
        console.log(typeof(arr[i]));
    }
}
//      <select name="" id="">
//             <option value="">1월</option>
//             <option value="">2월</option>
//             <option value="">3월</option>
//             <option value="">4월</option>
//             <option value="">5월</option>
//             <option value="">6월</option>
//             <option value="">7월</option>
//             <option value="">8월</option>
//             <option value="">9월</option>
//             <option value="">10월</option>
//             <option value="">11월</option>
//             <option value="">12월</option>
//         </

function createMonth() {
    var now = new Date();
    var currentMonth = now.getMonth()+1;
    var results = document.getElementById("result2");
    var optionTags = "";
    for(let i = 1; i <= 12; i++) {
        if(currentMonth === i) {
            optionTags += "<Option selected>" + i+"월" + "</Option>"
        } else {
            optionTags += "<Option>" + i+"월" + "</Option>" ;
        }
    }
    results.innerHTML = "<select>" + optionTags + "</select>";
}