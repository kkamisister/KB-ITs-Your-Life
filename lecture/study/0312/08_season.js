/**
 * 계절 알아맞추기
 * 3,4,5월 : 봄
 * 6,7,8월 : 여름
 * 9,10,11월 : 가을
 * 12,1,2월 : 겨울
 */

let month = 12 //월을 입력받기 위한 변수

switch (month) {
  case 3:
  case 4:
  case 5:
    console.log('봄입니다.')
    break
  case 6:
  case 7:
  case 8:
    console.log('여름입니다.')
    break
  case 9:
  case 10:
  case 11:
    console.log('가을입니다.')
    break
  default:
    console.log('겨울입니다.')
}
