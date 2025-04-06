<template>
  <div class="container">
    <Header />
    <router-view />
  </div>
</template>

<script setup>
import { reactive, computed, provide } from 'vue'
import Header from '@/components/Header.vue'

// 초기 Todo 목록 정의
const states = reactive({
  todoList: [
    { id: 1, todo: 'ES6학습', desc: '설명1', done: false },
    { id: 2, todo: 'React학습', desc: '설명2', done: false },
    { id: 3, todo: 'ContextAPI 학습', desc: '설명3', done: true },
    { id: 4, todo: '야구경기 관람', desc: '설명4', done: false },
  ],
})

// Todo 추가
const addTodo = ({ todo, desc }) => {
  states.todoList.push({ id: new Date().getTime(), todo, desc, done: false })
}

// Todo 수정
const updateTodo = ({ id, todo, desc, done }) => {
  let index = states.todoList.findIndex((todo) => todo.id === id)
  states.todoList[index] = { ...states.todoList[index], todo, desc, done }
}

// Todo 삭제
const deleteTodo = (id) => {
  let index = states.todoList.findIndex((todo) => todo.id === id)
  states.todoList.splice(index, 1)
}

// 완료 여부 토글
const toggleDone = (id) => {
  let index = states.todoList.findIndex((todo) => todo.id === id)
  states.todoList[index].done = !states.todoList[index].done
}

// 자식 컴포넌트에 상태와 메서드 주입
provide(
  'todoList',
  computed(() => states.todoList),
)
provide('actions', { addTodo, deleteTodo, toggleDone, updateTodo })
</script>
