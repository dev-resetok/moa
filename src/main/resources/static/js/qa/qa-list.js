// 모달 처리
const modal = document.getElementById("profileModal");
const postWriteButton = document.getElementById("post-write-button"); // 작성하기 버튼
const span = document.getElementsByClassName("close")[0];
const defaultImage = "https://www.wishket.com/static/img/default_avatar_c.png";

// 신고하기 버튼 클릭 시 모달 열기
postWriteButton.onclick = () => {
    modal.style.display = "block";
};

// 모달의 닫기 버튼 클릭 시 모달 닫기
span.onclick = () => {
    modal.style.display = "none";
};

// 모달 외부 클릭 시 모달 닫기
window.onclick = (event) => {
    if (event.target == modal) {
        modal.style.display = "none";
    }
};

// "작성하기" 버튼 클릭 시 alert 실행 및 모달 닫기
const reportSubmitBtn = document.getElementById("reportSubmitBtn");

reportSubmitBtn.onclick = function () {
    alert("게시글 신고가 완료되었습니다.");
    modal.style.display = "none"; // 신고하기 버튼 클릭 후 모달 닫기
};

// "post-write-button" 버튼에 클릭 이벤트 리스너 추가
document.getElementById("post-write-button").addEventListener("click", (e) => {
    // 클릭 시 게시글 작성 페이지로 이동
    location.href = `/q&a_write.html/write?id=${qaPostDTO.id}`;
});
