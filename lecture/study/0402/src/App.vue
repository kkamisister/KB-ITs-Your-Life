<script setup>
import FilterContainer from './components/FilterContainer.vue'
import HeaderLayout from './components/HeaderLayout.vue'
import InputContainer from './components/InputContainer.vue'
import TodoItem from './components/TodoItem.vue'
import SummaryContainer from './components/SummaryContainer.vue'
</script>

<template>
  <HeaderLayout title="작심" />
  <InputContainer />
  <FilterContainer />
  <ul class="todo-list">
    <TodoItem />
    <TodoItem />
    <TodoItem />
    <TodoItem />
  </ul>
  <SummaryContainer />
</template>

<style scoped>
.todo-list {
  margin: var(--space-l) auto !important;
}
</style>
