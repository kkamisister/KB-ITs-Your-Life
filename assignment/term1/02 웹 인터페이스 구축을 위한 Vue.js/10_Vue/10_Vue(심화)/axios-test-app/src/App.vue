<template></template>

<script setup>
import axios from 'axios'

// API 경로 설정
const listUrl = '/api/todos'
const todoUrlPrefix = '/api/todos/'

// API 요청 함수
const requestAPI = () => {
  let todoList = []

  // 전체 Todo 리스트 요청
  axios
    .get(listUrl)
    // then catch
    .then((response) => {
      todoList = response.data
      console.log('# TodoList : ', todoList)

      // id가 1인 todo가 있는지 확인
      const todoId1 = todoList.find((todo) => todo.id === '1')
      if (todoId1) {
        // id가 1인 todo 상세 요청
        return axios.get(todoUrlPrefix + 1)
      } else {
        // 없으면 에러 던지기
        throw new Error('없음')
      }
    })
    .then((response) => {
      // id가 1인 todo 출력
      console.log(response.data)
    })
    .catch((error) => {
      // 에러 처리
      console.error(error)
    })
}

// 함수 실행
requestAPI()
</script>
