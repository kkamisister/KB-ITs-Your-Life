<template>
  <li><input type="checkbox" :checked="checked" />{{ idol.name }}</li>
</template>

<script>
export default {
  name: 'CheckboxItem2',
  props: ['idol'],
  created() {
    this.idol.checked = true
  },
  // data() {
  //   return {
  //     checked: false
  //   },
  // },
}
</script>

<style scoped></style>
