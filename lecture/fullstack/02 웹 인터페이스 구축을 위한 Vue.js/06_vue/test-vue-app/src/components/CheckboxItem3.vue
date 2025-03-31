<template>
  <li><input type="checkbox" :checked="idol.checked" />{{ idol.name }}</li>
</template>

<script>
import Idol from '../Idol'
export default {
  name: 'CheckboxItem3',
  props: { idol: Idol },
  created() {
    this.idol.checked = true
  },
}
</script>

<style scoped></style>
